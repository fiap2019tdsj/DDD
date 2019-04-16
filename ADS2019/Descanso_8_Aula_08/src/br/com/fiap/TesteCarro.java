package br.com.fiap;

public class TesteCarro {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
            Carro carro = new Carro();
            Cor cor = new Cor();
            
            carro.setAbs(true);
            carro.setAirBag(true);
            carro.setAnoFabricacao(2015);
            carro.setArCondicionado(true);
            carro.setDirecaoHidraulica(true);
            carro.setFabricante("Honda");
            carro.setModelo("Honda Civic");
            carro.setPreco(26000);
            
            cor.setCorMetalica(true);
            cor.setNome("vermelho");
                
            carro.setCor(cor);
            carro.exibirTudo();
    }

}