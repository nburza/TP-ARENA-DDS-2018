import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.ClientProtocolException;

import comunicacion.StudentService;
import dominio.Asignacion;
import dominio.Estudiante;

import com.google.gson.Gson;

public class PruebaGet {

	public static void main(String[] args) throws Exception {

		//Peticiones peticiones = new  Peticiones();
		
		String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho";
		
		//peticiones.getEstudiante(token);
		
		//Estudiante estudiante = new Estudiante("Carlos", "Arano", "55664422", "elChiche", null, null);
		//peticiones.modificarEstudiante(token, estudiante);
		
		/*NotitasRestService nrs = new NotitasRestService();
		String output = nrs.getJsonStudent(token);
		System.out.println(output);
		
		String output2 = nrs.getJsonStudentAssignments(token);
		System.out.println(output2);*/
		
		Gson gson = new Gson();
		List<Asignacion> asignaciones = new StudentService().consultarAsignaciones();
		String json = gson.toJson(asignaciones);
		System.out.println(json);
		System.out.println(asignaciones.size());
	}

}
