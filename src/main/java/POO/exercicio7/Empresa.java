package POO.exercicio7;

public class Empresa {
    private String nomeEmpresa;
    private Funcionario[] funcionarios;
    private int quantidade;

    public Empresa(String nomeEmpresa){
        this.nomeEmpresa = nomeEmpresa;
        this.funcionarios = new Funcionario[10];
        this.quantidade = 0;
    }

    public String getNomeEmpresa(){
        return nomeEmpresa;
    }

    public Funcionario[] getFuncionarios(){
        return funcionarios;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setNomeEmpresa(String nomeEmpresa){
        this.nomeEmpresa = nomeEmpresa;
    }

    public void setFuncionarios(Funcionario[] funcionarios){
        this.funcionarios = funcionarios;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public void adicionarFuncionario(Funcionario f){
        if(quantidade < funcionarios.length){
            funcionarios[quantidade] = f;
            quantidade++;
        } else {
            System.out.println("Limite de funcionários atingido!");
        }
    }

    public void listarFuncionarios(){
        if (quantidade == 0){
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }

        for (int i = 0; i < quantidade; i++){
            System.out.println(
                    "Nome: " + funcionarios[i].getNome() +
                    " | Cargo: " + funcionarios[i].getCargo() +
                    " | Salário: " + funcionarios[i].getSalario());
        }
    }

    public void mostrarMaiorSalario(){
        if (quantidade == 0) {
            System.out.println("Nenhum funcionário cadastrado");
            return;
        }

        int indiceMaior = 0;

        for (int i = 1; i < quantidade; i++){
            if(funcionarios[i].getSalario() > funcionarios[indiceMaior].getSalario()){
                indiceMaior = i;
            }
        }

        Funcionario f = funcionarios[indiceMaior];

        System.out.println(
                "Maior salário: " + f.getNome() +
                " | R$ " + f.getSalario()
        );
    }

    public void mostrarMediaSalarial(){
        if(quantidade == 0){
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }

        float total = 0;

        for (int i = 0; i < quantidade; i++){
            total += funcionarios[i].getSalario();
        }

        float media = total / quantidade;

        System.out.printf("Média salarial: %.2f\n", media);
    }
}