package POO.exercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Curso[] cursos = new Curso[3];

        System.out.println("=== Cadastro de Cursos ===");

        for (int i = 0; i < cursos.length; i++){

            System.out.println("Nome Professor: ");
            String nomeProfessor = sc.nextLine();

            System.out.println("Especialidade: ");
            String especialidade = sc.nextLine();

            Professor professor = new Professor(nomeProfessor, especialidade);

            System.out.println("Nome curso: ");
            String nomeCurso = sc.nextLine();

            System.out.println("Duração (Hrs): ");
            int duracao = Integer.parseInt(sc.nextLine());


            cursos[i] = new Curso(nomeCurso, duracao, professor);
        }

        System.out.println("=== Cursos ===");

        int totalDuracao = 0;
        int indiceMaiorDuracao = 0;

        for (int i = 0; i < cursos.length; i++){

            Curso c = cursos[i];

            System.out.println(
                    "Nome curso: " + c.getNomeCurso()
                    + " | Duração (Hrs): " + c.getDuracaoHoras()
                    + " | Professor: " + c.getProfessor().getNome()
                    + " | Especialidade: " + c.getProfessor().getEspecialidade()
            );

            totalDuracao += c.getDuracaoHoras();

            if(cursos[indiceMaiorDuracao].getDuracaoHoras() < c.getDuracaoHoras()){
                indiceMaiorDuracao = i;
            }
        }

        float media = (float) totalDuracao/ cursos.length;

        System.out.printf("Média de duração: %.2f\n", media);
        System.out.println("Curso com maior duração: " + cursos[indiceMaiorDuracao].getNomeCurso());
    }
}
