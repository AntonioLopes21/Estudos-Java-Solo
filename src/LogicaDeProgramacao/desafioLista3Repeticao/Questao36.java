package LogicaDeProgramacao.desafioLista3Repeticao;

import java.util.Scanner;

public class Questao36 {
    public static void main(String[] args) {
        // Calcular o valor de S dado pela sequˆ encia
        // s = 1 + 1/2 + 1/3 + 1/4 + 1/5 + 1/6 + 1/7;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da sequência:");
        int sequencia = scan.nextInt();
        int numerador = 1;
        int denominador = 1;

        for (int i = 1; i <= sequencia; i+= 2) {
            System.out.printf("formato da soma em fração:\nS = %d/%d + \n", numerador, i);
            denominador ++;
        }
    }
}
