package Básicos.ArrayList;

import java.util.ArrayList;

public class exercicio1 {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Hugo");
        nomes.add("Maria");

        nomes.set(0, "Batman");

        System.out.println(nomes.size());
    }
}
