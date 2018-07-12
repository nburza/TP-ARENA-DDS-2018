package dominio;

import java.util.HashSet;
import java.util.Set;

public class NotaConceptual implements TipoDeNota {

	private Set<String> notasValidas = new HashSet<String>();
	
	public NotaConceptual() {
		
		this.notasValidas.add("M");
		this.notasValidas.add("R");
		this.notasValidas.add("B");
		this.notasValidas.add("MB");
		this.notasValidas.add("S");
	}
	
	@Override
	public boolean esAprobatoria(String unaNota) {
		
		return unaNota.contains("R") || unaNota.contains("B") || unaNota.contains("S");
	}

	@Override
	public boolean esNotaValida(String unaNota) {
		
		return this.notasValidas.contains(unaNota);
	}

}
