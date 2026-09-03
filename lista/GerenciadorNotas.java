
package com.mycompany.lista;


import java.util.ArrayList;
import java.util.Collections;

public class GerenciadorNotas {
    private ArrayList<Double> notas;


    public GerenciadorNotas() {
        this.notas = new ArrayList<>();
    }


    public void adicionarNota(double nota) {
        notas.add(nota);
        System.out.println("Nota " + nota + " adicionada com sucesso!");
    }


    public void removerNota(int indice) {
        if (indice >= 0 && indice < notas.size()) {
            double removida = notas.remove(indice);
            System.out.println("Nota " + removida + " removida com sucesso!");
        } else {
            System.out.println("Posição inválida!");
        }
    }


    public void listarNotas() {
        if (notas.isEmpty()) {
            System.out.println("Nenhuma nota cadastrada.");
            return;
        }
        System.out.println("\n--- Lista de Notas ---");
        for (int i = 0; i < notas.size(); i++) {
            System.out.println("Posição " + i + ": " + notas.get(i));
        }
    }


    public void calcularMedia() {
        if (notas.isEmpty()) {
            System.out.println("Não há notas para calcular a média.");
            return;
        }
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.size();
        System.out.println("Média das notas: " + media);
    }


    public void ordenarNotas() {
        if (notas.isEmpty()) {
            System.out.println("Não há notas para ordenar.");
            return;
        }
        Collections.sort(notas);
        System.out.println("Notas ordenadas com sucesso!");
    }


    public boolean temNotas() {
        return !notas.isEmpty();
    }
}