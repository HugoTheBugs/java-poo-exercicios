package POO.exercicio8;

public class Estoque {

    private String nomeEstoque;
    private Produto[] produtos;
    private int quantidade;

    public Estoque(String nomeEstoque){
        this.nomeEstoque = nomeEstoque;
        this.produtos = new Produto[3];
        this.quantidade = 0;
    }

    public String getNomeEstoque(){
        return nomeEstoque;
    }

    public Produto[] getProdutos(){
        return produtos;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setNomeEstoque(String nomeEstoque){
        this.nomeEstoque = nomeEstoque;
    }

    public void setProdutos(Produto[] produtos){
        this.produtos = produtos;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public void cadastrarProduto(Produto p){
        if (quantidade < produtos.length){
            produtos[quantidade] = p;
            quantidade++;
        }else {
            System.out.println("Limite de produtos atingido!");
        }
    }

    public void listarProduto(){
        if (quantidade == 0){
            System.out.println("Nenhum produto cadastrado!");
            return;
        }

        for (int i = 0; i < quantidade; i++){
            System.out.println(
                    "Produto: " + produtos[i].getNome()
                    + " | Preço: " + produtos[i].getPreco()
                    + " | Quantidade: " + produtos[i].getQuantidade());
        }
    }

    public void listarProdutoMaisCaro(){
        if (quantidade == 0) {
            System.out.println("Nenhum produto cadastrado!");
            return;
        }

        int indiceMaisCaro = 0;

        for (int i = 1; i < quantidade; i++){
            if (produtos[i].getPreco() > produtos[indiceMaisCaro].getPreco() ){
                indiceMaisCaro = i;
            }
        }

        Produto p = produtos[indiceMaisCaro];

        System.out.println(
                "Produto mais caro: " + p.getNome()
                + " | Preço: " + p.getPreco()
        );
    }

    public void valorTotalEstoque(){
        if (quantidade == 0){
            System.out.println("Nenhum produto cadastrado!");
            return;
        }

        float totalEstoque = 0;

        for (int i = 0; i < quantidade; i++){
            totalEstoque += produtos[i].getQuantidade() * produtos[i].getPreco();
        }

        System.out.println("Valor total estoque: " + totalEstoque);
    }
}