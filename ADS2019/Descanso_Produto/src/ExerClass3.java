import javax.swing.*;

public class ExerClass3 {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		
		p1.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto:")));
		p1.setDescricao(JOptionPane.showInputDialog("Digite a descrição do produto:"));
		p1.setMarca(JOptionPane.showInputDialog("Digite a marca do produto:"));
		p1.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto:")));
		
		System.out.println("Produto 1: " + p1.getDescricao() + " - " + p1.getValor());
	}

}
