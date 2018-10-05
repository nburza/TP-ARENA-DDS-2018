package arena;

import org.uqbar.arena.Application;

import org.uqbar.arena.windows.Window;

import ui.windows.IngresoWindows;

public class LectorDeEstudiantes extends Application {

	public static void main(String[] args) throws Exception {

		new LectorDeEstudiantes().start();
	}

	@Override
	protected Window<?> createMainWindow() {
		return new IngresoWindows(this);
	}
}
