package desafios.dia01.modelDia01.desafio2;

import desafios.dia01.modelDia01.funcoesExecutoras.ContadorVogaisConsoantes;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Desafio2ContarVogaisEConsoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a frase ou palavra:");
        String mensagem = scan.nextLine();

        ContadorVogaisConsoantes.contarVogaisEConsoantes(mensagem);

        scan.close();
    }
}
