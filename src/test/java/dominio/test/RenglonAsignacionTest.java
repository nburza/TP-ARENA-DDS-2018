package dominio.test;

import org.junit.Assert;
import org.junit.Test;

import dominio.Asignacion;
import dominio.NotaNumerica;
import dominio.Tarea;
import ui.viewmodel.RenglonTareas;

public class RenglonAsignacionTest {

	@Test
	public void AsignacionSinNotasTest() {
		
		Asignacion asignacion = new Asignacion(new Tarea(null, "TP Test", new NotaNumerica()));
		RenglonTareas renglonTarea = new RenglonTareas(asignacion);
		Assert.assertEquals(renglonTarea.getAprobo(), "NO");
		Assert.assertEquals(renglonTarea.getDescripcion(), "TP Test");
		Assert.assertEquals(renglonTarea.getNotaActual(), "SIN CARGAR");
	}
	
	@Test
	public void AsignacionConNotasTest() {
		
		Asignacion asignacion = new Asignacion(new Tarea(null, "TP Test2", new NotaNumerica()));
		asignacion.agregarNota("8");
		RenglonTareas renglonTarea = new RenglonTareas(asignacion);
		Assert.assertEquals(renglonTarea.getAprobo(), "SI");
		Assert.assertEquals(renglonTarea.getDescripcion(), "TP Test2");
		Assert.assertEquals(renglonTarea.getNotaActual(), "8");
	}

}
