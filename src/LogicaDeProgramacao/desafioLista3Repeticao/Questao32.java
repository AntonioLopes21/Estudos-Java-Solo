package LogicaDeProgramacao.desafioLista3Repeticao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Questao32 {
    //Construa um algoritmo que leia um conjunto de 20 n´ umeros inteiros e mostre qual
    // foi o maior valor fornecido.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> listaInteiros = new ArrayList<>();

        for(int i = 0; i < 20; i ++) {
            System.out.println("Digite um valor:");
            int valor = scan.nextInt();

            listaInteiros.add(valor);

        }

        System.out.println("O maior valor da lista é:" + Collections.max(listaInteiros));

        scan.close();
    }
}
