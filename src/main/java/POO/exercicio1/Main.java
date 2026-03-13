package POO.exercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pessoa pessoa1 = new Pessoa();

        System.out.println("Nome: ");
        pessoa1.nome = sc.next();
        System.out.println("Idade: ");
        pessoa1.idade = sc.nextInt();
        System.out.println("Peso: ");
        pessoa1.peso = sc.nextDouble();

        System.out.println("Nome: " + pessoa1.nome + ", Idade: " + pessoa1.idade + ", peso: " + pessoa1.peso);

        sc.close();
    }
}
