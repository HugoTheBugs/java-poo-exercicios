package Básicos;

import java.util.Scanner;

public class exercicio2 {

//    Problema: Estatística de pessoas
//    Faça um programa que leia várias pessoas e mostre no final:
//    total de pessoas
//    média de idade
//    quantas pessoas têm mais de 18 anos
//    quantas pessoas pesam mais de 80kg

    public static void main(String[] args) {
        int idade;
        float peso;
        int totalPessoas = 0;
        int totalIdades = 0;
        int maioresDeIdade = 0;
        int maisDe80kg = 0;
        char parar;

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Estatísticas Pessoas ===");

        do {
            System.out.println("Peso: ");
            peso = sc.nextFloat();
            System.out.println("Idade: ");
            idade = sc.nextInt();

            if(idade >= 18){
                maioresDeIdade++;
            }

            if(peso > 80){
                maisDe80kg++;
            }

            totalPessoas++;
            totalIdades += idade;

            System.out.println("Deseja continuar? (s/n)");
            parar = sc.next().charAt(0);

        } while (Character.toLowerCase(parar) == 's');

        System.out.println("Pessoas cadastradas: " + totalPessoas);
        System.out.println("Média Idades:" + (float) totalIdades/ totalPessoas);
        System.out.println("Maiores de idade: " + maioresDeIdade);
        System.out.println("Com mais de 80kg: " + maisDe80kg);
    }
}