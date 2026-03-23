package POO.exercicio12;

public class Prato extends Item{
    private boolean temAdicional;

    public Prato (String _nome, double _preco, boolean _temAdicional) {
        super(_nome, _preco);
        this.temAdicional = _temAdicional;
    }

    public boolean getTemAdicional(){
        return temAdicional;
    }

    public void setTemAdicional(boolean _temAdicional){
        this.temAdicional = _temAdicional;
    }

    @Override
    public double calcularPreco(){
        if (temAdicional){
            return getPreco() + 5;
        } else return getPreco();
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println(
                " | Adicional : " + temAdicional +
                        " | Preço: " + calcularPreco()
        );
    }
}