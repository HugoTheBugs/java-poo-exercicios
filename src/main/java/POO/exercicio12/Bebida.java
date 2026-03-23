package POO.exercicio12;

public class Bebida extends Item{
    private String tamanho;

    public Bebida(String _nome, double _preco, String _tamanho){
        super(_nome, _preco);
        this.tamanho = _tamanho;
    }

    public String getTamanho(){
        return tamanho;
    }

    public void setTamanho(String _tamanho) {
        this.tamanho = _tamanho;
    }

    @Override
    public double calcularPreco(){
        int adicionalTamanho = 0;

        if (tamanho.equals("M")){
            adicionalTamanho = 2;
        } else if (tamanho.equals("G")){
            adicionalTamanho = 4;
        }
        return getPreco() + adicionalTamanho;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println(
                " | Tamanho:  " + tamanho +
                        " | Preço Final: " + calcularPreco()
        );
    }
}
