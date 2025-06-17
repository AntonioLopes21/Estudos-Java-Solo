package LogicaDeProgramacao.desafiosLista2Condicionais;

import java.util.Scanner;

public class Questao19 {
    // Escreva um algoritmo que recebe trˆes valores inteiros e mostre o valor do maior
    // n´ umero digitado pelo usu´ ario.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        int primeiro = scan.nextInt();

        System.out.println("Digite o segundo valor:");
        int segundo = scan.nextInt();

        System.out.println("Digite o terceiro valor:");
        int terceiro = scan.nextInt();

        System.out.println(maiorValor(primeiro, segundo, terceiro));
        scan.close();
    }

    static String maiorValor(int prim, int second, int terceiro) {
        String mensagem = " é o maior valor.";

        if(prim > second && prim > terceiro) {
            return prim + mensagem;
        } else if(second > prim && second > terceiro) {
            return second + mensagem;
        } else if(terceiro > prim && terceiro > second) {
            return terceiro + mensagem;
        } else {
            return "Existem valores iguais.";
        }
    }
}
