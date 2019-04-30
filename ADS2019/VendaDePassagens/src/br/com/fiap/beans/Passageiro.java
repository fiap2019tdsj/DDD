package br.com.fiap.beans;

public class Passageiro {
	public Passagem passagem;
	public String Nome;
	public String rg;
	
	public Passageiro(Passagem passagem, String nome, String rg) {
		super();
		this.passagem = passagem;
		Nome = nome;
		this.rg = rg;
	}
	
	public Passageiro() {}

	public Passagem getPassagem() {
		return passagem;
	}

	public void setPassagem(Passagem passagem) {
		this.passagem = passagem;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	};
}
