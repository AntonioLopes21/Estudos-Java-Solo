package LogicaDeProgramacao.desafiosLista2Condicionais;

import java.util.Scanner;

public class Questao14 {
    // Fac¸a um algoritmo que recebe um valor inteiro e mostra se o valor ´ e zero, positivo
    // ou negativo.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor:");
        int valore = scan.nextInt();

        if(valore < 0){
            System.out.println("O valor é negativo");
        } else if(valore > 0){
            System.out.println("O valor é positivo");
        } else{
            System.out.println("O valor é 0");
        }
        scan.close();

    }
}
