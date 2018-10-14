package dominio;

public class NotaNumerica implements TipoDeNota {
//	private String nota;
//	public NotaNumerica(String nota) {
//		this.nota = nota;
//	}
	
	public NotaNumerica() {	}
	
	@Override
	public boolean esAprobatoria(String unaNota) {
		
		return Integer.parseInt(unaNota) >= 6;
	}

	@Override
	public boolean esNotaValida(String unaNota) {
		
		return Integer.parseInt(unaNota) > 0 && Integer.parseInt(unaNota) <= 10;
	}

}
