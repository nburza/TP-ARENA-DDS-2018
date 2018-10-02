package dominio;

import java.util.Collection;
import java.util.HashSet;

public class Estudiante {
	
	private String nombre;
	private String apellido;
	private String legajo;
	private String usuarioGithub;
	private String pass;
	private Collection<Asignacion> asignaciones = new HashSet<Asignacion>();
	
	public Estudiante(	String nombre, String apellido, String legajo, 
						String usuarioGithub, String pass, 
						Collection<Asignacion> asignaciones) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.legajo = legajo;
		this.usuarioGithub = usuarioGithub;
		this.pass = pass;
		this.asignaciones = asignaciones;
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
	
	public void agregarAsignacion(Asignacion unaAsignacion) {
		
		this.asignaciones.add(unaAsignacion);
	}

	public Collection<Asignacion> getAsignaciones() {
		
		return this.asignaciones;

	}

	public void confirmarCambios(String legajo2, String nombre2, String apellido2, String usuarioGitHub2) {
		// TODO Auto-generated method stub
		this.legajo = legajo2;
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
