package com.mycompany.lista;

import java.util.Scanner;

public class Lista {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorNotas gerenciador = new GerenciadorNotas();

        // Requisito inicial: Solicitar notas iniciais ao usuário
        System.out.println("--- Cadastro Inicial de Notas ---");
        System.out.println("Digite as notas iniciais (digite um número negativo para encerrar o cadastro inicial):");
        while (true) {
            System.out.print("Digite uma nota: ");
            double nota = scanner.nextDouble();
            if (nota < 0) {
                break;
            }
            gerenciador.adicionarNota(nota);
        }

        // Loop do Menu Principal
        int opcao = 0;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Adicionar nota");
            System.out.println("2 - Remover nota");
            System.out.println("3 - Listar notas");
            System.out.println("4 - Calcular média");
            System.out.println("5 - Ordenar notas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a nova nota a ser adicionada: ");
                    double novaNota = scanner.nextDouble();
                    gerenciador.adicionarNota(novaNota);
                    break;

                case 2:
                    if (!gerenciador.temNotas()) {
                        System.out.println("Nenhuma nota cadastrada para remover.");
                    } else {
                        gerenciador.listarNotas();
                        System.out.print("Digite a posição da nota que deseja remover: ");
                        int indice = scanner.nextInt();
                        gerenciador.removerNota(indice);
                    }
                    break;

                case 3:
                    gerenciador.listarNotas();
                    break;

                case 4:
                    gerenciador.calcularMedia();
                    break;

                case 5:
                    gerenciador.ordenarNotas();
                    gerenciador.listarNotas(); // Exibe a lista após ordenar
                    break;

                case 0:
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
