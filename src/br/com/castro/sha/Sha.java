package br.com.castro.sha;

/**
 * 
 * Esta classe retorna recebe uma instring e retorna um sha-256
 * 
 */

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Sha {

	 String password;
	private String original;

	public Sha(String senha) {
		this.original = senha;

	}

	private String hashSenha() throws NoSuchAlgorithmException, UnsupportedEncodingException {

		MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
		byte messageDigest[] = algorithm.digest(original.getBytes("UTF-8"));

		StringBuilder hexString = new StringBuilder();

		for (byte b : messageDigest) {
			hexString.append(String.format("%02X", 0xFF & b));
		}
		String senha = hexString.toString();

		return senha;

	}

	public String getPassword() throws NoSuchAlgorithmException, UnsupportedEncodingException {
		return password = hashSenha();
	}

}
