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
import ui.viewmodel.IngresoViewModel;

public class IngresoWindows extends SimpleWindow<IngresoViewModel> {

	public IngresoWindows(WindowOwner owner) {
		super(owner, new IngresoViewModel());
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		this.setTitle("Ingreso de Estudiante");
		
		mainPanel.setLayout(new VerticalLayout());
		
		new Label(mainPanel).setText("Ingrese el num de Legajo");
		new TextBox(mainPanel).setWidth(300).bindValueToProperty("legajo");
		
		new Label(mainPanel).setText("Ingrese la Contraseña");
		new PasswordField(mainPanel).setWidth(300);

	}
	
	protected void addActions(Panel panelAction) {
		new Button(panelAction)
		.setCaption("Buscar")
		.onClick(this::buscarEstudianteYAbrirVentana);
	}
	
	private void buscarEstudianteYAbrirVentana() {
		this.getModelObject().buscarEstudiante();
		Dialog<?> dialog = new ActualizarDatosWindow(this, 
				new ActualizarDatosViewModel(this.getModelObject().getEstudiante()));
		dialog.open();
		dialog.onAccept(() -> {});
	}
}