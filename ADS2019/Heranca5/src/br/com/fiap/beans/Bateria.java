package br.com.fiap.beans;

public class Bateria extends InstrumentoMusical {
	private int numComponentes;
	private int qtdPratos;
	
	public Bateria(String classe, String nome, Cor cor, int numComponentes, int qtdPratos) {
		super(classe, nome, cor);
		this.numComponentes = numComponentes;
		this.qtdPratos = qtdPratos;
	}

	public int getNumComponentes() {
		return numComponentes;
	}

	public void setNumComponentes(int numComponentes) {
		this.numComponentes = numComponentes;
	}

	public int getQtdPratos() {
		return qtdPratos;
	}

	public void setQtdPratos(int qtdPratos) {
		this.qtdPratos = qtdPratos;
	}
	
	public String exibirTudo() {
		return (super.exibirTudo() 
					+ "\nNúmero de Componentes: " + this.numComponentes 
					+ "\nQuantidade de Pratos: " + this.qtdPratos);
	}
}
