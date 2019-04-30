package br.com.fiap.beans;

public class Bacharelado extends Formacao {
	private String projetoConclusao;
	private int cargaHorariaEstagio;
	
	public Bacharelado(String projetoConclusao, int cargaHorariaEstagio) {
		super();
		this.projetoConclusao = projetoConclusao;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	
	public Bacharelado() {};

	public String getProjetoConclusao() {
		return projetoConclusao;
	}

	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}

	public int getCargaHorariaEstagio() {
		return cargaHorariaEstagio;
	}

	public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	
	public String getTudo() {
		return (
			super.getTudo() 
				+ "\nProjeto de Conclusão: " + this.projetoConclusao
				+ "\nCarga Horária de Estágio: " + this.cargaHorariaEstagio
		);
	}
	
	public void calcularMensalidade(double fator) {
		this.setMensalidade((this.getDuracao() * fator * 600) + (this.cargaHorariaEstagio * 12));
	}
}
