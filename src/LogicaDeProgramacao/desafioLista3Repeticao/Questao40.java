package LogicaDeProgramacao.desafioLista3Repeticao;

import java.util.Scanner;

public class Questao40 {
    // Escreva um algoritmo que leia os valores de K e N. Calcule e mostre o valor de
    // KN.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de K:");
        int k = scan.nextInt();

        System.out.println("Agora, digite o valor de N");
        int n = scan.nextInt();

        double resultado = Math.pow(k, n);

        System.out.printf("O valor de %d elevado a %d é %.2f\n", k, n, resultado);
        scan.close();
    }
}
