package br.com.fiap.beans;

public class Escala {
	private String local;
	private String tempo;
	private boolean transfer;
	
	public Escala(String local, String tempo, boolean transfer) {
		super();
		this.local = local;
		this.tempo = tempo;
		this.transfer = transfer;
	}
	
	public Escala() {};

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getTempo() {
		return tempo;
	}

	public void setTempo(String tempo) {
		this.tempo = tempo;
	}

	public boolean isTransfer() {
		return transfer;
	}

	public void setTransfer(boolean transfer) {
		this.transfer = transfer;
	}
}
