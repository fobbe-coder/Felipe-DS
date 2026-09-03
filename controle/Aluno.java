
package com.mycompany.controle;


public class Aluno {

    private String nome;
    private int nota1;
    private int nota2;


    public Aluno(String nome, int nota1, int nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }


    public double getMediaIndividual() {
        return (nota1 + nota2) / 2.0;
    }


    public String getNome() {
        return nome;
    }

    public int getNota1() {
        return nota1;
    }

    public int getNota2() {
        return nota2;
    }
}