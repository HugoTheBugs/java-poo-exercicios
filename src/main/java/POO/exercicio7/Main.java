package POO.exercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nome da empresa: ");
        String nomeEmpresa = sc.nextLine();

        Empresa empresa =  new Empresa(nomeEmpresa);

        int opcao;

        do{
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar funcionário");
            System.out.println("2 - Listar funcionários");
            System.out.println("3 - Maior salário");
            System.out.println("4 - Média salário");
            System.out.println("5 - Sair");

            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao){
                case 1:

                    System.out.println("Nome: ");
                    String nome = sc.nextLine();

                    System.out.println("Cargo: ");
                    String cargo = sc.nextLine();

                    System.out.println("Saláro: ");
                    float salario = Float.parseFloat(sc.nextLine());

                    Funcionario f = new Funcionario(nome, salario, cargo);

                    empresa.adicionarFuncionario(f);

                    break;

                case 2:
                    empresa.listarFuncionarios();
                    break;

                case 3:
                    empresa.mostrarMaiorSalario();
                    break;

                case 4:
                    empresa.mostrarMediaSalarial();
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");

            }
        } while (opcao != 5);

        sc.close();
    }
}
