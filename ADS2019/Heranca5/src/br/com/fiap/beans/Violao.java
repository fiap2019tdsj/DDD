package br.com.fiap.beans;

public class Violao extends InstrumentoMusical {
	private int numCordas;
	private double espessuraCorda;
	
	public Violao(String classe, String nome, Cor cor, int numCordas, double espessuraCorda) {
		super(classe, nome, cor);
		this.numCordas = numCordas;
		this.espessuraCorda = espessuraCorda;
	}

	public int getNumCordas() {
		return numCordas;
	}

	public void setNumCordas(int numCordas) {
		this.numCordas = numCordas;
	}

	public double getEspessuraCorda() {
		return espessuraCorda;
	}

	public void setEspessuraCorda(double espessuraCorda) {
		this.espessuraCorda = espessuraCorda;
	}
	
	public String exibirTudo() {
		return (super.exibirTudo() 
					+ "\nNúmero de Cordas: " + this.numCordas 
					+ "\nEspessura da Corda: " + this.espessuraCorda);
	}
}
