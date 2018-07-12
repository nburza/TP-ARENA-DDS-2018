package dominio;

import java.util.ArrayList;
import java.util.List;

import dominio.exceptions.LimiteDeNotasException;
import dominio.exceptions.NotaInvalidaException;

public class Tarea {
	
	protected String descripcion;
	protected List<String> notas = new ArrayList<String>();
	protected TipoDeNota tipoDeNota;
	
	public Tarea(String descripcion, TipoDeNota tipoDeNota) {
		
		this.descripcion = descripcion;
		this.tipoDeNota = tipoDeNota;
	}
	
	public String getDescripcion() {
		
		return this.descripcion;
	}
	public void agregarNota(String unaNota) throws NotaInvalidaException, LimiteDeNotasException {
		
		if (tipoDeNota.esNotaValida(unaNota)) {
			
			this.notas.add(unaNota);
		}
		else {
			
			throw new NotaInvalidaException("La nota ingresada es invalida");
		}
	}
	
	public String notaActual() {
		
		return notas.get(notas.size() - 1);
	}
	
	public boolean estaAprobada() {
		
		return tipoDeNota.esAprobatoria(this.notaActual());
	}
}
