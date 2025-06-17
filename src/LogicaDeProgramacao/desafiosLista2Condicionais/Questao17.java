package LogicaDeProgramacao.desafiosLista2Condicionais;

import java.util.Scanner;

public class Questao17 {
    // Fac¸a um algoritmo que leia dois n´ umeros e identifique se s˜ ao iguais ou diferentes.
    // Caso eles sejam iguais, mostre uma mensagem dizendo que eles s˜ ao iguais. Caso sejam diferentes,
    // informe qual n´ umero ´ e o maior, e uma mensagem que s˜ ao diferentes.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        int primeiroValor = scan.nextInt();

        System.out.println("Digite o segundo valor:");
        int segundoValor = scan.nextInt();

        System.out.println(verificarValores(primeiroValor, segundoValor));
        scan.close();
    }

    static String verificarValores(int v1, int v2) {
        if(v1 == v2) {
            return "Os valores são iguais!";
        } else if(v1 > v2) {
            return v1 + " é maior que " + v2 + " e eles são diferentes";
        } else {
            return v2 + " é maior que " + v1 + " e eles são diferentes";
        }
    }
}
