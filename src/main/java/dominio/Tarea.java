package dominio;

import java.util.ArrayList;
import java.util.List;

import dominio.exceptions.LimiteDeNotasException;
import dominio.exceptions.NotaInvalidaException;

public class Tarea {
	
	protected String descripcion;
	protected TipoDeNota tipoDeNota;
	
	public Tarea(String descripcion, TipoDeNota tipoDeNota) {
		
		this.descripcion = descripcion;
		this.tipoDeNota = tipoDeNota;
	}
	
	public String getDescripcion() {
		
		return this.descripcion;
	}
	
	public TipoDeNota getTipoDeNota() {
		
		return this.tipoDeNota;
	}

	public boolean esNotaValida(String unaNota, Asignacion asignacion) {
		
		return this.tipoDeNota.esNotaValida(unaNota);
	}
}
