package LogicaDeProgramacao.desafiosLista1;

import java.util.Scanner;

public class Questao7 {
    // Fazer um algoritmo que calcule e mostre a ´ area e o volume de um cilindro.
    // (A =2πr(h+r),V = πr2h)

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a altura do cilindro:");
        double alturaCilindro = scan.nextDouble();

        System.out.println("Informe o raio do cilindro:");
        double raio = scan.nextDouble();

        System.out.printf("A área do cilindro é: %.2f.", areaCilindro(raio, alturaCilindro));
        System.out.printf("O volume do cilindro é: %.2f", volumeCilindro(raio, alturaCilindro));


    }

    static double areaCilindro(double raio, double altura) {
        double PI = 3.14;
        return 2 * PI * raio * (altura + raio);
    }

    static double volumeCilindro(double raio, double altura) {
        double PI = 3.14;

        return PI * ((raio * raio)* altura);
    }
}
