package POO.exercicio10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funcionario[] funcionarios = new Funcionario[3];

        funcionarios[0] = new Funcionario("Hugo", 7033);
        funcionarios[1] = new Gerente("Batman", 10000.99, 3000);
        funcionarios[2] = new Vendedor("Japunês", 5000, 15000, 0.1);

        double totalFolha = 0;

        for (int i = 0; i < funcionarios.length; i++){
            funcionarios[i].exibirDados();
            totalFolha += funcionarios[i].calcularSalario();
        }

        System.out.println("Total da folha: " + totalFolha);
    }
}
