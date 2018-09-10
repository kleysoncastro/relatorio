package br.com.castro.controller;

import br.com.castro.application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Login {
	
	@FXML
	private Button BTLogin;
	
	
	Main main = new Main();
	
	public void testeTela() {
		
		main.startPelaPrincipal();
		BTLogin.getScene().getWindow().hide();// fecha a cena autal

	}
	
	

}
