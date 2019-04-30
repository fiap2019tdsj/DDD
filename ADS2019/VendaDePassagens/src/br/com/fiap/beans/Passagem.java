package br.com.fiap.beans;

public class Passagem extends Voo {
	public String localizador;
	public String assento;
	public double valor;
	
	public Passagem(String hora, String numVoo, String origem, String destino, String empresa, Escala[] escalas,
			String localizador, String assento, double valor) {
		super(hora, numVoo, origem, destino, empresa, escalas);
		this.localizador = localizador;
		this.assento = assento;
		this.valor = valor;
	}
	
	public Passagem() {};

	public String getLocalizador() {
		return localizador;
	}

	public void setLocalizador(String localizador) {
		this.localizador = localizador;
	}

	public String getAssento() {
		return assento;
	}

	public void setAssento(String assento) {
		this.assento = assento;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
