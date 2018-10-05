package ui.viewmodel;

import java.util.List;
import java.util.stream.Collectors;

import org.uqbar.commons.model.annotations.Observable;

import comunicacion.StudentService;
import dominio.Estudiante;

@Observable
public class VerNotasViewModel {

	private Estudiante unEstudiante;
	private List<RenglonTareas> renglonesTareas;
	
	public VerNotasViewModel(String token) throws Exception {
		
		this.renglonesTareas = 
				new StudentService().consultarAsignaciones()
				.stream()
				.map(t -> new RenglonTareas(t))
				.collect(Collectors.toList());
	}

	public List<RenglonTareas> getRenglonesTareas() {
		return renglonesTareas;
	}
}
