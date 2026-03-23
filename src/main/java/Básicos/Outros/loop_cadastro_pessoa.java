package Básicos.Outros;

import java.util.Scanner;

public class loop_cadastro_pessoa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade;
        float peso;
        char parar = 's';
        int pessoas = 0;

        do {
            System.out.println("Quem é você? ");
            System.out.println("Nome: ");
            nome = scanner.next();
            System.out.println("Idade: ");
            idade = scanner.nextInt();
            System.out.println("Peso: ");
            peso = scanner.nextFloat();
            System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nPeso: " + peso);
            pessoas = pessoas + 1;
            System.out.println("Deseja continuar? (s/n)");
            parar = scanner.next().charAt(0);

        } while (Character.toLowerCase(parar) == 's');
        System.out.println("Pessoas cadastradas: " + pessoas);
        scanner.close();
    }
}