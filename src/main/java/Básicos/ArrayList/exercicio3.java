package Básicos.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> inteiros = new ArrayList<>();

        for (int i = 0; i < 6; i++){
            System.out.println("Informe o número na posição: " + (i+1));
            Integer numero = sc.nextInt();
            inteiros.add(numero);
        }

        int maior = inteiros.get(0);
        int menor = inteiros.get(0);

        for (Integer i: inteiros){
            if (maior < i){
                maior = i;
            }

            if (menor > i){
                menor = i;
            }
        }

        System.out.println("\nMenor número: " + menor);
        System.out.println("\nMaior número: " + maior);

        sc.close();
    }
}
