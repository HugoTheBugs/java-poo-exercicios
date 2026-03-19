package POO.exercicio10;

public class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String _nome, double _salarioBase){
        this.nome = _nome;
        this.salarioBase = _salarioBase;
    }

    public String getNome(){
        return nome;
    }

    public double getSalarioBase(){
        return salarioBase;
    }

    public void setNome(String _nome){
        this.nome = _nome;
    }

    public void setSalarioBase(double _salarioBase){
        this.salarioBase = _salarioBase;
    }


}