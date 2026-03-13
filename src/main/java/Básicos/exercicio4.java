package Básicos;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

//        Desafio 1 — Tabuada completa//
//        Faça um programa que://
//        peça um número inteiro ao usuário//
//        mostre a tabuada desse número de 1 até 10

        Scanner sc = new Scanner(System.in);

        int numeroTabuada;

        System.out.println("Informe o número da tabuada: " );
        numeroTabuada = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d\n", numeroTabuada, i, numeroTabuada * i);
        }

        sc.close();
    }
}
