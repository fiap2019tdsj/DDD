package br.com.fiap;

import javax.swing.JOptionPane;

public class Salario {
	public static void main(String[] args) {
		double valorHora;
		int horasTrabalhadas;
		
		horasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas no m�s"));
		
		valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor/hora"));
		
		JOptionPane.showMessageDialog(null, "O seu sal�rio atual � de " + valorHora * horasTrabalhadas);
	}
}
