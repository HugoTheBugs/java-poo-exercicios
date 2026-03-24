package Básicos.ArrayList.exercicio9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        ArrayList<Aluno> alunos = new ArrayList<>();

        while (true){
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            if (nome.equalsIgnoreCase("fim")){
                break;
            }
            System.out.println("Nota: ");
            double nota = sc.nextDouble();
            sc.nextLine();
            alunos.add(new Aluno(nome, nota));
        }

        for (Aluno a: alunos){
            System.out.printf("Nome: %s | Nota: %.2f\n", a.getNome(), a.getNota());
        }

        System.out.println("Informe um nome para busca: ");
        String nomeProcurado = sc.nextLine();

        boolean encontrou = false;
        for (int i = 0; i < alunos.size(); i++){
            if (nomeProcurado.equalsIgnoreCase(alunos.get(i).getNome())){
                encontrou = true;

                System.out.println("\n=== Aluno encontrado! ===\n");
                System.out.println("Informe um novo nome: ");
                String nome = sc.nextLine();
                System.out.println("Informe a nova nota: ");
                double nota = sc.nextDouble();
                sc.nextLine();
                alunos.get(i).setNome(nome);
                alunos.get(i).setNota(nota);
                break;
            }
        }

        if (!encontrou){
            System.out.println("\nAluno não encontrado!");
        }

        System.out.println("\n=== Nova lista ===");
        for (Aluno a: alunos){
            System.out.printf("Nome: %s | Nota: %.2f\n", a.getNome(), a.getNota());
        }

        sc.close();
    }
}
