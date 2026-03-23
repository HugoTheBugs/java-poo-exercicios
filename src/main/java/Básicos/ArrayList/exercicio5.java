package Básicos.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> inteiros = new ArrayList<>();

        int numero;

        do {
            System.out.println("Informe um número inteiro (0 para sair): ");
            numero = sc.nextInt();

            if (numero != 0){
                inteiros.add(numero);
            }

        }   while (numero != 0);

        System.out.println("\n=== Lista de números ===");
        for (int i = 0; i < inteiros.size(); i++){
            System.out.println(inteiros.get(i));
        }

        for (int i = 0; i < inteiros.size(); i++){
            if (inteiros.get(i) % 2 == 0){
                inteiros.remove(i);
                i--;
            }
        }

        System.out.println("\n=== Lista sem pares ===");
        for (Integer i: inteiros){
            System.out.println(i);
        }

        sc.close();
    }
}