package br.com.fiap;

import javax.swing.JOptionPane;

public class Salario {
	public static void main(String[] args) {
		double valorHora;
		int horasTrabalhadas;
		
		horasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas no mês"));
		
		valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor/hora"));
		
		JOptionPane.showMessageDialog(null, "O seu salário atual é de " + valorHora * horasTrabalhadas);
	}
}
