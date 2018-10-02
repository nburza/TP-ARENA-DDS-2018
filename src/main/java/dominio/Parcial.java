package dominio;

public class Parcial extends Tarea {
	
	public Parcial(String descripcion, TipoDeNota tipoDeNota) {
		
		super(descripcion, tipoDeNota);
	}

	@Override
	public boolean esNotaValida(String unaNota, Asignacion unaAsignacion) {
		
		return unaAsignacion.notas.size() <= 3 && this.tipoDeNota.esNotaValida(unaNota);
		
	}
}