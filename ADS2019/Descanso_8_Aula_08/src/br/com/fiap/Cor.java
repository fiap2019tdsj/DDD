package br.com.fiap;

public class Cor {
    private String nome;
    private boolean corMetalica;
    
    public void setCorMetalica(boolean corMetalica) {
        this.corMetalica = corMetalica;
    }

    public boolean isCorMetalica() {
        return corMetalica;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }  
}