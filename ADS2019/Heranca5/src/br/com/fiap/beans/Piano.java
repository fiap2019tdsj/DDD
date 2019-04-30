package br.com.fiap.beans;

public class Piano extends InstrumentoMusical {
	private int numeroOitavas;
	private String tipo;
	
	public Piano(String classe, String nome, Cor cor, int numeroOitavas, String tipo) {
		super(classe, nome, cor);
		this.numeroOitavas = numeroOitavas;
		this.tipo = tipo;
	}
	
	public int getNumeroOitavas() {
		return numeroOitavas;
	}
	
	public void setNumeroOitavas(int numeroOitavas) {
		this.numeroOitavas = numeroOitavas;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String exibirTudo() {
		return (super.exibirTudo() 
					+ "\nNúmero de Oitavas: " + this.numeroOitavas 
					+ "\nTipo: " + this.tipo.toUpperCase());
	}
	
}
