package br.com.castro.controller;

import br.com.castro.application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Login {
	
	@FXML
	private Button BTLogin;
	
	@FXML
	private TextField idLogin;
	
	@FXML
	private PasswordField idPass;
	
	Main main = new Main();
	
	
	@FXML
	private void logar() {
		
		if(idPass.getText().equals("12345")) {
			
			main.startPelaPrincipal();
			BTLogin.getScene().getWindow().hide();// fecha a cena autal
			
			
		} else {
			
			System.out.println("erro");
		}
		
	}
	
		
	

}
