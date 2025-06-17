package LogicaDeProgramacao.desafiosLista1;

import java.util.Scanner;

public class Questao9 {
    // Ler dois valores para as vari´ aveis A e B, e efetuar as trocas dos valores de forma
    // que a vari´ avel A passe a possuir o valor da vari´ avel B e a vari´ avel B passe a possuir o valor da
    // vari´ avel A. Apresentar os valores trocados.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor inicial de A:");
        int variavelA = scan.nextInt();

        System.out.println("Digite o valor inicial de B:");
        int variavelB = scan.nextInt();

        int auxiliar = variavelA;
        variavelA = variavelB;
        variavelB = auxiliar;

        System.out.printf("O valor de A é: %d\nO valor de B é: %d", variavelA, variavelB);
        scan.close();
    }
}
