package dominio.test;

import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;

import dominio.Estudiante;
import dominio.repositorios.RepositorioDeEstudiantes;

public class RepositorioEstudiantesTest {

	@Test
	public void buscoEstudiantePorLegajoValidoTest() {
		Estudiante unEstudiante = new Estudiante(null, null, "1560335", null, null);
		RepositorioDeEstudiantes repositorio = new RepositorioDeEstudiantes();
		repositorio.agregar(unEstudiante);
		Optional<Estudiante> estudianteRetornado = repositorio.buscarPorLegajo("1560335");
		Assert.assertEquals(unEstudiante, estudianteRetornado);
	}

}
