package POO.exercicio8;

public class Produto {

    private String nome;
    private float preco;
    private float quantidade;

    public Produto(String nome, float preco, float quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return nome;
    }

    public float getPreco(){
        return preco;
    }

    public float getQuantidade(){
        return quantidade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(float preco){
        this.preco = preco;
    }

    public void setQuantidade(float quantidade){
        this.quantidade = quantidade;
    }
}
