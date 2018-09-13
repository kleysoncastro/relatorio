package br.com.castro.consultasql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.castro.conexao.ModuloConexao;

public class Logar {

	private String id;
	private String senha;
	private String tipo;
	private boolean resultado;
	private PreparedStatement pst = null;
	private ResultSet rs = null;
	private Connection conexao = null;

	public Logar(String id, String senha) {

		conexao = ModuloConexao.conector();

		this.id = id;
		this.senha = senha;

	}

	private boolean verificar() {

		boolean resultado = false;

		String url = "select tipo, nome from lider where id_lider =? and password =?";

		try {
			pst = conexao.prepareStatement(url);

			pst.setString(1, id);
			pst.setString(2, senha);
			rs = pst.executeQuery();

			if (rs.next()) {

				resultado = true;
			} else {

				resultado = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return resultado;
	}

	public boolean isResultado() {
		return resultado = verificar();
	}

}
