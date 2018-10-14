package ui.viewmodel;

import java.util.List;
import java.util.stream.Collectors;

import org.uqbar.commons.model.annotations.Observable;

import comunicacion.StudentService;

@Observable
public class VerNotasViewModel {

	private List<RenglonTareas> renglonesTareas;
	
	public VerNotasViewModel(String token) throws Exception {
		
		this.renglonesTareas = 
				new StudentService().consultarAsignaciones(token)
				.stream()
				.map(t -> new RenglonTareas(t))
				.collect(Collectors.toList());
	}

	public List<RenglonTareas> getRenglonesTareas() {
		
		return renglonesTareas;
	}
}
