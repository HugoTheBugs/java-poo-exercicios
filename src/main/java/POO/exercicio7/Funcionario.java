package POO.exercicio7;

public class Funcionario {
    private String nome;
    private float salario;
    private String cargo;

    public Funcionario(String nome, float salario, String cargo){
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNome(){
        return nome;
    }

    public float getSalario(){
        return salario;
    }

    public String getCargo(){
        return cargo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }
}
