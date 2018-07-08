package dominio.repositorios;

import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;

import dominio.Estudiante;

public class RepositorioDeEstudiantes {

protected Collection<Estudiante> estudiantes = new HashSet<>();
	
	public Collection<Estudiante> getAllInstances() {
		
		return estudiantes;
	}	
	
	public void agregar(Estudiante unEstudiante) {
		
		estudiantes.add(unEstudiante);
	}
		
	public void borrar(Estudiante unEstudiante) {
		
		estudiantes.remove(unEstudiante);
	}
	
	public Estudiante buscarPorLegajo(String unLegajo) {
			
		return estudiantes
				.stream()
				.filter(estudiante -> estudiante.getLegajo().equals(unLegajo))
				.findFirst()
				.get();
	}
}
