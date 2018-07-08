package dominio;

public class TareaConceptual extends TareaGenerica<NotaConceptual>{
	
	public NotaConceptual notaActual() {
		
		return super.notaActual();
	}
	
	public boolean estaAprobada() {
		
		return this.notaActual() > 5; 
	}

}
