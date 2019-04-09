package pessoas;

import bens.Imovel;
import bens.Veiculo;

public class PessoaFisica {
	private String nome;
	private String cpf;
	private Veiculo veiculos;
	private Imovel imoveis;
	
	public PessoaFisica() {
	}

	public PessoaFisica(String nome, String cpf, Veiculo veiculos, Imovel imoveis) {
		this.nome = nome;
		this.cpf = cpf;
		this.veiculos = veiculos;
		this.imoveis = imoveis;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Veiculo getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(Veiculo veiculos) {
		this.veiculos = veiculos;
	}

	public Imovel getImoveis() {
		return imoveis;
	}

	public void setImoveis(Imovel imoveis) {
		this.imoveis = imoveis;
	}
}
