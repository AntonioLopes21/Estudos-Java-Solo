package LogicaDeProgramacao.desafiosLista1;

import java.util.Scanner;

public class Questao8 {
    // Escreva um algoritmo que recebe o valor do sal´ ario fixo e o total de vendas efetuadas
    // por um vendedor de uma loja durante o mˆes (em dinheiro). Sabendo que este vendedor ganha
    // 15% de comiss˜ ao sobre suas vendas efetuadas, informar o sal´ ario fixo e sal´ ario no final do mˆ es

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu salário:");
        double salario = scan.nextDouble();

        System.out.println("Qual foi o total de vendas que você realizou?");
        double quantidadeVendasEfetuadas = scan.nextDouble();

        System.out.printf("Seu salário fixo é %.2f\nPercentual de vendas lucrados: %.2f\nValor total: %.2f", salario, valorLucroAdicional(quantidadeVendasEfetuadas), (salario + valorLucroAdicional(quantidadeVendasEfetuadas)));

        scan.close();

    }

    static double valorLucroAdicional(double vendasEfetuadas) {

        return 0.15 * vendasEfetuadas;
    }
}
