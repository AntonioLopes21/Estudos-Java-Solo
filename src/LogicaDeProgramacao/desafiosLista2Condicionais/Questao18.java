package LogicaDeProgramacao.desafiosLista2Condicionais;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Questao18 {
    // As mac¸as custam R$0.30 cada, se forem compradas menos do que uma d´ uzia, e
    // R$0.25 se forem compradas pelo menos doze. Escreva um algoritmo que leia o n´ umero de mac¸as
    // compradas, calcule e mostre o valor total da compra

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de maçãs que deseja comprar:");
        int quantidadeMacas = scan.nextInt();

        System.out.println("O valor das maçãs vai ficar em:" + verificarValorDasMacas(quantidadeMacas));

        System.out.printf("O preço da compra ficou em: R$:%.2f", calcularValorCompra(quantidadeMacas, verificarValorDasMacas(quantidadeMacas)));
        scan.close();
    }

    static double verificarValorDasMacas(int quantidade) {
        double precoMaca;

        if(quantidade >=12) {
            precoMaca = 0.25;
        } else {
            precoMaca = 0.3;
        }

        return precoMaca;
    }

    static double calcularValorCompra(int quantidadeMacas, double precoMaca) {
        return quantidadeMacas * precoMaca;
    }

}
