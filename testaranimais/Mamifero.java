
package com.mycompany.testaranimais;

public class Mamifero extends Animal {


    private String alimento;


    public Mamifero(String nome, float comprimento, int numeroPatas,
                     String cor, String ambiente, float velocidadeMedia,
                     String alimento) {

  
        super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);

        this.alimento = alimento;
    }


    public String getAlimento() {
        return alimento;
    }


    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }


    public void dadosMamifero() {

        System.out.println("===== DADOS DO MAMÍFERO =====");
        System.out.println("Nome: " + getNome());
        System.out.println("Comprimento: " + getComprimento());
        System.out.println("Número de patas: " + getNumeroPatas());
        System.out.println("Cor: " + getCor());
        System.out.println("Ambiente: " + getAmbiente());
        System.out.println("Velocidade Média: " + getVelocidadeMedia());
        System.out.println("Alimento: " + alimento);
    }
}
