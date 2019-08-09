package br.com.fiap.teste;

import br.com.fiap.entrada.Magica;
import br.com.fiap.excecao.Excecao;

public class Teste {

	public static void main(String[] args) {
		try {
			int teste = Magica.i("Número...");
			System.out.println(teste);
			
			String a = Magica.t("Digite algo...");
			System.out.println(a.length());
		} catch (Exception e) {
			e.printStackTrace();
			
			System.out.println(Excecao.getExcecao(e));
		}
	}
}