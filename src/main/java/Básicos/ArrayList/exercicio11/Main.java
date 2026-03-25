package Básicos.ArrayList.exercicio11;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Aluno> alunos = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Buscar aluno");
            System.out.println("4 - Atualizar aluno");
            System.out.println("5 - Remover aluno");
            System.out.println("0 - Sair\n");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    cadastrarAluno(alunos, sc);
                    break;

                case 2:
                    listarAlunos(alunos, sc);
                    break;

                case 3:
                    buscarAluno(alunos, sc);
                    break;

                case 4:
                    atualizarAluno(alunos, sc);
                    break;

                case 5:
                    removerAluno(alunos, sc);
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opção inválida!");

            }

        } while (opcao!= 0);

        sc.close();
    }

    public static void cadastrarAluno(ArrayList<Aluno> alunos, Scanner sc){
        System.out.println("Cadastrando aluno...");
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("Nota: ");
        double nota = sc.nextDouble();
        sc.nextLine();
        alunos.add(new Aluno(nome, nota));
        System.out.println("Aluno cadastrado com sucesso!\n");
    }

    public static void listarAlunos(ArrayList<Aluno> alunos, Scanner sc){
        System.out.println("Listando aluno...");
        if (alunos.isEmpty()){
            System.out.println("Nenhum aluno cadastrado.");
        }
        for (Aluno a: alunos){
            System.out.printf("Nome: %s | Nota: %.2f\n", a.getNome(), a.getNota());
        }
    }

    public static void buscarAluno(ArrayList<Aluno> alunos, Scanner sc){
        System.out.println("Buscando aluno...");
        System.out.println("Informe o nome do aluno a ser buscado: ");
        String nomeProcurado = sc.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < alunos.size(); i++){
            if (nomeProcurado.equalsIgnoreCase(alunos.get(i).getNome())){
                System.out.println("Aluno encontrado!");
                encontrado = true;
                System.out.printf("Nome: %s | Nota: %.2f\n", alunos.get(i).getNome(), alunos.get(i).getNota());
                break;
            }
        }

        if (!encontrado){
            System.out.println("Aluno não encontrado!");
        }
    }

    public static void atualizarAluno(ArrayList<Aluno> alunos, Scanner sc){
        System.out.println("Atualizando aluno...");
        System.out.println("Informe o nome do aluno a ser alterado: ");
        String nomeBuscado = sc.nextLine();
        boolean encontradoAlteracao = false;

        for (int i = 0; i < alunos.size(); i++){
            if (nomeBuscado.equalsIgnoreCase(alunos.get(i).getNome())){
                System.out.println("Aluno encontrado!");
                encontradoAlteracao = true;
                System.out.println("Informe o novo nome: ");
                String novoNome = sc.nextLine();
                System.out.println("Informe a nova nota: ");
                double novaNota = sc.nextDouble();
                sc.nextLine();
                alunos.get(i).setNome(novoNome);
                alunos.get(i).setNota(novaNota);
                System.out.println("Alterado com sucesso!\n");
                break;
            }
        }
        if (!encontradoAlteracao){
            System.out.println("Aluno não encontrado!");
        }
    }

    public static void removerAluno(ArrayList<Aluno> alunos, Scanner sc){
        System.out.println("Removendo aluno...");
        System.out.println("Informe o nome do aluno a ser removido: ");
        String nomeRemocao = sc.nextLine();
        boolean encontradoRemocao = false;

        for (int i = 0; i < alunos.size(); i++){
            if (nomeRemocao.equalsIgnoreCase(alunos.get(i).getNome())){
                System.out.println("Aluno encontrado!");
                encontradoRemocao = true;
                System.out.printf("%s removido com sucesso!\n", alunos.get(i).getNome());
                alunos.remove(i);

                break;
            }
        }

        if (!encontradoRemocao){
            System.out.println("Aluno não encontrado!");
        }
    }
}
