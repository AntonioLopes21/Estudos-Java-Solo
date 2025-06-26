package devdojo.javacore.oo.polimorfismo;

import devdojo.javacore.oo.polimorfismo.domain.Computador;
import devdojo.javacore.oo.polimorfismo.domain.Tomate;
import devdojo.javacore.oo.polimorfismo.servico.CalculadoraImposto;

public class Main {
    public static void main(String[] args) {
        //widening cast
        Computador comp = new Computador(1000, "Computador");
        Tomate tomate =  new Tomate(50, "Tomate");

        comp.calcularImposto();
        tomate.calcularImposto();

        CalculadoraImposto.calcularImposto(comp);
        System.out.println("-------------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
    }
}
