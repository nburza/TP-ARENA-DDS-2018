package ui.windows;

import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

import dominio.RenglonTareas;
import ui.viewmodel.VerNotasViewModel;

@SuppressWarnings("serial")
public class VerNotasWindow extends Dialog<VerNotasViewModel>{

	public VerNotasWindow(WindowOwner owner, VerNotasViewModel model) {
		super(owner, model);
		// TODO Auto-generated constructor stub
	}

	protected void createFormPanel(Panel formPanel) {
		this.setTitle("Ver notas");
		
		Table<RenglonTareas> tableTareas = new Table<>(formPanel, RenglonTareas.class);
		tableTareas.bindItemsToProperty("renglonesTareas");
		
		Column<RenglonTareas> columnaTarea = new Column<RenglonTareas>(tableTareas);
		columnaTarea.setTitle("Tarea");
		columnaTarea.bindContentsToProperty("descripcion");
		columnaTarea.setFixedSize(200);
		
		Column<RenglonTareas> columnaNota = new Column<RenglonTareas>(tableTareas);
		columnaNota.setTitle("Nota actual");
		columnaNota.bindContentsToProperty("notaActual");
		columnaNota.setFixedSize(80);
		columnaNota.alignCenter();
		
		Column<RenglonTareas> columnaAprobo = new Column<RenglonTareas>(tableTareas);
		columnaAprobo.setTitle("Aprobo");
		columnaAprobo.bindContentsToProperty("aprobo");
		columnaAprobo.setFixedSize(60);
		columnaAprobo.alignCenter();
				
	}

	@Override
	protected void addActions(Panel panelBotones) {
		// TODO Auto-generated method stub
		new Button(panelBotones)
			.setCaption("Volver")
			.onClick(this::accept)
			.setAsDefault();
	}
	
	@Override
	protected void executeTask()
	{
		this.close();
	}
}
