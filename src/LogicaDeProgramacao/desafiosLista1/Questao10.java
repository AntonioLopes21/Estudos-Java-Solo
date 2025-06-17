package LogicaDeProgramacao.desafiosLista1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao10 {
    // Fac¸a um algoritmo que mostra a quantidade de c´ edulas de um caixa eletrˆ onico de
    // umbanco. O algoritmo recebe como entrada o valor inteiro a ser sacado pelo cliente, em seguida
    // apresente a quantidade de cada c´edula que o cliente dever´ a receber, de forma que a quantidade
    // de c´ edulas seja o menor poss´ ıvel.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        System.out.println("Digite o valor a ser sacado:");
        int valor = scan.nextInt();


        System.out.println("Cédulas a ser recebido:");
        divisaoDeCedulas(valor);

        scan.close();
    }

    static void divisaoDeCedulas(int valor) {
        int resto = valor;

        int nota200, nota100, nota50, nota20, nota10, nota5, nota2;
        int notasDivididas;

        nota200 = 200;
        nota100 = 100;
        nota50 = 50;
        nota20 = 20;
        nota10 = 10;
        nota5 = 5;
        nota2 = 2;

        if (resto >= 200) {
            notasDivididas = resto/200;
            resto -= notasDivididas * 200;

            System.out.println("Cédulas de 200: " + notasDivididas + "\nValor:" + resto);
        }

        if(resto >= 100) {
            notasDivididas = resto/100;
            resto -= notasDivididas * 100;

            System.out.println("Cédulas de 100: " + notasDivididas + "\nValor:" + resto);
        }

        if(resto >= 50) {
            notasDivididas = resto/50;
            resto -= notasDivididas * 50;

            System.out.println("Cédulas de 50: " + notasDivididas + "\nValor:" + resto);
        }

        if(resto >= 20) {
            notasDivididas = resto/20;
            resto -= notasDivididas * 20;

            System.out.println("Cédulas de 20: " + notasDivididas + "\nValor:" + resto);
        }

        if(resto >= 10) {
            notasDivididas = resto/10;
            resto -= notasDivididas * 10;

            System.out.println("Cédulas de 10: " + notasDivididas + "\nValor:" + resto);
        }

        if(resto >= 5) {
            notasDivididas = resto/5;
            resto -= notasDivididas * 5;

            System.out.println("Cédulas de 5: " + notasDivididas + "\nValor:" + resto);
        }

        if(resto >= 2) {
            notasDivididas = resto/2;
            resto -= notasDivididas * 2;

            System.out.println("Cédulas de 2: " + notasDivididas + "\nValor:" + resto);
        }
    }
}
