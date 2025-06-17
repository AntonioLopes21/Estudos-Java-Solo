package LogicaDeProgramacao.desafioLista3Repeticao;

import java.util.Scanner;

public class Questao29 {
    // Fazer um algoritmo que leia 5 n´ umeros e verifique se ele est´ a entre 100 e 200.
    // Se estiver na faixa, mostrar ”Vocˆ e digitou um n´ umero entre 100 e 200”, se n˜ ao estiver na faixa,
    // mostrar ”Vocˆe digitou um n´ umero fora da faixa entre 100 e 200”.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for(int i = 1; i <= 5; i ++) {
            System.out.println("Digite um número:");
            int numero = scan.nextInt();

            if(numero >= 100 && numero <= 200) {
                System.out.println("Você digitou um número entre 100 e 200.");
            } else {
                System.out.println("Você digitou um número fora da faixa entre 100 e 200.");
            }
        }
        scan.close();
    }
}
