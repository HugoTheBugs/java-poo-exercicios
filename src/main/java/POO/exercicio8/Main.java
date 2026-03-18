package POO.exercicio8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do estoque: ");
        String nomeEstoque = sc.nextLine();

        Estoque estoque = new Estoque(nomeEstoque);

        int opcao;

        do {

            System.out.println("=== Selecione a opção ===\n");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Produto mais caro");
            System.out.println("4 - Valor total em estoque");
            System.out.println("5 - Sair");

            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao){
                case 1:
                    System.out.println("Produto Nome: ");
                    String nomeProduto = sc.nextLine();

                    System.out.println("Preço: ");
                    float precoProduto = Float.parseFloat(sc.nextLine());

                    System.out.println("Quantidade: ");
                    float quantidadeProduto = Float.parseFloat(sc.nextLine());

                    Produto p = new Produto(nomeProduto, precoProduto, quantidadeProduto);

                    estoque.cadastrarProduto(p);

                    break;

                case 2:
                    estoque.listarProduto();
                    break;

                case 3:
                    estoque.listarProdutoMaisCaro();
                    break;

                case 4:
                    estoque.valorTotalEstoque();
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 5);

        sc.close();
    }
}