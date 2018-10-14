package ui.windows;

import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import ui.viewmodel.ActualizarDatosViewModel;
import ui.viewmodel.MenuViewModel;
import ui.viewmodel.VerNotasViewModel;

public class MenuWindow extends SimpleWindow<MenuViewModel> {

	public MenuWindow(WindowOwner parent, MenuViewModel model) {
		super(parent, model);
	}

	@Override
	protected void addActions(Panel panelAction) {
		
		new Button(panelAction)
		.setCaption("Actualizar mis datos")
		.onClick(() -> {
			try {
				actualizarDatos();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		new Button(panelAction)
		.setCaption("Ver mis notas")
		.onClick(() -> {
			try {
				verNotas();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}

	@Override
	protected void createFormPanel(Panel arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void actualizarDatos() throws Exception {
		
		ActualizarDatosWindow dialog = new ActualizarDatosWindow(this, 
				new ActualizarDatosViewModel(this.getModelObject().getToken()));
		dialog.open();
	}
	
	public void verNotas() throws Exception {
		
		VerNotasWindow verNotasWindow = new VerNotasWindow(this,
				new VerNotasViewModel(this.getModelObject().getToken()));
		verNotasWindow.open();
		
	}

}
