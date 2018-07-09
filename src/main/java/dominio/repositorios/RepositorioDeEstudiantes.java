package dominio.repositorios;

import java.util.Collection;
import java.util.HashSet;

import dominio.Estudiante;

public class RepositorioDeEstudiantes {

	private static RepositorioDeEstudiantes instancia;
	protected static Collection<Estudiante> estudiantes = new HashSet<>();
	
	private RepositorioDeEstudiantes() {}
	
	public static RepositorioDeEstudiantes getRepo() {
		if (instancia == null) {
			instancia = new RepositorioDeEstudiantes();
		}
		return instancia;
	}
	
	public Collection<Estudiante> getAllInstances() {
		
		return estudiantes;
	}	
	
	public static void agregar(Estudiante unEstudiante) {
		
		estudiantes.add(unEstudiante);
	}
		
	public static void borrar(Estudiante unEstudiante) {
		
		estudiantes.remove(unEstudiante);
	}
	
	public static Estudiante buscarPorLegajo(String unLegajo) {
			
		return estudiantes
				.stream()
				.filter(estudiante -> estudiante.getLegajo().equals(unLegajo))
				.findFirst()
				.get();
	}
}
