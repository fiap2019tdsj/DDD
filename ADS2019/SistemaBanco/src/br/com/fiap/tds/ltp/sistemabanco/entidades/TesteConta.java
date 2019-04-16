package br.com.fiap.tds.ltp.sistemabanco.entidades;

public class TesteConta {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		ContaCorrente cc = new ContaCorrente();
		Endereco endereco = new Endereco();
		
		endereco.rua = "Alagoas";
		endereco.numero = 33;
		endereco.complemento = "AP 07";
		endereco.bairro = "Brás";
		endereco.cep = "85561-387";
		
		cliente.nome = "Olavo de Carvalho";
		cliente.cpf = "369.785.699-12";
		cliente.endereco = endereco;
		
		cc.saldo = 7950.33;
		cc.titular = cliente;
	}

}
