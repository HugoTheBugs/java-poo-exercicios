package Básicos;

import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        boolean ehPrimo = true;

        System.out.println("Número é primo? ");
        numero = sc.nextInt();

        if(numero <= 1){
            ehPrimo = false;
        }

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                ehPrimo = false;
                break;
            }
        }

        if (ehPrimo){
            System.out.printf("O número %d é primo!", numero );
        } else {
            System.out.printf("O número %d não é primo!", numero );
        }
    }
}