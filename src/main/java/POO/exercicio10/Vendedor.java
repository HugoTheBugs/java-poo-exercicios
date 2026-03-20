package POO.exercicio10;

public class Vendedor extends Funcionario{
    private double totalVendas;
    private double comissao;

    public Vendedor(String _nome, double _salarioBase, double _totalVendas, double _comissao){
        super(_nome, _salarioBase);
        this.totalVendas = _totalVendas;
        this.comissao = _comissao;
    }

    public double getTotalVendas(){
        return totalVendas;
    }

    public double getComissao(){
        return comissao;
    }

    public void setTotalVendas(double _totalVendas){
        this.totalVendas = _totalVendas;
    }

    public void setComissao(double _comissao){
        this.comissao = _comissao;
    }

    @Override
    public double calcularSalario(){
        return getSalarioBase() + (totalVendas * comissao);
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Vendas: " + totalVendas +
                " | Comissão: " + comissao);
    }
}
