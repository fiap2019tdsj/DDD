package br.com.fiap;

import javax.swing.JOptionPane;

public class Condicionais {
	public static void main(String args[]){
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero"));
		boolean c = true;
		boolean d = false;
		
		int opcao = JOptionPane.showConfirmDialog(null, "Esta condi��o � verdadeira?");
		if (opcao == JOptionPane.YES_OPTION) {
			c = true;
		} else {
			c = false;
		}
		
		opcao = JOptionPane.showConfirmDialog(null, "Esta condi��o � verdadeira (para compara��o com a op��o anterior)?");
		if (opcao == JOptionPane.YES_OPTION) {
			d = true;
		} else {
			d = false;
		}
		
		System.out.println(a + " igual a " + b + " : " + (a==b));
		System.out.println(a + " maior " + b + " : " + (a>b));
		System.out.println(a + " menor " + b + " : " + (a<b));
		System.out.println(c + " && " + d + " = " + (c&&d));
		System.out.println(d + " && " + c + " = " + (d&&c));
		System.out.println(c + " || " + d + " = " + (c||d));
	}
}
