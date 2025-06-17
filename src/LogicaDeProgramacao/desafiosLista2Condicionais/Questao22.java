package LogicaDeProgramacao.desafiosLista2Condicionais;

import java.util.Scanner;

public class Questao22 {
    // Escreva um algoritmo para ler 2 valores inteiros e uma das seguintes operac¸˜ oes a
    // serem executadas: 1. Adic¸˜ ao, 2. Subtrac ¸˜ ao, 3. Divis˜ ao e 4. Multiplicac¸˜ ao. Calcular e mostrar o
    // resultado da operac¸˜ao.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean loop = true;

        while(loop) {
            System.out.println("Digite o valor 1:");
            int valor1 = scan.nextInt();
            System.out.println("Digite o valor 2:");
            int valor2 = scan.nextInt()
                    ;
            System.out.println("Digite uma opção:\n1. Adição\n2. Subtração\n3. Divisão\n4.Multiplicação\n5. sair");
            int decisao = scan.nextInt();

            try {

            switch (decisao) {
                case 1:
                    System.out.println("Soma:" + soma(valor1, valor2));
                    break;

                case 2:
                    System.out.println("Subtração:" + subtracao(valor1, valor2));
                    break;

                case 3:
                    System.out.println("Divisão:" + divisao(valor1, valor2));
                    break;

                case 4:
                    System.out.println("Multiplicação:" + multiplicacao(valor1, valor2));
                    break;

                case 5:
                    System.out.println("Muito obrigado por utilizar o programa!");
                    loop = false;
                    break;

                default:
                    System.out.println("Valor inválido.");
                    break;

            } } catch (ArithmeticException e) {
                System.out.println("Valor indivisível por 0: \nmensagem:" + e.getMessage());
            }



        }

        scan.close();
    }

    static int soma(int v1, int v2) {
        return v1 + v2;
    }

    static int subtracao(int v1, int v2) {
        return v1 - v2;
    }

    static int divisao(int v1, int v2) {
        return v1 / v2;
    }

    static int multiplicacao(int v1, int v2) {
        return v1 * v2;
    }
}
