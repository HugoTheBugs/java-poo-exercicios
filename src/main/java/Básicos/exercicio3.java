package Básicos;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int pares = 0;
        int impares = 0;
        int maiorNumero = 0;
        int menorNumero = 0;
        boolean primeiro = true;

        do {
            System.out.println("Informe um número: ");
            numero = sc.nextInt();

            if(numero != 0) {

                if (numero % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }

                if(primeiro){
                    menorNumero = numero;
                    maiorNumero = numero;
                    primeiro = false;
                }

                if (numero > maiorNumero) {
                    maiorNumero = numero;
                }

                if (numero < menorNumero) {
                    menorNumero = numero;
                }
            }

        } while (numero != 0);

        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
        System.out.println("Maior número: " + maiorNumero);
        System.out.println("Menor número: " + menorNumero);

        sc.close();
    }
}