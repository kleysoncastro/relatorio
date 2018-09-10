package br.com.castro.conexao;

import java.sql.Connection;
import java.sql.DriverManager;


public class ModuloConexao {
	
	
	
	public static Connection conector() {
		
		java.sql.Connection conexao = null;
		
		//String driver = "com.mysql.jdbc.Driver";
		String driver = "com.mysql.cj.jdbc.Driver";
		// retira erro para ssl, ainda em teste
	String url = "jdbc:mysql://localhost:3306/mda?useSSL=false";
	String user = "root";
	String senha = "toor";
	
	try {
		
		Class.forName(driver);
		conexao = DriverManager.getConnection(url, user, senha);
		
		return (Connection) conexao;
	} catch (Exception e) {
		return null;
	}
	
	}

}
