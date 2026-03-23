package Básicos.ArrayList.exercicio6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        ArrayList<Produto> produtos = new ArrayList<>();

        for (int i = 0; i < 3; i++){
            System.out.println("Nome do produto: ");
            String nome = sc.next();
            System.out.println("Preço: ");
            double preco = sc.nextDouble();

            produtos.add(new Produto(nome, preco));
        }

        Produto maisCaro = null;
        for (Produto p: produtos){
            System.out.println("Nome: " + p.getNome() + " | Preço: " + p.getPreco());

            if (maisCaro == null || p.getPreco() > maisCaro.getPreco()){
                maisCaro = p;
            }
        }

        System.out.println("\n=== Produto mais caro === ");
        System.out.println("Nome: " + maisCaro.getNome() + " | Preço: " + maisCaro.getPreco());

    }
}
