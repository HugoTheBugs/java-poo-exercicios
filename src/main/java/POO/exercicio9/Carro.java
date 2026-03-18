package POO.exercicio9;

public class Carro extends Veiculo{

    private int portas;

    public Carro(String marca, String modelo, int ano, int portas){
        super(marca, modelo, ano);
        this.portas = portas;
    }

    public int getPortas(){
        return portas;
    }

    public void setPortas(int portas){
        this.portas = portas;
    }
}