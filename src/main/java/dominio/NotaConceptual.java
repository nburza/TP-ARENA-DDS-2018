package dominio;

public class NotaConceptual implements TipoDeNota {

	@Override
	public boolean esAprobatoria(String unaNota) {
		
		return unaNota.contains("R") || unaNota.contains("B") || unaNota.contains("S");
	}

	@Override
	public boolean esNotaValida(String unaNota) {
		
		return false; /* aca tendriamos que definir una forma acotar los valores */
	}

}
