package br.com.fiap.teste;

import br.com.fiap.beans.Bateria;
import br.com.fiap.beans.Cor;
import br.com.fiap.beans.Piano;
import br.com.fiap.beans.Violao;

public class Teste {

	public static void main(String[] args) {
		Cor preto = new Cor("Preto", 0, 0, 0);
		Piano piano = new Piano("Teclas", "Steiner", preto, 6, "Cauda");
		Violao violao = new Violao("Cordas", "Tagima", preto, 6, 0.11d);
		Bateria bateria = new Bateria("Percussão", "Monster Portnoy", preto, 40, 8);
		
		System.out.println(bateria.exibirTudo());
		System.out.println(piano.exibirTudo());
		System.out.println(violao.exibirTudo());
	}

}
