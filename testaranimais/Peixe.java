
package com.mycompany.testaranimais;

public class Peixe extends Animal {


    private String caracteristica;

    
    public Peixe(String nome, float comprimento, int numeroPatas,
                  String cor, String ambiente, float velocidadeMedia,
                  String caracteristica) {


        super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);

        this.caracteristica = caracteristica;
    }


    public String getCaracteristica() {
        return caracteristica;
    }


    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

 
    public void dadosPeixe() {

        System.out.println("===== DADOS DO PEIXE =====");
        System.out.println("Nome: " + getNome());
        System.out.println("Comprimento: " + getComprimento());
        System.out.println("Número de patas: " + getNumeroPatas());
        System.out.println("Cor: " + getCor());
        System.out.println("Ambiente: " + getAmbiente());
        System.out.println("Velocidade Média: " + getVelocidadeMedia());
        System.out.println("Característica: " + caracteristica);
    }
}

