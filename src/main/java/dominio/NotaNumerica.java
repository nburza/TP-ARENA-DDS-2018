package dominio;

public class NotaNumerica implements TipoDeNota {

	@Override
	public boolean esAprobatoria(String unaNota) {
		
		return Integer.parseInt(unaNota) >= 6;
	}

	@Override
	public boolean esNotaValida(String unaNota) {
		
		return Integer.parseInt(unaNota) > 0 && Integer.parseInt(unaNota) <= 10;
	}

}
