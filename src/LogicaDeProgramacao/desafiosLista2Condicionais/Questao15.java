package LogicaDeProgramacao.desafiosLista2Condicionais;

import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        // Fac¸a um algoritmo que recebe um valor e mostra se o mesmo ´e par ou impar
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scan.nextInt();

        if(numero % 2 == 0) {
            System.out.println("é par.");
        } else {
            System.out.println("é impar.");
        }

        scan.close();
    }
}
