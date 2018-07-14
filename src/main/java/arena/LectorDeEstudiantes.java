package arena;

import java.util.HashSet;

import org.uqbar.arena.Application;

import org.uqbar.arena.windows.Window;

import dominio.Estudiante;
import dominio.NotaConceptual;
import dominio.NotaNumerica;
import dominio.Tarea;
import dominio.exceptions.LegajoRepetidoException;
import dominio.exceptions.LimiteDeNotasException;
import dominio.exceptions.NotaInvalidaException;
import dominio.repositorios.RepositorioDeEstudiantes;
import ui.windows.IngresoWindows;

public class LectorDeEstudiantes extends Application {

	public static void main(String[] args) throws Exception {

		new LectorDeEstudiantes().start();
	}

	@Override
	protected Window<?> createMainWindow() {
		Estudiante nompe = new Estudiante("Nom","Ape","10","git", "pass", new HashSet<Tarea>());
		NotaNumerica num = new NotaNumerica();
		Tarea tarea = new Tarea("prueba", num);
		try {
			tarea.agregarNota("7");
		} catch (NotaInvalidaException | LimiteDeNotasException e1) {
			e1.printStackTrace();
		}
		Tarea tarea2 = new Tarea("Exposicion", new NotaConceptual());
		try {
			tarea2.agregarNota("M");
		} catch (NotaInvalidaException | LimiteDeNotasException e1) {
			e1.printStackTrace();
		}
		nompe.agregarTarea(tarea);
		nompe.agregarTarea(tarea2);
		RepositorioDeEstudiantes repositorioDeEstudiantes = new RepositorioDeEstudiantes();
		try {
			repositorioDeEstudiantes.agregar(nompe);
		} catch (LegajoRepetidoException e) {
			e.printStackTrace();
		}
		return new IngresoWindows(this, repositorioDeEstudiantes);
	}
}
