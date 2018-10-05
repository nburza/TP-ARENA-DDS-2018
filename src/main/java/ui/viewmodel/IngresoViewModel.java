package ui.viewmodel;

import org.uqbar.commons.model.annotations.Observable;

@Observable
public class IngresoViewModel {

	private String token;

	public IngresoViewModel() {
		
	}

	public String getToken() {

		return token;
	}

	public void setToken(String token) {

		this.token = token;
	}
}