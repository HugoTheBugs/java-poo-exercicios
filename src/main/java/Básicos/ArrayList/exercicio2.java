package Básicos.ArrayList;

import java.util.ArrayList;

public class exercicio2 {

    public static void main(String[] args) {

        ArrayList<Integer> inteiros = new ArrayList<>();

        inteiros.add(1);
        inteiros.add(2);
        inteiros.add(10);
        inteiros.add(5);
        inteiros.add(9);

        Integer soma = 0;
        for (Integer i: inteiros){
            System.out.println(i);
            soma += i;
        }

        System.out.println("\n A soma é: " + soma);

    }
}