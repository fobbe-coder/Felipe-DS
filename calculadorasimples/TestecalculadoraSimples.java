package com.mycompany.calculadorasimples;

public class TestecalculadoraSimples {

    public static void main(String[] args) {
        
        CalculadoraSimples calc = new CalculadoraSimples();

     
        int num1 = 8;
        int num2 = 4;


        int soma = calc.somar(num1, num2);
        int subtracao = calc.subtrair(num1, num2);
        int multiplicacao = calc.multiplicar(num1, num2);
        int divisao = calc.dividir(num1, num2);

     
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }
}