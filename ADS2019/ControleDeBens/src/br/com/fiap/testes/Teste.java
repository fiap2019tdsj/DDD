package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.bens.Imovel;
import br.com.fiap.bens.Veiculo;
import br.com.fiap.pessoas.PessoaFisica;

public class Teste {

	public static void main(String[] args) {
		Veiculo v = new Veiculo();
		Imovel i = new Imovel();
		PessoaFisica pf = new PessoaFisica();
		
		v.setModelo(JOptionPane.showInputDialog("Digite o modelo do ve�culo"));
		v.setMotor(JOptionPane.showInputDialog("Digite o motor do ve�culo"));
		v.setQtdePortas(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de portas")));
		int opcao = JOptionPane.showConfirmDialog(null, "O carro � 0km?");
		
		if (opcao == JOptionPane.YES_OPTION) {
			v.setNovo(true);
		} else {
			v.setNovo(false);
		}
		
		i.setEndereco(JOptionPane.showInputDialog("Digite o endere�o completo do im�vel"));
		i.setTamanho(Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho em metros quadrados")));
		i.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do im�vel")));
		
		opcao = JOptionPane.showConfirmDialog(null, "O im�vel � residencial?");
		
		if (opcao == JOptionPane.YES_OPTION) {
			i.setResidencial(true);
		} else {
			i.setResidencial(false);
		}
		
		pf.setNome(JOptionPane.showInputDialog("Digite o nome"));
		pf.setCpf(JOptionPane.showInputDialog("Digite o CPF"));
		pf.setImoveis(i);
		pf.setVeiculos(v);
		
		System.out.println("O nome � " + pf.getNome());
		System.out.println("O cpf � " + pf.getCpf());
		System.out.println("O modelo do ve�culo � " + pf.getVeiculos().getModelo());
		System.out.println("O endere�o do im�vel � " + pf.getImoveis().getEndereco());
	}

}
