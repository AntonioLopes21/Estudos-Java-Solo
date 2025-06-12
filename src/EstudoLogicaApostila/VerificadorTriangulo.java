package EstudoLogicaApostila;

import java.util.Scanner;

public class VerificadorTriangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lados1E2 = 0;
        int lado3 = 0;

        for(int i = 0; i < 1; i++) {
            System.out.printf("Digite o primeiro lado:\n");
            int valor1 = scan.nextInt();

            System.out.println("Digite o segundo lado:");
            int valor2 = scan.nextInt();

            System.out.println("Digite o terceiro lado ");
            int valor3 = scan.nextInt();

            if(i < 2) {
                lados1E2 = valor1 + valor2;
            } else {
                lado3 += valor3;
            }


            if(lados1E2 > lado3) {
                System.out.println("Esse é um triângulo válido.");
            } else {
                System.out.println("Esse não é um triângulo válido.");
            }


            if(valor1 == valor2 && valor2 != valor3) {
                System.out.println("Ésse é um triângulo Isósceles");
            }

            if(valor1 == valor2 && valor1 == valor3) {
                System.out.println("Esse é um triângulo Equilátero.");
            } if(valor1 != valor2 && valor1 != valor3 && valor2 != valor3) {
                System.out.println("Esse é um triângulo Escaleno.");

            }

        }
    }

}
