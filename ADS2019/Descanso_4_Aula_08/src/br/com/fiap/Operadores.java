package br.com.fiap;

import javax.swing.JOptionPane;

public class Operadores {
	public static void main(String args[]){
		
		int m1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero que ser� multiplicado"));
		int m2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero que ser� multiplicado"));
		int m = m1 * m2;
		System.out.println("Multiplicando " + m1 + " * " + m2 + " = " + m);
		
		int d1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero que ser� dividido"));
		int d2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero que ser� dividido"));
		double d = d1 / d2;
		System.out.println("Dividindo " + d1 + " por " + d2 + " = " + d);
		
		int r1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero que ser� dividido"));
		int r2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero que ser� dividido"));
		int r = r1 % r2;
		System.out.println("Resto da divis�o de " + r1 + " por " + r2 + " = " + r);
		
		int i1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero que ser� incrementado"));
		int i = i1++;
		System.out.println("Incrementando " + i + " em 1 = " + i1);
	}
}