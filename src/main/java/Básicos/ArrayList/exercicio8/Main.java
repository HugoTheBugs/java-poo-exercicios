package Básicos.ArrayList.exercicio8;

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

        System.out.println("Infome um nome para remover: ");
        String nomeBusca = sc.nextLine();

        for (int i = 0; i < produtos.size(); i++){
            if (nomeBusca.equalsIgnoreCase(produtos.get(i).getName())){
                System.out.println("Produto removido: " + produtos.get(i).getName());
                produtos.remove(i);
                i--;
            }
        }

        System.out.println("\n=== Lista Atualizada===");
        for (Produto p: produtos){
            System.out.println("Nome: " + p.getName() + " | Preço: " + p.getPrice());
        }

        sc.close();
    }
}
