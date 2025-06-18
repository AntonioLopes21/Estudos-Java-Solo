package LogicaDeProgramacao.desafioLista3Repeticao;

import java.util.Scanner;

public class Questao37 {
    public static void main(String[] args) {
        // Calcular o valor de S dado pela sequˆ encia
        // s = 1 + 3/2 + 5/3 + 7/4 + 9/5 + 11/6 + 12/7...;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da sequência:");
        int sequencia = scan.nextInt();
        int numerador = 1;
        int denominador = 1;
        int soma = 1;

        for (int i = 1; i <= 99; i+= 2) {
            System.out.printf("formato da soma em fração:\nS = %d + %d/%d\n", soma, i, denominador);
            denominador ++;
        }
    }
}
