package ui.viewmodel;

import org.uqbar.commons.model.annotations.Observable;

import comunicacion.StudentService;
import dominio.Estudiante;

@Observable
public class ActualizarDatosViewModel {

	private Estudiante estudiante;
	private String token;

	public ActualizarDatosViewModel(String token) throws Exception {

		this.estudiante = new StudentService().consultarEstudiante(token);
		this.token = token;
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
	
	public void guardarCambios() throws Exception {
		
		new StudentService().actualizarEstudiante(token, estudiante);
	}
}