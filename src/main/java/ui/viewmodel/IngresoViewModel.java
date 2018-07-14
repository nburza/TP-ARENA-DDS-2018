package ui.viewmodel;

import org.uqbar.commons.model.annotations.Observable;

import dominio.repositorios.RepositorioDeEstudiantes;

import dominio.Estudiante;

@Observable
public class IngresoViewModel {

	private String legajo;
	private String pass;
	private Estudiante estudiante;
	private RepositorioDeEstudiantes repositorio;

	public IngresoViewModel(RepositorioDeEstudiantes repositorio) { 
		
		this.repositorio = repositorio;
	}

	public void buscarEstudiante(RepositorioDeEstudiantes repositorio) {

		estudiante = repositorio.buscarPorLegajo(legajo);
		// if(password es correcta)
	}

	public String getLegajo() {

		return legajo;
	}

	public void setLegajo(String legajo) {

		this.legajo = legajo;
	}

	public Estudiante getEstudiante() {

		return estudiante;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public RepositorioDeEstudiantes getRepo() {
		
		return this.repositorio;
	}
}