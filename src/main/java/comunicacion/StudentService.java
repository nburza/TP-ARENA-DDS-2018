package comunicacion;
import java.io.InputStream;
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
import dominio.Asignacion;
import dominio.Estudiante;

public class StudentService {
	
	private HttpClient client = HttpClientBuilder.create().build();
	private Gson gson = new Gson();
	
	private static final String URL_ESTUDIANTE = "http://notitas.herokuapp.com/student";
	private static final String URL_ASIGNACIONES = "http://notitas.herokuapp.com/student/assignments";
	
	public void actualizarEstudiante(String token, Estudiante estudiante) throws Exception {
		HttpPut request = new HttpPut(URL_ESTUDIANTE);
		request.addHeader("Authorization", "Bearer " + token);
		String json = gson.toJson(estudiante);
		request.setEntity(new StringEntity(json, ContentType.APPLICATION_JSON));
		
		HttpResponse response = client.execute(request);
		int status = response.getStatusLine().getStatusCode();
		if (status != 201) {
			throw new RuntimeException("No se pudieron actualizar los datos del estudiante");
		}
	}
	
	public Estudiante consultarEstudiante(String token) throws Exception {
		HttpGet request = new HttpGet(URL_ESTUDIANTE);
		request.addHeader("Authorization", "Bearer " + token);
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
	
	public List<Asignacion> consultarAsignaciones(String token) throws Exception {
		HttpGet request = new HttpGet(URL_ASIGNACIONES);
		request.addHeader("Authorization", "Bearer " + token);
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
