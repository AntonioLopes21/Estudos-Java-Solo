package devdojo.javacore.oo.polimorfismo.servico;

import devdojo.javacore.oo.polimorfismo.domain.Computador;
import devdojo.javacore.oo.polimorfismo.domain.Produto;
import devdojo.javacore.oo.polimorfismo.domain.Tomate;

public class CalculadoraImposto {
//    public static void calcularImpostoComputador(Computador computador) {
//        System.out.println("Relatório do imposto do computador: ");
//        double imposto = computador.calcularImposto();
//        System.out.println("Computador:" + computador.getNome());
//        System.out.println("Valor:" + computador.getValor());
//        System.out.println(imposto);
//    }
//
//    public static void calcularImpostoTomate(Tomate tomate) {
//        System.out.println("Relatório do imposto do computador: ");
//        double imposto = tomate.calcularImposto();
//        System.out.println("Computador:" + tomate.getNome());
//        System.out.println("Valor:" + tomate.getValor());
//        System.out.println(imposto);
//    }

    // + GENÉRICO => CÓDIGO DESACOPLADO
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório do imposto do produto:");
        double imposto = produto.calcularImposto();
        System.out.println("Nome do produto:" + produto.getNome());
        System.out.println("Valor do produto:" + produto.getValor());
        System.out.println("Imposto a ser pago:" + imposto);
        if(produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println(((Tomate) produto ).getDataDeValidade());
        }

    }



}
