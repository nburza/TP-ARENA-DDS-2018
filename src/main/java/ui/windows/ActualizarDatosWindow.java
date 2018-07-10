package ui.windows;

import org.uqbar.arena.aop.windows.TransactionalDialog;
import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.GroupPanel;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.WindowOwner;

import dominio.Estudiante;
import ui.viewmodel.ActualizarDatosViewModel;
import dominio.repositorios.*;

public class ActualizarDatosWindow  extends TransactionalDialog<ActualizarDatosViewModel> {
	
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
		new Label(panel).setWidth(150).bindValueToProperty("legajo");
		new Label(panel).setText("Nombre: ");
		new TextBox(panel).setWidth(150).bindValueToProperty("nombre");
		new Label(panel).setText("Apellido: ");
		new TextBox(panel).setWidth(150).bindValueToProperty("apellido");
		new Label(panel).setText("Usuario GitHub: ");
		new TextBox(panel).setWidth(150).bindValueToProperty("usuarioGitHub");
	}

	@Override
	protected void addActions(Panel panelBotones) {
		new Button(panelBotones).setCaption("Guardar Cambios").onClick(this::accept).setAsDefault();
		new Button(panelBotones).setCaption("Cancelar").onClick(this::cancel);
	}
	
	@Override
	protected void executeTask()
	{
		getModelObject().actualizarDatos(RepositorioDeEstudiantes.getRepo());

		super.executeTask();
	}
}
