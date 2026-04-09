package com.mycompany.calculadorasimples;

public class CalculadoraSimples {

    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Não dividir por zero.");
            return 0;
        }
        return a / b;
    }
}  

