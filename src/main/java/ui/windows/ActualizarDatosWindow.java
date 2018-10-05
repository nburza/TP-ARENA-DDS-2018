package ui.windows;

import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.GroupPanel;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import ui.viewmodel.ActualizarDatosViewModel;

public class ActualizarDatosWindow  extends SimpleWindow<ActualizarDatosViewModel> {
	
	public ActualizarDatosWindow(WindowOwner owner, ActualizarDatosViewModel model) {
		super(owner, model);
	}
	
	@Override
	protected void createFormPanel(Panel mainPanel) {
		setTitle("Actualizar Datos");
		
		mainPanel.setLayout(new VerticalLayout());
		
		GroupPanel panel = new GroupPanel(mainPanel);
		panel.setTitle("Modificar informacion personal");
		panel.setLayout(new ColumnLayout(2));
		
		new Label(panel).setText("Legajo: ");
		new TextBox(panel).setWidth(150).bindValueToProperty("legajo");
		new Label(panel).setText("Nombre: ");
		new TextBox(panel).setWidth(150).bindValueToProperty("nombre");
		new Label(panel).setText("Apellido: ");
		new TextBox(panel).setWidth(150).bindValueToProperty("apellido");
		new Label(panel).setText("Usuario GitHub: ");
		new TextBox(panel).setWidth(150).bindValueToProperty("usuarioGitHub");
	}

	@Override
	protected void addActions(Panel panelAction) {
		// TODO Auto-generated method stub
		new Button(panelAction)
		.setCaption("Guardar Cambios")
		.onClick(() -> {
			try {
				guardarCambios();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		new Button(panelAction)
		.setCaption("Volver")
		.onClick(this::volver);
		
	}
	
	private void guardarCambios() throws Exception {
		
		this.getModelObject().guardarCambios();
		this.close();
	}
	
	private void volver() {
		
		this.close();
	}
}
