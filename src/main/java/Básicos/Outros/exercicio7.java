package Básicos.Outros;

import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int[] numeros = new int[10];
        int menorNumero;
        int maiorNumero;
        int total = 0;
        boolean primeiroNumero = true;

        for (int i = 0; i < numeros.length ; i ++){
            System.out.println("Informe um número: ");
            numero = sc.nextInt();
            numeros[i] = numero;
        }

        menorNumero = numeros[0];
        maiorNumero = numeros[0];

        for (int i = 0; i < numeros.length ; i++){
            total += numeros[i];
            if (menorNumero > numeros[i]){
                menorNumero = numeros[i];
            }

            if (maiorNumero < numeros[i]){
                maiorNumero = numeros[i];
            }
        }

        //System.out.println("Total: " + total);
        System.out.println("Média: " + (float) total/ numeros.length);
        System.out.println("Menor número: " + menorNumero);
        System.out.println("Maior número: " + maiorNumero);
    }
}