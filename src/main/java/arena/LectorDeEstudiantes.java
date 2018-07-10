package arena;

import java.util.HashSet;

import org.uqbar.arena.Application;

import org.uqbar.arena.windows.Window;

import dominio.Estudiante;
import dominio.NotaNumerica;
import dominio.Tarea;
import dominio.repositorios.RepositorioDeEstudiantes;
import ui.windows.IngresoWindows;

public class LectorDeEstudiantes extends Application {

	public static void main(String[] args) throws Exception {

		new LectorDeEstudiantes().start();
	}

	@Override
	protected Window<?> createMainWindow() {
		Estudiante nompe = new Estudiante("Nom","Ape","10","git","pass", new HashSet<Tarea>());
		NotaNumerica num = new NotaNumerica();
		Tarea tarea = new Tarea("prueba", num);
		tarea.agregarNota("7");
		nompe.agregarTarea(tarea);
		RepositorioDeEstudiantes.agregar(nompe);
		return new IngresoWindows(this);
	}
}
