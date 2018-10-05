package dominio;

public class Parcial extends Tarea {
	
	public Parcial(String titulo, String descripcion, TipoDeNota tipoDeNota) {
		
		super(titulo, descripcion, tipoDeNota);
	}

	@Override
	public boolean esNotaValida(String unaNota, Asignacion unaAsignacion) {
		
		return unaAsignacion.notas.size() <= 3 && this.tipoDeNota.esNotaValida(unaNota);
		
	}
}