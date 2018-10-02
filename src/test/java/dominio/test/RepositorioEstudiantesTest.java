package dominio.test;

import org.junit.Assert;
import org.junit.Test;

import dominio.Estudiante;
import dominio.exceptions.LegajoRepetidoException;
import dominio.repositorios.RepositorioDeEstudiantes;

public class RepositorioEstudiantesTest {

	@Test
	public void buscoEstudiantePorLegajoValidoTest() throws LegajoRepetidoException {
		Estudiante unEstudiante = new Estudiante(null, null, "15460335", null, null, null);
		RepositorioDeEstudiantes repositorio = new RepositorioDeEstudiantes();
		repositorio.agregar(unEstudiante);
		Estudiante estudianteRetornado = repositorio.buscarPorLegajo("15460335");
		Assert.assertEquals(unEstudiante, estudianteRetornado);
	}
	
	@Test
	public void siTengoLegajoRepetidoArrojoExceptionTest() throws LegajoRepetidoException {
		Estudiante unEstudiante = new Estudiante(null, null, "1560335", null, null, null);
		Estudiante otroEstudiante = new Estudiante(null, null, "1560335", null, null, null);
		RepositorioDeEstudiantes repositorio = new RepositorioDeEstudiantes();
		repositorio.agregar(unEstudiante);
		try {
			repositorio.agregar(otroEstudiante);
			Assert.fail();
		}
		catch (LegajoRepetidoException unaLegajoRepetidoException) {
			Assert.assertEquals(unaLegajoRepetidoException.getMessage(), "Ya existe un estudiante con este legajo");
		}
		
	}

	@Test
	public void verSivalidarPassDeUnLegajoFunciona() throws LegajoRepetidoException {
		Estudiante unEstudiante = new Estudiante(null, null, "156035", null, "pass", null);
		RepositorioDeEstudiantes repositorio = new RepositorioDeEstudiantes();
		repositorio.agregar(unEstudiante);

		Assert.assertTrue(repositorio.validarPassDeUnLegajo("156035", "pass"));
		Assert.assertTrue(!repositorio.validarPassDeUnLegajo("156035", "pahss"));
	}

}