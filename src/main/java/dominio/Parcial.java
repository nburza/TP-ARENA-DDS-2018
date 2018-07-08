package dominio;

public class Parcial extends Tarea {
	
	@Override
	public void agregarNota(String unaNota) {
		if(this.notas.size() < 3) {
			this.notas.add(unaNota);
		}
		/*else
			TIRAR EXCEPTION */
	}
}
