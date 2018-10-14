package ui.viewmodel;

import org.uqbar.commons.model.annotations.Observable;

@Observable
public class MenuViewModel {
	
	private String token;
	
	public MenuViewModel(String token) {
		
		this.token = token;
	}
	
	public String getToken() {
		
		return token;
	}
}
