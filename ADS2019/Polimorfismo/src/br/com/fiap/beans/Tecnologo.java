package br.com.fiap.beans;

public class Tecnologo extends Formacao {
	private boolean planoEstendido;

	public Tecnologo(boolean planoEstendido) {
		super();
		this.planoEstendido = planoEstendido;
	}
	
	public Tecnologo() {};

	public boolean isPlanoEstendido() {
		return planoEstendido;
	}

	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	}
	
	public String getTudo() {
		return (
			super.getTudo() 
				+ "\nPlano Estendido: " + this.planoEstendido
		);
	}
	
	public void calcularMensalidade(double fator) {
		this.setMensalidade(this.getDuracao() * fator * 600);
	}
}
