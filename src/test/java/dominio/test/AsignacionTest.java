package dominio.test;

import org.junit.Test;

import dominio.Asignacion;
import dominio.NotaNumerica;
import dominio.Tarea;
import junit.framework.Assert;

public class AsignacionTest {

	@Test
	public void test() {

		Asignacion asignacion = new Asignacion(new Tarea(null, "TP Test2", new NotaNumerica()));
		Assert.assertEquals(asignacion.notaActual(), "SIN CARGAR");
	}

}
