package POO.exercicio11;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("COCA COLA", 11.99));
        produtos.add(new ProdutoImportado("COLA COLA IMPORTADA", 10.99, 5));
        produtos.add(new ProdutoDesconto("COCA COM DESCONTO", 10.99, 0.2));

        Produto maisCaro = null;

        for (Produto p: produtos){
            p.exibirDados();

            if (maisCaro == null || p.calcularPrecoFinal() > maisCaro.calcularPrecoFinal()){
                maisCaro = p;
            }

        }

        System.out.println("\n=== Produto mais caro ===");
        maisCaro.exibirDados();
    }
}
