
package com.mycompany.testaranimais;

public class TestarAnimais {

    public static void main(String[] args) {


        Mamifero camelo = new Mamifero(
                "Camelo",
                150,
                4,
                "Amarelo",
                "Terra",
                2.0f,
                "Vegetais"
        );

        
        Peixe tubarao = new Peixe(
                "Tubarão",
                300,
                0,
                "Cinzento",
                "Mar",
                1.5f,
                "Barbatanas e cauda"
        );


        Mamifero ursocanada = new Mamifero(
                "Urso-do-Canada",
                180,
                4,
                "Vermelho",
                "Terra",
                0.5f,
                "Mel"
        );


        camelo.dadosMamifero();

        System.out.println();

        tubarao.dadosPeixe();

        System.out.println();

        ursocanada.dadosMamifero();
    }
}

