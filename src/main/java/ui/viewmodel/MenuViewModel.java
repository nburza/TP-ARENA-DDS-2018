package ui.viewmodel;

import org.uqbar.commons.model.annotations.Observable;

import dominio.Estudiante;
import dominio.repositorios.RepositorioDeEstudiantes;

@Observable
public class MenuViewModel {

	private String legajo;

	public MenuViewModel(String legajo) {

		this.legajo = legajo;
	}

	public Estudiante getEstudiante() {

		return RepositorioDeEstudiantes.buscarPorLegajo(legajo);
	}
}
