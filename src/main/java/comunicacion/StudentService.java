package comunicacion;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import dominio.Asignacion;
import dominio.Estudiante;

public class StudentService {
	
	private HttpClient client = HttpClientBuilder.create().build();
	private Gson gson = new Gson();
	
	private static final String URL_ESTUDIANTE = "http://notitas.herokuapp.com/student";
	private static final String URL_ASIGNACIONES = "http://notitas.herokuapp.com/student/assignments";
	private static final String TOKEN = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho";
	
	public void actualizarEstudiante(Estudiante estudiante) throws Exception {
		HttpPut request = new HttpPut(URL_ESTUDIANTE);
		request.addHeader("Authorization", TOKEN);
		String json = gson.toJson(estudiante);
		request.setEntity(new StringEntity(json, ContentType.APPLICATION_JSON));
		
		HttpResponse response = client.execute(request);
		int status = response.getStatusLine().getStatusCode();
		if (status != 201) {
			throw new RuntimeException("No se pudieron actualizar los datos del estudiante");
		}
	}
	
	public Estudiante consultarEstudiante() throws Exception {
		HttpGet request = new HttpGet(URL_ESTUDIANTE);
		request.addHeader("Authorization", TOKEN);
		HttpResponse response = client.execute(request);
		
		int status = response.getStatusLine().getStatusCode();
		if (status != 200) {
			throw new RuntimeException("No se pudieron obtener los datos del estudiante");
		}
		
		InputStream content = response.getEntity().getContent();
		String json = IOUtils.toString(content);
		Estudiante estudiante = gson.fromJson(json, Estudiante.class);
		return estudiante;
	}
	
	public List<Asignacion> consultarAsignaciones() throws Exception {
		HttpGet request = new HttpGet(URL_ASIGNACIONES);
		request.addHeader("Authorization", TOKEN);
		HttpResponse response = client.execute(request);
		
		int status = response.getStatusLine().getStatusCode();
		if (status != 200) {
			throw new RuntimeException("No se pudieron obtener los datos del estudiante");
		}
		
		InputStream content = response.getEntity().getContent();
		String json = IOUtils.toString(content);
		AsignacionesContainer asignacionesContainer = gson.fromJson(json, AsignacionesContainer.class);
		List<Asignacion> asignaciones = asignacionesContainer.getAsignaciones();
		return asignaciones;
		
	}
	
}
