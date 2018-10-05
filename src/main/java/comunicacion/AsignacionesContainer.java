package comunicacion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.google.gson.annotations.SerializedName;

import dominio.Asignacion;

public class AsignacionesContainer {

	@SerializedName("assignments")
	private List<AsignacionWeb> asignacionesWeb = new ArrayList<AsignacionWeb>();
		
	public List<Asignacion> getAsignaciones() {
			
		List<Asignacion> asignaciones = new ArrayList<Asignacion>();
		asignaciones = this.asignacionesWeb.stream().map(aw -> aw.mapearAsignacion()).collect(Collectors.toList());
		return asignaciones;
	}
}
