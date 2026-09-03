
package com.mycompany.controle;

import java.util.ArrayList;
import java.util.Scanner;

public class Controle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Aluno> listaAlunos = new ArrayList<>();

        System.out.println("--- Cadastro de Alunos ---");

        while (true) {
            System.out.print("\nDigite o nome do aluno (ou 'fim' para encerrar): ");
            String nome = scanner.nextLine();


            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Digite a primeira nota parcial (0 a 100): ");
            int nota1 = scanner.nextInt();

            System.out.print("Digite a segunda nota parcial (0 a 100): ");
            int nota2 = scanner.nextInt();
            
            scanner.nextLine(); 

           
            Aluno novoAluno = new Aluno(nome, nota1, nota2);
            listaAlunos.add(novoAluno);
        }

      
        if (listaAlunos.isEmpty()) {
            System.out.println("\nNenhum aluno foi cadastrado.");
            scanner.close();
            return;
        }

   
        double somaMediasTurma = 0;
        int aprovados = 0;
        int naFinal = 0;
        int reprovados = 0;


        for (Aluno aluno : listaAlunos) {
            double mediaAluno = aluno.getMediaIndividual();
            somaMediasTurma += mediaAluno;


            if (mediaAluno >= 70) {
                aprovados++;
            } else if (mediaAluno >= 40) {
                naFinal++;
            } else {
                reprovados++;
            }
        }


        double mediaTurma = somaMediasTurma / listaAlunos.size();


        System.out.println("\n===== RESULTADOS DA TURMA =====");
        System.out.printf("Média da turma: %.2f\n", mediaTurma);
        System.out.println("Quantidade de alunos aprovados: " + aprovados);
        System.out.println("Quantidade de alunos na final: " + naFinal);
        System.out.println("Quantidade de alunos reprovados: " + reprovados);

   
        System.out.println("\nAlunos com média abaixo da média da turma:");
        boolean encontrouAbaixo = false;
        for (Aluno aluno : listaAlunos) {
            if (aluno.getMediaIndividual() < mediaTurma) {
                System.out.printf("- %s (Média: %.2f)\n", aluno.getNome(), aluno.getMediaIndividual());
                encontrouAbaixo = true;
            }
        }

        if (!encontrouAbaixo) {
            System.out.println("Nenhum aluno ficou abaixo da média geral.");
        }

        scanner.close();
    }
}
