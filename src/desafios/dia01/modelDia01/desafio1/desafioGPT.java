package desafios.dia01.modelDia01.desafio1;

import desafios.dia01.modelDia01.funcoesExecutoras.ContadorCaractere;

import java.util.Scanner;

public class desafioGPT {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String mensagem = scan.nextLine();

        ContadorCaractere.contarCaracteres(mensagem);
    }
}
