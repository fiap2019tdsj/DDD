package br.com.fiap;

public class Carro {
    private String modelo, fabricante;
    private int anoFabricacao;
    private boolean airBag, abs, direcaoHidraulica, arCondicionado;
    private Cor cor;
    private double preco,IPI,ICMS;
    
    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public boolean isAirBag() {
        return airBag;
    }

    public void setAirBag(boolean airBag) {
        this.airBag = airBag;
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public boolean isDirecaoHidraulica() {
        return direcaoHidraulica;
    }

    public void setDirecaoHidraulica(boolean direcaoHidraulica) {
        this.direcaoHidraulica = direcaoHidraulica;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public void exibirOpcionais() {
        System.out.println("Os opcionais do carro s�o:\nAir Bag?: " + isAirBag() 
        + "\nAbs?: " + isAbs() + "\nDirecao Hidr�ulica?:" + isDirecaoHidraulica()
        + "\nAr Condicionado?: " + isArCondicionado() + "\nCor Met�lica?:" + cor.isCorMetalica());
        
    }
    
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public double getIPI() {
        return IPI = (preco*0.075);
    }
    
    public double getICMS() {
        return ICMS = (preco*0.06);
    }
    
    public double getImpostos() {
        return IPI + ICMS;
    }
    
    
    public void exibirTudo() {
        System.out.println("Os dados do carro s�o:\nModelo: " + getModelo() 
        + "\nFabricante: " + getFabricante() + "\nAno de Fabrica��o:" + getAnoFabricacao()
        + "\nPre�o: R$" + getPreco() + "\nIPI: R$" + getIPI() + "\nICMS: R$" + getICMS() 
        + "\nTotal de Impostos: R$" + getImpostos());
        exibirOpcionais();
        
    }
    
    
}