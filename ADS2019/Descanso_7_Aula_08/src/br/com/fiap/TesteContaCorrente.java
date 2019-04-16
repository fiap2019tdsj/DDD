package br.com.fiap;

import java.util.Scanner;

public class TesteContaCorrente {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ContaCorrente conta = new ContaCorrente();
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o nome do titular: ");
        conta.titular = (entrada.next() + entrada.nextLine());
        
        System.out.println("Digite o valor do depósito: ");
        conta.deposito(entrada.nextDouble());
        
        System.out.println("Digite o valor do saque: ");
        conta.saque(entrada.nextDouble());
        
        conta.exibirSaldo();
    }
}