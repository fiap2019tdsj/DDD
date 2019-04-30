package br.com.fiap.beans;

public class Medio extends Formacao {
	private String tipo;

	public Medio(String tipo) {
		super();
		this.tipo = tipo;
	}
	
	public Medio() {};

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTudo() {
		return (
			super.getTudo() 
				+ "\nTipo: " + this.tipo
		);
	}
	
	public void calcularMensalidade(double fator) {
		this.setMensalidade(this.getDuracao() * fator * 500);
	}
}
