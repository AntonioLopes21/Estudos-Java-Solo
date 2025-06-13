package LogicaDeProgramacao.desafiosLista1;

import java.util.Scanner;

public class Questao4 {
    //Quest ̃ao 4. Fazer um algoritmo que calcule e mostre:
    //a) A soma entre dois n  ́umeros
    //b) O produto entre eles e
    //c) O quociente entre eles

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {


        System.out.println("Digite o valor 1:");
        int valor1 = scan.nextInt();

        System.out.println("Digite o valor 2:");
        int valor2 = scan.nextInt();

        System.out.println("A soma entre:" + valor1 + " e " + valor2 + " = " + (valor1 + valor2));
        System.out.println("O produto entre:" + valor1 + " e " + valor2 + " = " + (valor1 * valor2));
        System.out.println("O quociente dos valores:" + valor1 + " e " + valor2 + " = " + (valor1 / valor2));
        } catch (ArithmeticException e) {
            System.out.println("A divisão não pode ser realizada quando é divisível por zero.");
        } finally {
            scan.close();
        }


    }
}
