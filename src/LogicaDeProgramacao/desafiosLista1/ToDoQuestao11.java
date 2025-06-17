package LogicaDeProgramacao.desafiosLista1;

import java.util.Scanner;

public class ToDoQuestao11 {
    // Fac¸a um algoritmo que auxiliar´ a um funcion´ ario de um caixa de supermercado. O
    // algoritmo dever´ a receber como entrada o valor da compra do cliente e o valor pago pelo cliente,
    // em seguida o algoritmo dever´ a apresentar o troco da compra, de forma que o mesmo deve
    // apresentar a quantidade de c´ edulas e moedas para compor o troco do cliente

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o valor da compra?");
        double valorCompra = scan.nextDouble();

        System.out.println("Qual o valor pago pelo cliente?");
        double valorPago = scan.nextDouble();

        System.out.println("Troco de: R$" + apresentarTroco(valorCompra, valorPago));
        System.out.println("MOEDAS:\n");
        notasTroco(apresentarTroco(valorCompra, valorPago));


        scan.close();
    }

    static double apresentarTroco(double valorCompra, double valorPago) {
        return valorCompra - valorPago;

    }

    static void notasTroco(double resto) {
        double notas = resto;
        double retorno;

        if(notas >= 200) {
            retorno = notas/200;
            notas = notas - (retorno * 200);
            System.out.println("Quantidade de notas de 200: reais" + retorno + "\nNotas restantes:" + notas);
        }

        if(notas >= 100) {
            retorno = notas/100;
            notas = notas - (retorno * 100);
            System.out.println("Quantidade de notas de 100: reais" + retorno + "\nNotas restantes:" + notas);
        }

        if(notas >= 50) {
            retorno = notas/50;
            notas = notas - (retorno * 50);
            System.out.println("Quantidade de notas de 50 reais:" + retorno + "\nNotas restantes:" + notas);
        }

        if(notas >= 20) {
            retorno = notas/20;
            notas = notas - (retorno * 20);
            System.out.println("Quantidade de notas de 20 reais:" + retorno + "\nNotas restantes:" + notas);
        }

        if(notas >= 10) {
            retorno = notas/10;
            notas = notas - (retorno * 10);
            System.out.println("Quantidade de notas de 10 reais:" + retorno + "\nNotas restantes:" + notas);
        }

        if(notas >= 5) {
            retorno = notas/5;
            notas = notas - (retorno * 5);
            System.out.println("Quantidade de notas de 5 reais:" + retorno + "\nNotas restantes:" + notas);
        }

        if(notas >= 2) {
            retorno = notas/2;
            notas = notas - (retorno * 2);
            System.out.println("Quantidade de notas de 2 reais:" + retorno + "\nNotas restantes:" + notas);
        }

        if (notas >= 1) {
            retorno = notas;
            notas = notas - retorno;
            System.out.println("Quantidade de notas de 1 real:" + retorno + "\nNotas restantes:" + notas);
        }

        if(notas >= .5) {
            retorno = notas/.5;
            notas = notas - (retorno * .5);
            System.out.println("Quantidade de notas de 50 centavos:" + retorno + "\nNotas restantes:" + notas);
        }

        if(notas >= .25) {
            retorno = notas/.25;
            notas = notas - (retorno * .25);
            System.out.println("Quantidade de notas de 25 centavos:" + retorno + "\nNotas restantes:" + notas);
        }

        if(notas >= .1) {
            retorno = notas/.1;
            notas = notas - (retorno * .1);
            System.out.println("Quantidade de notas de 10 centavos:" + retorno + "\nNotas restantes:" + notas);
        }

        if(notas >= .05) {
            retorno = notas/.05;
            notas = notas - (retorno * .05);
            System.out.println("Quantidade de notas de 5 centavos:" + retorno + "\nNotas restantes:" + notas);
        }

        if(notas >= .01) {
            retorno = notas/.01;
            notas = notas - (retorno * .01);
            System.out.println("Quantidade de notas de 1 centavo:" + retorno + "\nNotas restantes:" + notas);
        }

    }
}
