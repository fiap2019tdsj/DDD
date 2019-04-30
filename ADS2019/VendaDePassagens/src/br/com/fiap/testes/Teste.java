package br.com.fiap.testes;

import br.com.fiap.beans.Escala;
import br.com.fiap.beans.Passageiro;
import br.com.fiap.beans.Passagem;

public class Teste {

	public static void main(String[] args) {
		Escala escala = new Escala("Alaska", "10h", true);
		
		Escala[] escalas = new Escala[10];
		escalas[0] = escala;
		
		Passagem passagem = new Passagem("04:00h", "9068V", "Joanesburgo", "Vladvostok",
				"Avianca", escalas, "HGL44GV", "6A", 200);
			
		Passageiro passageiro = new Passageiro(passagem, "Jamal", "11.456.687-X");
		
	}

}
