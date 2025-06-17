package LogicaDeProgramacao.desafiosLista1;

import java.util.Scanner;

public class Questao6 {
    // Fac¸a um algoritmo que recebe o valor do raio de um c´ ırculo e
    // apresenta o valor da area desse c´ ırculo.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o raio do círculo:");
        double area = scan.nextDouble();

        System.out.printf("A área do círculo com o raio de %.2f é: %.2f", area, areaCirculo(area));

    }

    static double areaCirculo(double raio) {
        double PI = 3.14;

        return PI * (raio * raio);
    }
}
