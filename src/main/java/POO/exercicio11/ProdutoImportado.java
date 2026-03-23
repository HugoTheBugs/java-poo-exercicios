package POO.exercicio11;

public class ProdutoImportado extends Produto{
    private double taxaImportacao;

    public ProdutoImportado(String _nome, double _preco, double _taxaImportacao) {
        super(_nome, _preco);
        this.taxaImportacao = _taxaImportacao;
    }

    public double getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(double _taxaImportacao) {
        this.taxaImportacao = _taxaImportacao;
    }

    @Override
    public double calcularPrecoFinal(){
        return getPreco() + taxaImportacao;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println(
                        " | Taxa Importação:  " + taxaImportacao +
                        " | Preço Final: " + calcularPrecoFinal()
                );
    }
}
