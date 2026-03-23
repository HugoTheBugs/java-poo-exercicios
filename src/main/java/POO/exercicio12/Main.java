package POO.exercicio12;

public class Main {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.adicionarItem(new Bebida("AGUA", 10.99, "G"));
        pedido.adicionarItem(new Bebida("COCA COLA", 15.99, "P"));
        pedido.adicionarItem(new Bebida("AGUA", 10.99, "M"));
        pedido.adicionarItem(new Prato("ARROZ", 20.99, true));
        pedido.adicionarItem(new Prato("ARROZ", 20.99, false));
        pedido.adicionarItem(new Item("ITEM TESTE", 999));

        pedido.exibirPedido();


        System.out.println("\n === Item mais Caro ===");
        pedido.exibirItemMaisCaro();


    }
}