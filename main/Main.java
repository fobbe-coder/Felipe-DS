
package com.mycompany.main;


public class Main {

    public static void main(String[] args) {


        Carro carro = new Carro("Toyota", "Corolla", 2.0);

        Moto moto = new Moto("Honda", "CB500", 500);

        Caminhao caminhao = new Caminhao("Volvo", "FH", 3000);


        carro.exibirInformacoes();

        moto.exibirInformacoes();

        caminhao.exibirInformacoes();
    }
}
