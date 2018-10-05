package dominio.test;

import org.junit.Test;

import dominio.Asignacion;
import dominio.NotaNumerica;
import dominio.Parcial;
import dominio.exceptions.LimiteDeNotasException;
import dominio.exceptions.NotaInvalidaException;

import org.junit.Assert;

public class ParcialTest {

	@Test
	public void ParcialAplicaLimiteDeNotasTest() throws LimiteDeNotasException {
		
		Parcial unParcial = new Parcial(null, null, new NotaNumerica());
		Asignacion unaAsignacion = new Asignacion(unParcial);
		
		try {
			unaAsignacion.agregarNota("5");
		} catch (NotaInvalidaException e) {
			e.printStackTrace();
		}
		try {
			unaAsignacion.agregarNota("3");
		} catch (NotaInvalidaException e) {
			e.printStackTrace();
		}
		try {
			unaAsignacion.agregarNota("4");
		} catch (NotaInvalidaException e) {
			e.printStackTrace();
		}
		try {
			try {
				unaAsignacion.agregarNota("10");
			} catch (NotaInvalidaException e) {
				e.printStackTrace();
			}
		}
		catch(LimiteDeNotasException unaLimiteDeNotasException) {
			Assert.assertEquals(unaLimiteDeNotasException.getMessage(), "Un parcial no admite mas notas");
		}
	}
	
	@Test
	public void ParcialRecibeNotaInvalidaTest() throws LimiteDeNotasException, NotaInvalidaException {
	
		Parcial unParcial = new Parcial(null, null, new NotaNumerica());
		Asignacion unaAsignacion = new Asignacion(unParcial);
		
		try {
			unaAsignacion.agregarNota("5");
		} catch (NotaInvalidaException e) {
			e.printStackTrace();
		}
		try {
			unaAsignacion.agregarNota("3");
		} catch (NotaInvalidaException e1) {
			e1.printStackTrace();
		}
		try {
			unaAsignacion.agregarNota("4");
		} catch (NotaInvalidaException e) {
			e.printStackTrace();
		}
		try {
			try {
				unaAsignacion.agregarNota("M");
			} catch (NotaInvalidaException e) {
				e.printStackTrace();
			}
		}
		catch(NotaInvalidaException unaException) {
			
			Assert.assertEquals(unaException.getMessage(), "Un parcial no admite mas notas");
		}
	}

}
