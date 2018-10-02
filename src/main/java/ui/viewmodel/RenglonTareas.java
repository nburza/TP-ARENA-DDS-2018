package ui.viewmodel;

import org.uqbar.commons.model.annotations.Observable;

import dominio.Asignacion;

@Observable
public class RenglonTareas {

	private String descripcion;
	private String notaActual;
	private String aprobo;
	
	public RenglonTareas(Asignacion unaAsignacion) {
		
		this.descripcion = unaAsignacion.getTarea().getDescripcion();
		this.notaActual = unaAsignacion.notaActual();
		if(unaAsignacion.estaAprobada()) {
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
