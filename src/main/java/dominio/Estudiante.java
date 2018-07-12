package dominio;

import java.util.Collection;
import java.util.HashSet;
import dominio.Tarea;

public class Estudiante {
	
	private String nombre;
	private String apellido;
	private String legajo;
	private String usuarioGithub;
	private String pass;
	private Collection<Tarea> tareas = new HashSet<Tarea>();
	
	public Estudiante(	String nombre, String apellido, String legajo, 
						String usuarioGithub, String pass, 
						Collection<Tarea> tareas) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.legajo = legajo;
		this.usuarioGithub = usuarioGithub;
		this.pass = pass;
		this.tareas = tareas;
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
	
	public String getLegajo() {
		
		return legajo;
	}
	
	public void setLegajo(String legajo) {
		
		this.legajo = legajo;
	}
	
	public String getUsuarioGithub() {
		
		return usuarioGithub;
	}
	
	public void setUsuarioGithub(String usuarioGithub) {
		
		this.usuarioGithub = usuarioGithub;
	}
	
	public void agregarTarea(Tarea unaTarea) {
		
		this.tareas.add(unaTarea);
	}

	public Collection<Tarea> getTareas() {
		
		return this.tareas;

	}

	public void confirmarCambios(String nombre2, String apellido2, String usuarioGitHub2) {
		// TODO Auto-generated method stub
		this.nombre = nombre2;
		this.apellido = apellido2;
		this.usuarioGithub = usuarioGitHub2;
	}
	
	public String getPass() {
		return pass;
	}

	public boolean validarPass(String passIngresada) {
		return pass.equals(passIngresada);
	}
}
