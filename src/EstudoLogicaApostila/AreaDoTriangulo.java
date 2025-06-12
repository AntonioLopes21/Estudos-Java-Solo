package EstudoLogicaApostila;

import java.util.Scanner;
//3. **Cálculo de Área** 📐: Escreva um programa que calcule a área de um triângulo, dado a base e a altura.

public class AreaDoTriangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a base do triângulo:");
        int base = scan.nextInt();

        System.out.println("Digite a altura do seu triângulo:");
        int altura = scan.nextInt();

        int areaTriangulo = (base * altura)/2;

        System.out.println("A área do triângulo é:" + areaTriangulo);

    }
}
