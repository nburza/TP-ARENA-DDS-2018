package ui.viewmodel;

import java.util.List;
import java.util.stream.Collectors;

import org.uqbar.commons.model.annotations.Observable;

import dominio.Estudiante;

@Observable
public class VerNotasViewModel {

	@SuppressWarnings("unused")
	private Estudiante unEstudiante;
	private List<RenglonTareas> renglonesTareas;
	
	public VerNotasViewModel(Estudiante unEstudiante) {
		
		this.renglonesTareas = 
				unEstudiante
				.getAsignaciones()
				.stream()
				.map(t -> new RenglonTareas(t))
				.collect(Collectors.toList());
	}

	public List<RenglonTareas> getRenglonesTareas() {
		return renglonesTareas;
	}
}
