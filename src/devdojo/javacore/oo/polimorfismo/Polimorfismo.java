package devdojo.javacore.oo.polimorfismo;

import devdojo.javacore.oo.polimorfismo.domain.Computador;
import devdojo.javacore.oo.polimorfismo.domain.Produto;
import devdojo.javacore.oo.polimorfismo.domain.Tomate;

public class Polimorfismo {
    public static void main(String[] args) {
        Produto produto = new Computador(1500, "ryzen 9x3d");

        System.out.println(produto.calcularImposto());
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());

        System.out.println("------------------------");
        Produto produto2 = new Tomate(20, "Tomatinho");
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
