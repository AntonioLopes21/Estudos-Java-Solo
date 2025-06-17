package LogicaDeProgramacao.desafiosLista2Condicionais;

import java.io.PrintStream;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Questao23 {
    // Escreva um algoritmo para calcular as ra´ ızes de uma equac¸˜ ao do 2º grau pela
    // f ´ ormula x = −b±
    // 2a
    //, onde D =b2–4ac ´e o discriminante da equac¸˜ao.
    //Para o discriminante h´ a trˆes poss´ ıveis situac¸˜ oes:
    // a) Se D <0, n˜ao h´ a soluc¸˜ ao real, pois n˜ ao existe raiz quadrada de n´ umero negativo.
    // b) Se D =0, h´ a duas soluc¸˜oes iguais: x1 = x2 = −b
    // 2a
    //.
    // c) Se D >0, h´ a duas soluc¸˜ oes reais e diferentes: x1 e x2

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean loop = true;

        while(loop) {
            System.out.println("Digite o valor de A:");
            int valorA = scan.nextInt();

            System.out.println("Digite o valor de B:");
            int valorB = scan.nextInt();

            System.out.println("Digite o valor de C:");
            int valorC = scan.nextInt();

            System.out.println("Escolha uma opção: \n1. Buscar raizes.\n2. sair do programa.");
            int decisao = scan.nextInt();

            switch (decisao) {
                case 1:
                    System.out.println(verificarRaizesReais(calcularDelta(valorA, valorB, valorC), valorA, valorB));
                    break;
                case 2:
                    System.out.println("Muito obrigado por utilizar o programa!");
                    loop = false;
                    break;
                default:
                    System.out.println("Opção inválida.");

            }

        }
    }

    static int calcularDelta(int A, int B, int C) {
        return (B * B) - 4 * A * C;
    };

    static String verificarRaizesReais(int delta, int A, int B) {
        double solucaoRaiz1 = (- B + Math.sqrt(delta))/ (2.0 * A);
        double solucaoRaiz2 = (- B - Math.sqrt(delta)) / (2.0 * A);

        if(delta < 0) {
            return "não há solução real, pois não existe raiz quadrada de número negativo.\n";
        } else if(delta == 0) {
            return String.format("Há duas soluções reais iguais. X1: %.2f e X2: %.2f\n", solucaoRaiz1, solucaoRaiz2);
        } else {
            return String.format("Há duas soluções reais diferentes. X1: %.2f e X2: %.2f\n" , solucaoRaiz1, solucaoRaiz2);
        }
    }
}
