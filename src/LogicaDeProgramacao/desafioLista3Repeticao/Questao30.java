package LogicaDeProgramacao.desafioLista3Repeticao;

import java.util.Scanner;

public class Questao30 {
    // Escreva um algoritmo que leia a idade de 10 pessoas, calcule e mostre a quantidade
    // de pessoas maiores de idade

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeDeMaioresDeIdade = 0;

        for(int i = 0; i < 10; i++) {
            System.out.println("Digite a sua idade:");
            int idade = scan.nextInt();

            if(idade >= 18) {
                quantidadeDeMaioresDeIdade ++;
            }
        }

        if(quantidadeDeMaioresDeIdade > 0) {
            String mensagem = quantidadeDeMaioresDeIdade != 1 ? "Existem " + quantidadeDeMaioresDeIdade + " pessoas maiores" : "Existe uma pessoa maior";
            System.out.printf("%s de idade na lista. quantidade de maiores de idade: %d",mensagem, quantidadeDeMaioresDeIdade);
        } else {
            System.out.println("Não tem maiores de idade.");
        }

        scan.close();
    }
}
