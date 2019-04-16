package br.com.fiap.tds.ltp.sistemabanco.entidades;

public class Endereco {
	public String rua;
	public short numero;
	public String complemento;
	public String bairro;
	public String cep;
	
	public short getNumero() {
		return numero;
	}
	
	public void setNumero(short novoNumero) {
		numero = novoNumero;
	}
}
