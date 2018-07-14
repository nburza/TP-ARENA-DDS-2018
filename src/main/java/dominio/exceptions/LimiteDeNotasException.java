package dominio.exceptions;

import org.uqbar.commons.model.exceptions.UserException;

public class LimiteDeNotasException extends UserException{
	
	public LimiteDeNotasException(String mensaje) {
		
		super(mensaje);
	}
}
