package LogicaDeProgramacao.desafiosLista2Condicionais;

import java.util.Scanner;

public class Questao16 {
    // Fac¸a um algoritmo que recebe um valor inteiro, caso esse n´ umero seja positivo,
    // mostre o valor digitado, caso seja negativo mostre o valor digitado com o sinal invertido.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor:");
        double valor = scan.nextDouble();

        if(valor >= 0) {
            System.out.println("valor: " + valor);
        } else {
            System.out.println("valor:" + (-valor) );
        }

        scan.close();
    }
}
