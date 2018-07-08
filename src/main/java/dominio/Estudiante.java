package dominio;

import java.util.Collection;
import java.util.HashSet;

public class Estudiante {
	
	private String nombre;
	private String apellido;
	private String legajo;
	private String usuarioGithub;
	private Collection<Tarea> tareas = new HashSet<Tarea>();
	
	public Estudiante(String nombre, String apellido, String legajo, String usuarioGithub, Collection<Tarea> tareas) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.legajo = legajo;
		this.usuarioGithub = usuarioGithub;
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
		return tareas;
	}
}
