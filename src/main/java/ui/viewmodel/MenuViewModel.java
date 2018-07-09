package ui.viewmodel;

import org.uqbar.commons.model.annotations.Observable;

import dominio.Estudiante;

@Observable
public class MenuViewModel {
	
	private Estudiante estudiante;
	
	public MenuViewModel(Estudiante unEstudiante) {
		
		this.estudiante = unEstudiante;
	}
	
	public Estudiante getEstudiante() {
		
		return estudiante;
	}
}
