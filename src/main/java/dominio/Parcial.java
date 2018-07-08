package dominio;

public class Parcial extends Tarea {
	
	public Parcial(String descripcion, TipoDeNota tipoDeNota) {
		
		super(descripcion, tipoDeNota);
	}

	@Override
	public void agregarNota(String unaNota) {
		if(this.notas.size() < 3 && this.tipoDeNota.esNotaValida(unaNota)) {
			this.notas.add(unaNota);
		}
		/*else {
			throw LimiteDeNotasexception extends RuntimeException;
		}*/
	}
}
