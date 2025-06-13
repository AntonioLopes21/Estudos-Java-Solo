package LogicaDeProgramacao.desafiosLista1;

import java.util.Scanner;

public class Questao3 {
    //Fazer um algoritmo que obtenha dois n  ́umeros inteiros, x e y, mostre o quociente e
    //o resto da divis ̃ao inteira entre eles

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
        System.out.println("Digite o primeiro valor:");
        int valor1 = scan.nextInt();

        System.out.println("Digite o segundo valor:");
        int valor2 = scan.nextInt();

        int divisao = valor1/valor2;

        System.out.println("O resultado da divisão é:" + divisao);
        System.out.println("Cociente: " + valor1/valor2);
        System.out.println("Resto: " +  valor1%valor2);
        } catch(ArithmeticException e) {
            System.out.println("O segundo valor não pode ser zero." + e.getMessage());
        }

        scan.close();
    }
}
