package dominio;

import dominio.exceptions.LimiteDeNotasException;

public class Parcial extends Tarea {
	
	public Parcial(String descripcion, TipoDeNota tipoDeNota) {
		
		super(descripcion, tipoDeNota);
	}

	@Override
	public void agregarNota(String unaNota) throws LimiteDeNotasException {
		if(this.notas.size() < 3 && this.tipoDeNota.esNotaValida(unaNota)) {
			this.notas.add(unaNota);
		}
		else {
			throw new LimiteDeNotasException("Un parcial no admite mas notas");
		}
	}
}
