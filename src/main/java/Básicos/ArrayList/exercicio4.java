package Básicos.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> inteiros = new ArrayList<>();

        int total = 0;

        for (int i = 0; i < 6; i++){
            System.out.println("Informe um número na posição: " + (i+1));
            Integer numero = sc.nextInt();
            inteiros.add(numero);
            total += numero;
        }

        int pares = 0;
        int impares = 0;
        double media = (double) total / inteiros.size();
        int acimaMedia = 0;

        for (Integer p: inteiros){
            if (p % 2 == 0){
                pares++;
            }else {
                impares++;
            }

            if (p > media){
                acimaMedia++;
            }

        }

        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
        System.out.println("Média: " + media);
        System.out.println("Números acima da média: " + acimaMedia);

        sc.close();
    }

}
