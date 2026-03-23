package Básicos.Outros;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

//        Desafio 2 — Soma de números
//        Agora começa a ficar mais interessante.
//        Faça um programa que:
//        peça ao usuário um número N
//        calcule a soma de todos os números de 1 até N

        Scanner sc = new Scanner(System.in);

        int numero;
        int total = 0;

        System.out.println("Informe um número: ");
        numero = sc.nextInt();

        for (int i = 1; i <= numero; i ++){
            total += i;
        }

        System.out.println("Total: " + total);
    }

}
