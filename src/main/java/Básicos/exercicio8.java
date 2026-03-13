package Básicos;

import java.util.Scanner;

public class exercicio8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[5];
        float[] notas = new float[5];

        float totalNota = 0;
        int maiorNota = 0;
        int menorNota = 0;

        for (int i = 0; i < nomes.length; i++) {

            System.out.println("Nome: ");
            nomes[i] = sc.next();

            System.out.println("Nota: ");
            notas[i] = sc.nextFloat();
        }

        for (int i = 0; i < nomes.length; i++) {

            totalNota += notas[i];

            if (notas[i] > notas[maiorNota]) {
                maiorNota = i;
            }

            if (notas[i] < notas[menorNota]) {
                menorNota = i;
            }
        }

        System.out.println("Média da turma: " + totalNota / nomes.length);
        System.out.println("Melhor aluno: " + nomes[maiorNota] + "(" + notas[maiorNota] + ")");
        System.out.println("Pior aluno: " + nomes[menorNota] + "(" + notas[menorNota] + ")");

        sc.close();
    }
}