package br.com.fiap;

public class Elevador {
	private int quantidadeAndar;
	private int capacidade;
	private int quantidadeAtualPessoas;
	private int andarAtual;

	public Elevador(int quantidadeAndar, int capacidade) {
		if (capacidade >= 0) {
			this.capacidade = capacidade;
		} else {
			System.out.println("Capacidade inválida!");
		}
		
		if (quantidadeAndar >= 0) {
			this.quantidadeAndar = quantidadeAndar;
		} else {
			System.out.println("Quantidade de andares inválida");
		}
		
	}
	
	public int entra(int qtdePessoas) {
		if ((quantidadeAtualPessoas + qtdePessoas) <= capacidade) {
			quantidadeAtualPessoas += qtdePessoas;
		} else if (qtdePessoas <= 0) {
			System.out.println("Número de pessoas inválido!");
		} else {
			System.out.println("Capacidade de pessoas excede o limite");
		}
		
		return quantidadeAtualPessoas;
	}
	
	public int sai(int qtdePessoas) {
		if ((quantidadeAtualPessoas - qtdePessoas) >= 0) {
			quantidadeAtualPessoas -= qtdePessoas;
		} else if (qtdePessoas <= 0) {
			System.out.println("Número de pessoas inválido!");
		} else {
			System.out.println("Capacidade de pessoas não pode ser menor que 0!");
		}
		
		return quantidadeAtualPessoas;
	}
	
	public boolean sobe() {
		if (andarAtual++ <= quantidadeAndar) {
			andarAtual++;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean desce() {
		if (andarAtual-- >= 0) {
			andarAtual--;
			return true;
		} else {
			return false;
		}
	}

	public int getQuantidadeAndar() {
		return quantidadeAndar;
	}

	public void setQuantidadeAndar(int quantidadeAndar) {
		this.quantidadeAndar = quantidadeAndar;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getQuantidadeAtualPessoas() {
		return quantidadeAtualPessoas;
	}

	public void setQuantidadeAtualPessoas(int quantidadeAtualPessoas) {
		this.quantidadeAtualPessoas = quantidadeAtualPessoas;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}
}
