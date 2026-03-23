package POO.exercicio12;

public class Item {
    private String nome;
    private double preco;

    public Item(String _nome, double _preco){
        this.nome = _nome;
        this.preco = _preco;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setNome(String _nome){
        this.nome = _nome;
    }

    public void setPreco(double _preco) {
        this.preco = _preco;
    }

    public double calcularPreco(){
        return preco;
    }

    public void exibirDados(){
        System.out.println(
                "Nome: " + nome +
                        " | Preço: " + preco
                );
    }
}