package ui.viewmodel;

import java.util.Collection;

import org.uqbar.commons.model.annotations.Observable;

import dominio.Estudiante;
import dominio.Tarea;
import dominio.repositorios.RepositorioDeEstudiantes;

@Observable
public class ActualizarDatosViewModel {

	private Estudiante estudiante;

	public ActualizarDatosViewModel(Estudiante estudiante) {

		this.estudiante = estudiante;
	}

	public String getLegajo() {
		
		return estudiante.getLegajo();
	}
	
	public void setLegajo(String legajo) {
		
		estudiante.setLegajo(legajo);
	}
	public String getNombre() {
		
		return estudiante.getNombre();
	}

	public void setNombre(String nombre) {
		
		estudiante.setNombre(nombre);
	}

	public String getApellido() {
		
		return estudiante.getApellido();
	}

	public void setApellido(String apellido) {
		
		estudiante.setApellido(apellido);
	}

	public String getUsuarioGitHub() {
		return estudiante.getUsuarioGithub();
	}

	public void setUsuarioGitHub(String usuarioGitHub) {
		
		estudiante.setUsuarioGithub(usuarioGitHub);
	}
}