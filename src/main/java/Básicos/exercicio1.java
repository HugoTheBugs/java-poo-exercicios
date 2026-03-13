package Básicos;

import java.util.Scanner;

public class exercicio1 {

//    Faça um programa que cadastre várias pessoas e ao final mostre:
//    quantidade de pessoas cadastradas
//    média das idades
//    pessoa mais velha
//    pessoa mais nova
//    ler nome, idade, peso

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        float peso;
        int pessoasCadastradas = 0;
        float totalIdades = 0;
        String nomeVelho = "";
        String nomeNovo = "";
        int idadeVelho = 0;
        int idadeNovo = 999;
        char parar;

        do {
            System.out.println("Nome: ");
            nome = sc.next();
            System.out.println("Idade: ");
            idade = sc.nextInt();
            System.out.println("Peso: ");
            peso = sc.nextFloat();

            if (idade > idadeVelho){
                idadeVelho = idade;
                nomeVelho = nome;
            }

            if (idade < idadeNovo){
                idadeNovo = idade;
                nomeNovo = nome;
            }

            pessoasCadastradas++;
            totalIdades = totalIdades + idade;
            System.out.println("Deseja continuar? (s/n)");
            parar = sc.next().charAt(0);

        } while (Character.toLowerCase(parar) == 's');


        System.out.println("Pessoas cadastradas: " + pessoasCadastradas);
        System.out.println("Média das idades: %.2f" + (totalIdades/ pessoasCadastradas));
        System.out.println("exercicio1.Pessoa mais velha: " + nomeVelho + ", idade: " + idadeVelho);
        System.out.println("exercicio1.Pessoa mais nova: " + nomeNovo + ", idade: " + idadeNovo);
    }
}