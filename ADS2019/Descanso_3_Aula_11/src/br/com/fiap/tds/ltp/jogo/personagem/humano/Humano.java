package br.com.fiap.tds.ltp.jogo.personagem.humano;

import br.com.fiap.tds.ltp.jogo.personagem.Personagem;

public class Humano extends Personagem {
	private String classe;
	
	String definirClasse() {
		return classe;
	}

	public Humano(int forca, int inteligencia, int destreza, int level, String nome, String classe) {
		super(forca, inteligencia, destreza, level, nome);
		this.classe = classe;
	}
}
