package dominio;

public class TareaNumerica extends TareaGenerica<Double> {

	public Double notaActual() {
		
		return super.notaActual();
	}
	
	public boolean estaAprobada() {
		
		return this.notaActual() > 5; 
	}

}
