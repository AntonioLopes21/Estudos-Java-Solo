package LogicaDeProgramacao.desafioLista3Repeticao;

import java.util.Scanner;

public class Questao31 {
    // A convers˜ao de graus Fahrenheit para Celsius ´e obtida por c = 5
    // 9
    //∗ (f − 32). Fac¸a
    // um algoritmo que calcule e escreva uma tabela de graus Celsius em graus Fahrenheit, cujos graus
    // variem de 50 a 65 de 1 em 1

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for(int fahrenheit = 50; fahrenheit <= 65; fahrenheit++) {

            double celcius = (fahrenheit - 32) / 1.8;
            String mensagem = String.format("A conversão de %d Fahrenheit para °Celsius é: °C:%.2f\n", fahrenheit, celcius);
            //mensagem.replaceAll("\\.", ",");
            mensagem = mensagem.replace(",", ".");
            System.out.printf(mensagem);
        }

        scan.close();
    }
}
