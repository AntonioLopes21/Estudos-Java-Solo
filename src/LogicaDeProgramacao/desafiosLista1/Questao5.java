package LogicaDeProgramacao.desafiosLista1;

import java.util.Scanner;

public class Questao5 {
    //Quest ̃ao 5. Fazer um algoritmo que converta
    // cent ́ımetros para polegadas (obs.: 1pol = 2.54cm)
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual conversão você deseja realizar?\n1 - CM para Polegadas 2 - Polegadas para CM");
        int escolha = scan.nextInt();


        if(escolha == 1) {
            System.out.println("Digite o valor em centímetros:");
            double centimetros = scan.nextDouble();
            System.out.printf("O valor de: %.2f centímetros para polegadas é de: %.2f", centimetros, converterCmParaPolegadas(centimetros));
        } else if(escolha == 2) {
            System.out.println("Digite o valor em polegadas:");
            double polegadas = scan.nextDouble();
            System.out.printf("O valor de: %.2f polegadas para centimetros é de: %.2f", polegadas, converterPolegadasParaCm(polegadas));
        }
    }

    static double converterCmParaPolegadas(double centimetro) {
        return centimetro/2.54;
    }

    static double converterPolegadasParaCm(double polegada) {
        return polegada * 2.54;
    }

}
