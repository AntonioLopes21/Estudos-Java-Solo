package LogicaDeProgramacao.desafiosLista1;

import java.util.ArrayList;
import java.util.List;

public class Questao12 {
    // Fazer um algoritmo que calcule a m´edia aritm´etica dos
    // n´ umeros 7, 8 e 9 e a m´ edia
    // nos n´ umeros 4, 5 e 6.
    // Mostre a soma das duas m´edias e a m´ edia das m´ edias.

    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>();
        lista1.add(7);
        lista1.add(8);
        lista1.add(9);

        List<Integer> lista2 = new ArrayList<>();
        lista2.add(4);
        lista2.add(5);
        lista2.add(6);

        System.out.println(calcularMedia(lista1));
        System.out.println(calcularMedia(lista2));

        System.out.println(calcularMediaDaMedia(lista1, lista2));


    }

    static String calcularMedia(List<Integer> lista) {
        double media = (double) (lista.get(0) + lista.get(1) + lista.get(2)) / lista.size();

        return "A média é da lista:" + lista + " é: " + media;
    }

    static String calcularMediaDaMedia(List<Integer> lista1, List<Integer> lista2) {
        int quantidadeElementos = lista1.size() + lista2.size();
        double mediaItensLista = (double) (lista1.get(0) + lista1.get(1) + lista1.get(2) + lista2.get(0) + lista2.get(1) + lista2.get(2)) /quantidadeElementos;

        return "A média das médias das listas " + lista1 + " e " + lista2 + " é:" + mediaItensLista;
    }

}
