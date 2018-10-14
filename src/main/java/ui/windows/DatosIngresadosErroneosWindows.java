package ui.windows;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

import ui.viewmodel.DatosIngresadosErroneosViewModel;

public class DatosIngresadosErroneosWindows extends Dialog<DatosIngresadosErroneosViewModel> {
	
	public DatosIngresadosErroneosWindows(WindowOwner parent, DatosIngresadosErroneosViewModel model) {
		super(parent, model);
	}
	
	@Override
	protected void createFormPanel(Panel panel) {
		this.setTitle("Error");
		
		panel.setLayout(new VerticalLayout());
		
		new Label(panel).setText("Los datos ingresados no son correctos. Ingreselos nuevamente");
	}
	
	@Override
	protected void addActions(Panel panelBotones) {
		new Button(panelBotones).setCaption("Cancelar").onClick(this::cancel);
	}
	
}
