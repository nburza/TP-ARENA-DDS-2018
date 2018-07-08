package dominio;

import java.util.ArrayList;
import java.util.List;

public abstract class TareaGenerica<T> {
	
	protected List<T> notas = new ArrayList<T>();
	
	public T notaActual() {
		
		return notas.get(notas.size() - 1);
	}
	
	public abstract boolean estaAprobada();
}
