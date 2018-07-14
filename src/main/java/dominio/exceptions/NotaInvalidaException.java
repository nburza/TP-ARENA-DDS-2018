package dominio.exceptions;

import org.uqbar.commons.model.exceptions.UserException;

public class NotaInvalidaException extends UserException {

	public NotaInvalidaException(String mensaje) {
		
		super(mensaje);
	}
}
