package br.com.fiap.excecao;

public class Excecao extends Exception {
	
	/*
	 * public Excecao(Exception e) { 
		 * if (e.getClass().toString().equals("class java.lang.NullPointerException")) {
		 	* System.out.println("Objeto nulo"); 
		 * } else if (e.getClass().toString().equals("class java.lang.NumberFormatException")) {
		 	* System.out.println("N�mero inv�lido"); 
		 * } else {
		 	* System.out.println("Deu ruim"); 
		 * } 
	 * }
	 * 
	 * N�O DEVO USAR COM CONSTRUTOR NO AM E NEM NA PS 
	 * O HUMBERTO VAI DESCONTAR NOTA
	 */
	
	public static String getExcecao(Exception e) {
		if (e.getClass().toString().equals("class java.lang.NullPointerException")) {
			return "Objeto nulo";
		} else if (e.getClass().toString().equals("class java.lang.NumberFormatException")) {
			return "N�mero inv�lido";
		} else {
			return "Deu ruim";
		}
	}
	
}
