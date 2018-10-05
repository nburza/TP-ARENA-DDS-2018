package dominio;

public class Tarea {
	
	protected String titulo;
	protected String descripcion;
	protected TipoDeNota tipoDeNota;
	
	public Tarea(String titulo, String descripcion, TipoDeNota tipoDeNota) {
		
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.tipoDeNota = tipoDeNota;
	}
	
	public String getTitulo() {
		
		return this.titulo;
	}
	
	public String getDescripcion() {
		
		return this.descripcion;
	}
	
	public TipoDeNota getTipoDeNota() {
		
		return this.tipoDeNota;
	}

	public boolean esNotaValida(String unaNota, Asignacion asignacion) {
		
		return this.tipoDeNota.esNotaValida(unaNota);
	}
}
