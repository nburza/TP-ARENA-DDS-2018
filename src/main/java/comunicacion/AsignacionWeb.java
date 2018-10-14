package comunicacion;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import dominio.Asignacion;
import dominio.NotaConceptual;
import dominio.NotaNumerica;
import dominio.Tarea;

public class AsignacionWeb {
	
	@SerializedName("id")
	private String id;
	@SerializedName("title")
	private String title;
	@SerializedName("description")
	private String description;
	@SerializedName("grades")
	private List<String> grades;
	
	public AsignacionWeb(String id, String title, String description, List<String> grades) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.grades = grades;
	}
	
	public String getDescription() {
		
		return this.description;
	}

	public List<String> getGrades() {
	
		return this.grades;
	}
	
	public Asignacion mapearAsignacion() {
		
		return new Asignacion(new Tarea(this.title, this.description, new NotaConceptual()));
	}

	public String getTitle() {
	
	return this.title;
	}
}
