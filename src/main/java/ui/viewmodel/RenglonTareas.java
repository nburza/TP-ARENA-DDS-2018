package ui.viewmodel;

import org.uqbar.commons.model.annotations.Observable;

import dominio.Tarea;

@Observable
public class RenglonTareas {

	private String descripcion;
	private String notaActual;
	private String aprobo;
	
	public RenglonTareas(Tarea unaTarea) {
		
		this.descripcion = unaTarea.getDescripcion();
		this.notaActual = unaTarea.notaActual();
		if(unaTarea.estaAprobada()) {
			this.aprobo = "SI";
		}
		else {
			this.aprobo = "NO";
		}
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getNotaActual() {
		return notaActual;
	}

	public String getAprobo() {
		return aprobo;
	}
}
