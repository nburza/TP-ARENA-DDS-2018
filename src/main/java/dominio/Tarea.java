package dominio;

import java.util.ArrayList;
import java.util.List;

public class Tarea {
	
	protected List<String> notas = new ArrayList<String>();
	private TipoDeNota tipoDeNota;
	
	public void agregarNota(String unaNota) {
		
		if (tipoDeNota.esNotaValida(unaNota))
			this.notas.add(unaNota);
	}
	
	public String notaActual() {
		
		return notas.get(notas.size() - 1);
	}
	
	public boolean estaAprobada() {
		
		return tipoDeNota.esAprobatoria(this.notaActual());
	}
}
