package POO.exercicio4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pessoa[] pessoas = new Pessoa[5];

        int indiceMaisVelho = 0;
        int indiceMaisAlto = 0;
        int totalIdades = 0;

        for (int i = 0; i < pessoas.length; i ++){
            System.out.println("Nome: ");
            String nome = sc.next();

            System.out.println("Idade: ");
            int idade = sc.nextInt();

            System.out.println("Altura: ");
            double altura = sc.nextDouble();

            pessoas[i] = new Pessoa(nome, idade, altura);
        }

        System.out.println("\n=== Pessoas cadastradas ===");
        for (int i = 0; i < pessoas.length; i++){
            System.out.println("Nome: " + pessoas[i].nome + " | Idade: " + pessoas[i].idade + " | Altura: " + pessoas[i].altura);

            if (pessoas[i].idade > pessoas[indiceMaisVelho].idade){
                indiceMaisVelho = i;
            }

            if (pessoas[i].altura > pessoas[indiceMaisAlto].altura){
                indiceMaisAlto = i;
            }

            totalIdades += pessoas[i].idade;
        }

        System.out.println("Pessoa mais velha: " + pessoas[indiceMaisVelho].nome + " | Idade: " + pessoas[indiceMaisVelho].idade);

        System.out.println("Pessoa mais alta: " + pessoas[indiceMaisAlto].nome + " | Altura: " + pessoas[indiceMaisAlto].altura);

        System.out.println("Média das idades: " + (float) totalIdades/ pessoas.length);

        sc.close();
    }

}