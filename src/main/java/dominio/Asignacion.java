package dominio;

import java.util.ArrayList;
import java.util.List;

import dominio.exceptions.LimiteDeNotasException;
import dominio.exceptions.NotaInvalidaException;

public class Asignacion {

	protected Tarea tarea;
	protected List<String> notas = new ArrayList<String>();
	
public Asignacion(Tarea tarea) {

	this.tarea = tarea;
	
	}

public Tarea getTarea() {
	
	return this.tarea;
}

public void agregarNota(String unaNota) throws NotaInvalidaException, LimiteDeNotasException {
		
		if (tarea.esNotaValida(unaNota, this)) {
			
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
		
		return tarea.getTipoDeNota().esAprobatoria(this.notaActual());
	}
}
