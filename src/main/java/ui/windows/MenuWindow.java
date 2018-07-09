package ui.windows;

import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import ui.viewmodel.ActualizarDatosViewModel;
import ui.viewmodel.MenuViewModel;
import ui.viewmodel.VerNotasViewModel;

public class MenuWindow extends SimpleWindow<MenuViewModel> {

	public MenuWindow(WindowOwner parent, MenuViewModel model) {
		super(parent, model);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void addActions(Panel panelAction) {
		// TODO Auto-generated method stub
		new Button(panelAction)
		.setCaption("Actualizar mis datos")
		.onClick(this::actualizarDatos);
		
		new Button(panelAction)
		.setCaption("Ver mis notas")
		.onClick(this::verNotas);
	}

	@Override
	protected void createFormPanel(Panel arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void actualizarDatos() {
		
		Dialog<?> dialog = new ActualizarDatosWindow(this, 
				new ActualizarDatosViewModel(this.getModelObject().getEstudiante()));
		dialog.open();
		dialog.onAccept(() -> {});
	}
	
	public void verNotas() {
		
		Dialog<?> dialog = new VerNotasWindow(this,
				new VerNotasViewModel(this.getModelObject().getEstudiante()));
		dialog.open();
		dialog.onAccept(() -> {});
		
	}

}
