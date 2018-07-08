package dominio;

import org.uqbar.commons.model.annotations.Observable;

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
}
