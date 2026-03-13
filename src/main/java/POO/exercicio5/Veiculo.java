package POO.exercicio5;

public class Veiculo {
    private String modelo;
    private double preco;
    Proprietario proprietario;

    public Veiculo(String modelo, double preco, Proprietario proprietario){
        this.modelo = modelo;
        this.preco = preco;
        this.proprietario = proprietario;
    }

    public String getModelo(){
        return modelo;
    }

    public double getPreco(){
        return preco;
    }

    public Proprietario getProprietario(){
        return proprietario;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setProprietario(Proprietario proprietario){
        this.proprietario = proprietario;
    }
}