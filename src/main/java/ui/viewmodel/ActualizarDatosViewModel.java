package ui.viewmodel;

import java.util.Collection;

import org.uqbar.commons.model.annotations.Observable;

import dominio.Estudiante;
import dominio.Tarea;
import dominio.repositorios.RepositorioDeEstudiantes;

@Observable
public class ActualizarDatosViewModel {

	private Estudiante estudiante;

	private String nombre;
	private String apellido;
	private String legajo;
	private String usuarioGitHub;
	private Collection<Tarea> tareas;

	public ActualizarDatosViewModel(Estudiante estudiante) {

		this.estudiante = estudiante;
		this.nombre = estudiante.getNombre();
		this.apellido = estudiante.getApellido();
		this.legajo = estudiante.getLegajo();
		this.usuarioGitHub = estudiante.getUsuarioGithub();
		this.tareas = estudiante.getTareas();
	}

	public void actualizarDatos() {
		estudiante.confirmarCambios(this.nombre, this.apellido, this.usuarioGitHub);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getUsuarioGitHub() {
		return usuarioGitHub;
	}

	public void setUsuarioGitHub(String usuarioGitHub) {
		this.usuarioGitHub = usuarioGitHub;
	}

	public String getLegajo() {
		return legajo;
	}
}