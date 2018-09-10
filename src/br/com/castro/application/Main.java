package br.com.castro.application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;


public class Main extends Application {
	
	
	Stage telaLogin = new Stage();
	Stage telaPrincipal = new Stage();
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
		
	
			Pane root = FXMLLoader.load(getClass().getResource("Login.fxml"));
			Scene scene = new Scene(root,350,200);
			this.telaLogin.setScene(scene);
			this.telaLogin.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void startPelaPrincipal() {
		
		try {
			
			Pane root = FXMLLoader.load(getClass().getResource("TelaPrincipal.fxml"));
			Scene scene = new Scene(root, 800, 800);
			this.telaPrincipal.setScene(scene);
			this.telaPrincipal.show();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
