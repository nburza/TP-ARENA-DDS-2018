package dominio.repositorios;

import java.util.Collection;
import java.util.HashSet;

import dominio.Estudiante;
import dominio.exceptions.LegajoRepetidoException;

public class RepositorioDeEstudiantes {

	protected static Collection<Estudiante> estudiantes = new HashSet<>();
	
	public RepositorioDeEstudiantes() {}
	
	public Collection<Estudiante> getAllInstances() {
		
		return estudiantes;
	}	
	
	public void agregar(Estudiante unEstudiante) throws LegajoRepetidoException {
		
		if(this.yaExisteLegajo(unEstudiante)) {
			
			throw new LegajoRepetidoException("Ya existe un estudiante con este legajo");
		}
		else {
			
			estudiantes.add(unEstudiante);
		}
		
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
	
	private boolean yaExisteLegajo(Estudiante unEstudiante) {
		
		return estudiantes
				.stream()
				.anyMatch(estudiante -> estudiante.getLegajo().equals(unEstudiante.getLegajo()));
				
	}
}
