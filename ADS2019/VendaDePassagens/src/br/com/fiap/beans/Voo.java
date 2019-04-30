package br.com.fiap.beans;

public class Voo {
	private String hora;
	private String numVoo;
	private String Origem;
	private String Destino;
	private String empresa;
	private Escala[] escalas = new Escala[10];
	
	public Voo(String hora, String numVoo, String origem, String destino, String empresa, Escala[] escalas) {
		super();
		this.hora = hora;
		this.numVoo = numVoo;
		Origem = origem;
		Destino = destino;
		this.empresa = empresa;
		this.escalas = escalas;
	}
	
	public Voo() {};

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getNumVoo() {
		return numVoo;
	}

	public void setNumVoo(String numVoo) {
		this.numVoo = numVoo;
	}

	public String getOrigem() {
		return Origem;
	}

	public void setOrigem(String origem) {
		Origem = origem;
	}

	public String getDestino() {
		return Destino;
	}

	public void setDestino(String destino) {
		Destino = destino;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public Escala[] getEscalas() {
		return escalas;
	}

	public void setEscalas(Escala[] escalas) {
		this.escalas = escalas;
	}
}
