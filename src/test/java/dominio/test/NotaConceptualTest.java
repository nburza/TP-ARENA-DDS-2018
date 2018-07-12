package dominio.test;

import org.junit.Assert;
import org.junit.Test;

import dominio.NotaConceptual;

public class NotaConceptualTest {

	@Test
	public void NotaConceptualReconoceNotaValidaTest() {
		
		NotaConceptual unaNotaConceptual = new NotaConceptual();
		boolean condicion = unaNotaConceptual.esNotaValida("B");
		Assert.assertTrue(condicion);
	}

	
}
