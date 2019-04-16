package br.com.fiap.bens;

public class Veiculo {
	private String modelo;
	private String motor;
	private int qtdePortas;
	private boolean novo;
	
	public Veiculo() {
	}

	public Veiculo(String modelo, String motor, int qtdePortas, boolean novo) {
		super();
		this.modelo = modelo;
		this.motor = motor;
		this.qtdePortas = qtdePortas;
		this.novo = novo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public int getQtdePortas() {
		return qtdePortas;
	}

	public void setQtdePortas(int qtdePortas) {
		this.qtdePortas = qtdePortas;
	}

	public boolean isNovo() {
		return novo;
	}

	public void setNovo(boolean novo) {
		this.novo = novo;
	}
}
