package POO.exercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Veiculo[] veiculos = new Veiculo[3];

        for (int i = 0; i < veiculos.length; i++){

            System.out.println("\n=== Cadastro Veículo " + (i+1) + " ===");

            System.out.println("Nome do proprietário");
            String nome = sc.next();

            System.out.println("Idade do proprietário: ");
            int idade = sc.nextInt();

            Proprietario proprietario = new Proprietario(nome, idade);

            System.out.println("Modelo do veículo: ");
            String modelo = sc.next();

            System.out.println("Preço do veículo: ");
            double preco = sc.nextDouble();

            veiculos[i] = new Veiculo(modelo, preco, proprietario);
        }

        System.out.println("\n=== VEÍCULOS CADASTRADOS ===");

        double totalPreco = 0;
        int indiceMaisCaro = 0;

        for (int i = 0; i < veiculos.length; i++){

            Veiculo v = veiculos[i];

            System.out.println(
                    "Modelo: " + v.getModelo() +
                    " | Preço: " + v.getPreco() +
                    " | Proprietário: " + v.getProprietario().getNome()
            );

            totalPreco += v.getPreco();

            if(v.getPreco() > veiculos[indiceMaisCaro].getPreco()) {
                indiceMaisCaro = i;
            }

        }

        System.out.println("\nVeículo mais caro: " + veiculos[indiceMaisCaro].getModelo());

        System.out.println("\nPreço médio: " + totalPreco/ veiculos.length);

        sc.close();

    }
}
