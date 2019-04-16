package br.com.fiap;

public class ContaCorrente {
    public String titular;
    private String numeroContaCorrente;
    private double saldo;
    private int agenciaContaCorrente;
    
    public double deposito (double valor) {
        return saldo += valor;
    }
    
    public double saque (double valor) {
        return saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void exibirSaldo() {
        System.out.println("Olá " + titular + ", o seu saldo é: R$" + saldo);
    }
}