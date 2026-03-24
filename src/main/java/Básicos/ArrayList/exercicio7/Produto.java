package Básicos.ArrayList.exercicio7;

public class Produto {
    private String name;
    private double price;

    public Produto(String _name, double _price) {
        this.name = _name;
        this.price = _price;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public void setName(String _name) {
        this.name = _name;
    }

    public void setPrice(double _price) {
        this.price = _price;
    }
}
