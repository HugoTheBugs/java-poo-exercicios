package POO.exercicio9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Veiculo[] veiculos = new Veiculo[2];

        veiculos[0] = new Carro("Ford", "Mustang", 2022, 4);
        veiculos[1] = new Moto("Honda", "Biz", 2026, 100);

        for (int i = 0; i < veiculos.length; i++){

            Veiculo v = veiculos[i];

            System.out.println(
                            v.getMarca() + " - " +
                            v.getModelo() + " - " +
                            v.getAno()
            );
        }
    }
}