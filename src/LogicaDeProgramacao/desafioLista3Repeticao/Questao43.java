package LogicaDeProgramacao.desafioLista3Repeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao43 {
    //Um determinado material radioativo perde metade de sua massa a cada 50 segun
    //dos. Dada a massa inicial, em gramas, fazer um programa que determine o tempo necess´ ario
    // para que essa massa se torne menor do que 0.5 gramas. Escrever a massa inicial, a massa final
    // e o tempo calculado em segundos

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do material radioativo em gramas:");
        double massaInicial = scan.nextDouble();

        verificarQuandoMassaAtingirMeioQuilo(massaInicial);

        scan.close();
    }

    static void verificarQuandoMassaAtingirMeioQuilo(double massaInicial) {
        double massaFinal = 0;
        int tempo = 0;
        double massaInicio = massaInicial;

        while(massaInicial >= .5) {
            double perdendoMassa = massaInicial/2;
            massaFinal = massaInicial - perdendoMassa;
            massaInicial -= massaFinal;

            tempo += 50;


        }

        System.out.println("Tempo em segundos: " + tempo);
        System.out.printf("Massa inicial: %.0f\n", massaInicio);
        System.out.printf("Massa final: %.3f", massaInicial);


    }

//    static String decrementarMassa(double massaInicial, int tempo) {
//        double massaFinal = 0;
//        double pesoPerdido = massaInicial * 0.5;
//
//        for(int i = 0; i < tempo; i ++) {
//            if(tempo % 50 == 0) {
//                massaFinal = massaInicial - pesoPerdido;
//            }
//
//            if(massaFinal == 0.5) {
//                return "A massa chegou no peso de " + massaFinal + " em " + tempo + " segundos";
//            }
//        }
//
//
//
//        return "A massa final é:" + massaFinal + " gramas.";
//    }

//    static String informarMassaComMeioQuilo(int massa) {
//
//    }

}
