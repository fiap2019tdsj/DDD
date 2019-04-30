package br.com.fiap.beans;

public class InstrumentoMusical {
	private String classe;
	private String nome;
	private Cor cor;
	
	public InstrumentoMusical(String classe, String nome, Cor cor) {
		super();
		this.classe = classe;
		this.nome = nome;
		this.cor = cor;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
	public String exibirTudo() {
		return "Classe - " + classe.toUpperCase() 
			+ "\nNome - " + nome.toUpperCase()
			+ "\nCor - " + cor.getNome().toUpperCase();
	}
}
