package ui.windows;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.PasswordField;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import dominio.Estudiante;
import ui.viewmodel.ActualizarDatosViewModel;
import ui.viewmodel.DatosIngresadosErroneosViewModel;
import ui.viewmodel.IngresoViewModel;
import ui.viewmodel.MenuViewModel;

public class IngresoWindows extends SimpleWindow<IngresoViewModel> {

	public IngresoWindows(WindowOwner owner) {
		super(owner, new IngresoViewModel());
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		this.setTitle("Ingreso de Estudiante");
		
		mainPanel.setLayout(new VerticalLayout());
		
		new Label(mainPanel).setText("Ingrese su token personal");
		new TextBox(mainPanel).setWidth(300).bindValueToProperty("token");

	}
	
	protected void addActions(Panel panelAction) {
		new Button(panelAction)
		.setCaption("Ingresar")
		.onClick(this::ingresar);
	}
	
	private void ingresar() {
	
		MenuWindow nuevaVentana = new MenuWindow(this, new MenuViewModel(this.getModelObject().getToken()));
		nuevaVentana.open();
		
	}
}