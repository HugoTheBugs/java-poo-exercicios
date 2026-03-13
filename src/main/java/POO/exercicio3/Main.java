package POO.exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto[] produtos = new Produto[5];

        for (int i = 0; i < produtos.length; i++) {

            System.out.println("Produto " + (i+1));

            System.out.println("Nome:");
            String nome = sc.next();

            System.out.println("Preço:");
            double preco = sc.nextDouble();

            System.out.println("Quantidade:");
            int quantidade = sc.nextInt();

            produtos[i] = new Produto(nome, preco, quantidade);
        }

        System.out.println("\n=== PRODUTOS CADASTRADOS ===");

        double totalEstoque = 0;

        for (int i = 0; i < produtos.length; i++){

            Produto p = produtos[i];

            System.out.println(
                    "Produto: " + p.nome +
                    " | Preço: " + p.preco +
                    " | Quantidade: " + p.quantidade
            );

            totalEstoque += p.valorEstoque();
        }

        System.out.println("\nValor total do estoque: " + totalEstoque);

        sc.close();
    }
}
