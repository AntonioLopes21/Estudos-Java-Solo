package LogicaDeProgramacao.desafioLista3Repeticao;

import java.util.Scanner;

public class Questao35 {
    // Construa um algoritmo que calcule e mostre o valor de H, sendo H calculado por
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor limite para a soma dos valores:");
        int valorLimite = scan.nextInt();
        int soma = 0;

        for(int i = 0; i <= valorLimite; i ++) {
            System.out.println(i);
            soma += i;
        }

        System.out.println("Valores somados do 0 ao " + valorLimite + ":\n" + soma);

    }
}
