package Básicos.ArrayList.exercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Produto> produtos = new ArrayList<>();

        while (true){
            System.out.println("Nome do Produto: ");
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("fim")){
                break;
            }
            System.out.println("Preço: ");
            double price = sc.nextDouble();
            sc.nextLine();
            produtos.add(new Produto(name, price));
        }

        for (Produto p: produtos){
            System.out.println("Nome: " + p.getName() + " | Preço: " + p.getPrice());
        }

        System.out.println("Infome um nome para busca: ");
        String nomeBusca = sc.nextLine();
        Produto produtoProcurado = null;
        for (Produto p: produtos){
            if (nomeBusca.equalsIgnoreCase(p.getName())){
                produtoProcurado = p;
                break;
            }
        }



        if (produtoProcurado != null){
            System.out.println("\nProduto encontrado!");
            System.out.println("Nome: " + produtoProcurado.getName()+ " | Preço: " + produtoProcurado.getPrice());
        }else {
            System.out.println("\nProduto não encontrado!");
        }

        sc.close();
    }
}
