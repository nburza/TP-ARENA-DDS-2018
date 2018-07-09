package ui.windows;

import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import dominio.Estudiante;
import ui.viewmodel.MenuViewModel;

public class MenuWindow extends SimpleWindow<MenuViewModel>{

	public MenuWindow(WindowOwner parent, MenuViewModel model) {
		super(parent, model);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void addActions(Panel arg0) {
		// TODO Auto-generated method stub
		new Button(actions)
	    .setCaption("Ok")
	    .onClick(this::actualizarDatos)
	}

	@Override
	protected void createFormPanel(Panel arg0) {
		// TODO Auto-generated method stub
		
	}

	public void actualizarDatos(Estudiante unEstudiante) {
		
		ActualizarDatosWindow nuevaVentana = new ActualizarDatosWindow(this, unEstudiante);
		nuevaVentana.Show();
	}
}
