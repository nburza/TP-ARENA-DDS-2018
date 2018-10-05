package dominio;

import java.util.Collection;
import java.util.HashSet;

import com.google.gson.annotations.SerializedName;

public class Estudiante {
	
	@SerializedName("code")
	private String legajo;
	@SerializedName("first_name")
	private String nombre;
	@SerializedName("last_name")
	private String apellido;
	@SerializedName("github_user")
	private String usuarioGithub;
	@SerializedName("assignments")
	private Collection<Asignacion> asignaciones = new HashSet<Asignacion>();
	
	public Estudiante(	String nombre, String apellido, String legajo, 
						String usuarioGithub, String pass, 
						Collection<Asignacion> asignaciones) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.legajo = legajo;
		this.usuarioGithub = usuarioGithub;
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
}
