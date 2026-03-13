package POO.exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome:");
        String nome = sc.next();
        System.out.println("Preço:");
        float preco = sc.nextFloat();
        System.out.println("Quantidade:");
        float quantidade = sc.nextFloat();
        Produto produto1 = new Produto(nome, preco, quantidade);

        System.out.println("Produto: " + produto1.nome + " Preço: " + produto1.preco + " Quantidade: " + produto1.quantidade);

        sc.close();
    }
}
