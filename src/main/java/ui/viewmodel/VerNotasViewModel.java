package ui.viewmodel;

import java.util.List;
import java.util.stream.Collectors;

import org.uqbar.commons.model.annotations.Observable;

import dominio.Estudiante;
import dominio.RenglonTareas;

@Observable
public class VerNotasViewModel {

	private Estudiante unEstudiante;
	private List<RenglonTareas> renglonesTareas;
	
	public VerNotasViewModel(Estudiante unEstudiante) {
		
		this.renglonesTareas = 
				unEstudiante
				.getTareas()
				.stream()
				.map(t -> new RenglonTareas(t))
				.collect(Collectors.toList());
	}

	public List<RenglonTareas> getRenglonesTareas() {
		return renglonesTareas;
	}
}
