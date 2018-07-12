package dominio.test;

import org.junit.Test;

import dominio.NotaNumerica;
import dominio.Parcial;
import dominio.exceptions.LimiteDeNotasException;
import org.junit.Assert;

public class ParcialTest {

	@Test
	public void ParcialAplicaLimiteDeNotasTest() throws LimiteDeNotasException {
		
		Parcial unParcial = new Parcial(null, new NotaNumerica());
		unParcial.agregarNota("5");
		unParcial.agregarNota("3");
		unParcial.agregarNota("4");
		try {
			unParcial.agregarNota("10");
		}
		catch(LimiteDeNotasException unaLimiteDeNotasException) {
			Assert.assertEquals(unaLimiteDeNotasException.getMessage(), "Un parcial no admite mas notas");
		}
	}
	
	@Test
	public void ParcialRecibeNotaInvalidaTest() throws LimiteDeNotasException {
	
		Parcial unParcial = new Parcial(null, new NotaNumerica());
		unParcial.agregarNota("5");
		unParcial.agregarNota("3");
		unParcial.agregarNota("4");
		try {
			unParcial.agregarNota("M");
		}
		catch(Exception unaException) {
			
			Assert.assertEquals(unaException.getMessage(), "Un parcial no admite mas notas");
		}
	}

}
