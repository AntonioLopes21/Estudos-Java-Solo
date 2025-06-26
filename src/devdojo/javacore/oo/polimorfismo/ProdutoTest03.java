package devdojo.javacore.oo.polimorfismo;

import devdojo.javacore.oo.polimorfismo.domain.Computador;
import devdojo.javacore.oo.polimorfismo.domain.Produto;
import devdojo.javacore.oo.polimorfismo.domain.Tomate;
import devdojo.javacore.oo.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador(1900, "ryzen 9x3d");

        Tomate tomate = new Tomate(20, "Tomatinho");

        tomate.setDataDeValidade("23/10/1966");
        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(produto);
    }
}
