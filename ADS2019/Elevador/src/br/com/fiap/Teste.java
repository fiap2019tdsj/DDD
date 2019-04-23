package br.com.fiap;

public class Teste {

	public static void main(String[] args) {
		Elevador e = new Elevador(14, 6);
		
		System.out.println(e.sobe());
		System.out.println(e.sobe());
		System.out.println(e.sobe());
		System.out.println(e.sobe());
		System.out.println(e.sobe());
		System.out.println(e.entra(10));
		System.out.println(e.entra(5));
		System.out.println(e.desce());
		System.out.println(e.desce());
		System.out.println(e.desce());
		System.out.println(e.desce());
		System.out.println(e.desce());
		System.out.println(e.desce());
		System.out.println(e.desce());
	}

}
