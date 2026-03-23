package POO.exercicio12;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Item> itens;

    public Pedido(){
        itens = new ArrayList<>();
    }

    public void adicionarItem(Item item){
        itens.add(item);
    }

    public double calcularTotal(){
        double total = 0;

        for (Item i: itens){
            total += i.calcularPreco();
        }

        return total;
    }

    public void exibirPedido(){
        for (Item i: itens){
            i.exibirDados();
        }

        System.out.println("Total: " + calcularTotal());
    }


    public Item getItemMaisCaro(){
        Item maisCaro = null;
        for (Item i: itens){
            if (maisCaro == null || i.calcularPreco() > maisCaro.calcularPreco()){
                maisCaro = i;
            }
        }
        return maisCaro;
    }

    public void exibirItemMaisCaro(){
        Item maisCaro = getItemMaisCaro();

        if(maisCaro != null){
            maisCaro.exibirDados();
        } else {
            System.out.println("Nenhum item no pedido.");
        }
    }
}