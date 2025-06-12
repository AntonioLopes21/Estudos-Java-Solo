package LogicaDeProgramacao.desafiosChatGPT.ListaExercicios3;

import java.util.Scanner;

public class TabuadaFormatada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número que você deseja ver a tabuada:");
        int numeroSolicitado = scan.nextInt();

        for(int i = 0; i <= 10; i ++) {
            int multiplicacao = numeroSolicitado * i;
            System.out.println(numeroSolicitado + " x " + i + " = " + multiplicacao);
        }
    }
}
