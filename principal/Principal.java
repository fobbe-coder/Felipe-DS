package com.mycompany.principal;


public class Principal {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("Felipe Barbosa",17,"A123",7.5,10.0);

        System.out.println("DADOS DO ALUNO");

        aluno.exibirDados();

        System.out.println("Média: " + aluno.calcularMedia());

        System.out.println("Situação: " + aluno.verificarSituacao());

        System.out.println("Bônus: " + aluno.calcularBonus());

        System.out.println();

        Professor professor = new Professor("Henrique",30,"P456",5000,"Desenvolvimento de Sistemas");

        System.out.println("DADOS DO PROFESSOR");

        professor.exibirDados();

        System.out.println("Bônus: R$ " + professor.calcularBonus());
    }
}
