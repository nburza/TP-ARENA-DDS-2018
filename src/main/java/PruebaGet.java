import java.util.List;

import comunicacion.StudentService;
import dominio.Asignacion;
import com.google.gson.Gson;

public class PruebaGet {

	public static void main(String[] args) throws Exception {

		String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho";
		
		Gson gson = new Gson();
		List<Asignacion> asignaciones = new StudentService().consultarAsignaciones(token);
		String json = gson.toJson(asignaciones);
		System.out.println(json);
		System.out.println(asignaciones.size());
	}

}
