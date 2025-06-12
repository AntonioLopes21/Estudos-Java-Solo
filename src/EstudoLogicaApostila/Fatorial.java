package EstudoLogicaApostila;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int resultado = 1;

        System.out.println("Digite um valor:");
        int fatorial = scan.nextInt();


        if(fatorial == 0) {
            fatorial = 1;
            System.out.println("O fatorial é:" + fatorial);

        } else {
            for(int i = fatorial; i >= 1 ; i --) {
                resultado *= i;
                System.out.println("Fatorial de:" + fatorial + " = " + resultado);
            }
        }

    }
}
