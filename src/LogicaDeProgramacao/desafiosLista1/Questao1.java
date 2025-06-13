package LogicaDeProgramacao.desafiosLista1;

import java.util.Scanner;

public class Questao1 {
    //Fac ̧a um algoritmo que recebe dois valores inteiros e mostra o resultado da multiplicac ̧  ̃ao
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor 1:");
        int valor1 = scan.nextInt();

        System.out.println("Digite o valor 2:");
        int valor2 = scan.nextInt();

        System.out.printf("O resultado da multiplicação de:%d x %d = %d", valor1, valor2, (valor1 * valor2));
    }
}
