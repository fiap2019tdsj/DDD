package br.com.fiap.beans;

public abstract class Formacao {
	private String descricao;
	private int periodo;
	private double mensalidade;
	private int duracao;
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getPeriodo() {
		return periodo;
	}
	
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	
	public double getMensalidade() {
		return mensalidade;
	}
	
	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}
	
	public int getDuracao() {
		return duracao;
	}
	
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public Formacao() {
		super();
	}

	public Formacao(String descricao, int periodo, double mensalidade, int duracao) {
		super();
		this.descricao = descricao;
		this.periodo = periodo;
		this.mensalidade = mensalidade;
		this.duracao = duracao;
	}
	
	public void definirDuracao() {
		if(this instanceof Medio) {
			this.duracao = 36;
		} else if (this instanceof Tecnologo) {
			this.duracao = 24;
		} else {
			if (this.descricao.contains("ENGENHARIA")) {
				this.duracao = 60;
			} else {
				this.duracao = 48;
			}
		}
	};
	
	public double exibirMedia(double ps1, double ps2) {
		return exibirMedia(ps1, ps2, 0.0, 0.0);
	}
	
	public double exibirMedia(double ps1, double ps2, double nac1, double nac2) {
		return exibirMedia(ps1, ps2, nac1, nac2, 0.0, 0.0);
	}
	
	public double exibirMedia(double ps1, double ps2, double nac1, double nac2,
			double am1, double am2) {
		double notaFinalPS = ((ps1 + ps2) / 2);
		double notaFinalNac = ((nac1 + nac2) / 2);
		double notaFinalAM = ((am1 + am2) / 2);
		
		return (notaFinalPS * 0.5) + (notaFinalNac * 0.2) + (notaFinalAM * 0.3);
	}
	
	public String getTudo() {
		return "Descricao: " + this.descricao
				+ "\nPeríodo: " + this.periodo
				+ "\nMensalidade: " + this.mensalidade
				+ "\nDuração: " + this.duracao;
	}
}
