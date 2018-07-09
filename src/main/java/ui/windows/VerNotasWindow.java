package ui.windows;

import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import dominio.Estudiante;
import dominio.RenglonTareas;
import ui.viewmodel.VerNotasViewModel;

public class VerNotasWindow extends SimpleWindow<VerNotasViewModel>{

	public VerNotasWindow(WindowOwner parent, Estudiante unEstudiante) {
		
		super(parent, new VerNotasViewModel(unEstudiante));
	}
	
	protected void createFormPanel(Panel formPanel) {
		this.setTitle("Ver notas");
		
		Table<RenglonTareas> tableTareas = new Table<>(formPanel, RenglonTareas.class);
		tableTareas.bindItemsToProperty("renglonesTareas");
		
		Column<RenglonTareas> columnaTarea = new Column<RenglonTareas>(tableTareas);
		columnaTarea.setTitle("Tarea");
		columnaTarea.bindContentsToProperty("descripcion");
		
		Column<RenglonTareas> columnaNota = new Column<RenglonTareas>(tableTareas);
		columnaNota.setTitle("Nota actual");
		columnaNota.bindContentsToProperty("notaActual");
		
		Column<RenglonTareas> columnaAprobo = new Column<RenglonTareas>(tableTareas);
		columnaAprobo.setTitle("Aprob�");
		columnaAprobo.bindContentsToProperty("aprobo");
		
		tableTareas.setHeight(900);
		tableTareas.setWidth(900);
		
	}

	@Override
	protected void addActions(Panel arg0) {
		// TODO Auto-generated method stub
		
	}
}
