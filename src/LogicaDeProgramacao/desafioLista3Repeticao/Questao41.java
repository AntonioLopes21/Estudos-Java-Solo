package LogicaDeProgramacao.desafioLista3Repeticao;

import java.util.Scanner;

public class Questao41 {
    // Quest˜ ao 41. Escreva um programa que calcule as n primeiras potˆ encias do n´ umero k. Para n =
    // 3 e k =2teremos:
    // • 2 elevado a 1 = 2
    // • 2 elevado a 2 = 4
    // • 2 elevado a 3 = 8

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número que você deseja ver as potências iniciais:");
        int numeroPotencia = scan.nextInt();

        for (int i = 1; i <= 10; i ++) {
            double resultado = Math.pow(numeroPotencia, i);
            System.out.println("Potência do " + numeroPotencia + " = " + resultado);
        }

        scan.close();
    }
}
