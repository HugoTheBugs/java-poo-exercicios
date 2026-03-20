package POO.exercicio10;

public class Gerente extends Funcionario{
    private double bonus;

    public Gerente(String _nome, double _salarioBase, double _bonus){
        super(_nome, _salarioBase);
        this.bonus = _bonus;
    }

    public double getBonus(){
        return bonus;
    }

    public void setBonus(double _bonus){
        this.bonus = _bonus;
    }

    @Override
    public double calcularSalario(){
        return getSalarioBase() + bonus;
    }

    public void exibirDados(){
        super.exibirDados();
        System.out.println("Bônus: " + bonus);
    }
}