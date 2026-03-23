package POO.exercicio11;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String _nome, double _preco) {
        this.nome = _nome;
        this.preco = _preco;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setNome(String _nome) {
        this.nome = _nome;
    }

    public void setPreco(double _preco) {
        this.preco = _preco;
    }

    public double calcularPrecoFinal(){
        return preco;
    }

    public void exibirDados() {
        System.out.println(
                "Nome: " + nome +
                " | Preço: " + preco);
    }
}