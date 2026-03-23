package POO.exercicio11;

public class ProdutoDesconto extends Produto{
    private double percentualDesconto;

    public ProdutoDesconto(String _nome, double _preco, double _percentualDesconto){
        super(_nome, _preco);
        this.percentualDesconto = _percentualDesconto;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double _percentualDesconto) {
        this.percentualDesconto = _percentualDesconto;
    }

    @Override
    public double calcularPrecoFinal(){
        return getPreco() - (getPreco() * percentualDesconto);
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println(
                        " | Desconto: " + getPreco() * percentualDesconto +
                        " | Preço Final: " + calcularPrecoFinal());
    }
}
