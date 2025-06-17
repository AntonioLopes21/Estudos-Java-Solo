package LogicaDeProgramacao.desafiosLista2Condicionais;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Questao20 {
    // Escrever um algoritmo que leia trˆes valores inteiros distintos e os escreva em ordem
    // crescente

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        int primeiro = scan.nextInt();

        System.out.println("Digite o segundo valor:");
        int segundo = scan.nextInt();

        System.out.println("Digite o terceiro valor:");
        int terceiro = scan.nextInt();

        System.out.println(ordenarValores(primeiro, segundo, terceiro));
        scan.close();
    }

    static String ordenarValores(int primeiro, int segundo, int terceiro) {
        List<Integer> lista = new ArrayList<>();
        lista.add(primeiro);
        lista.add(segundo);
        lista.add(terceiro);

        Collections.sort(lista);

        return "Lista ordenada:"  + lista;
    }

//    static void ordenarValores(int primeiro, int segundo, int terceiro) {
//        if(terceiro > primeiro && terceiro > segundo && primeiro > segundo) {
//            System.out.printf("Ordem : %d, %d e %d", terceiro, primeiro, segundo);
//        } else if(terceiro > segundo && segundo > primeiro) {
//            System.out.printf("Ordem : %d, %d e %d", terceiro, segundo, primeiro);
//        } else if(segundo > primeiro && segundo > terceiro && primeiro > terceiro) {
//            System.out.printf("Ordem : %d, %d e %d", segundo, primeiro, terceiro);
//        } else if(segundo > terceiro && terceiro > primeiro) {
//            System.out.printf("Ordem : %d, %d e %d", segundo, terceiro, primeiro);
//        } else if(primeiro > segundo && primeiro > terceiro && segundo > terceiro) {
//            System.out.printf("Ordem : %d, %d e %d", primeiro, segundo, terceiro);
//        } else if(primeiro > terceiro && terceiro > segundo) {
//            System.out.printf("Ordem : %d, %d e %d", primeiro, terceiro, segundo);
//        } else if(primeiro == segundo )
//    }
}
