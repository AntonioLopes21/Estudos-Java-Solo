package LogicaDeProgramacao.desafiosLista2Condicionais;

import java.util.Scanner;

public class Questao24 {
    // Quest˜ ao 24. Escreva um programa que calcule o Valor a Pagar pela conta de energia el´ etrica
    // para uma determinada Classe Consumidora. Veja as informac¸˜ oes a seguir:
    // a. O programa deve receber como dados de entrada: o tipo da Classe Consumidora, (conforme
    // definido na Tabela 1) e o Consumo em quilowatts/hora (KWh);
    // b. O c´ alculo do Valor do Fornecimento (V F), em Reais (R$), ´ e definido pela seguinte f´ ormula:
    // VF =Consumo ∗ Tarifa, onde a tarifa ´ e definida na Tabela 1, conforme a classe consumidora;
    // c. O Valor a Pagar (VP) ´e definido pela seguinte f´ ormula: V P = V F + ICMS, onde a taxa de
    // ICMS ´e calculada aplicando uma al´ ıquota de 30% ao valor do fornecimento (ICMS = 0.3∗V F).

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a sua classe de tarifa:");
        String tipoClasseTarifa = scan.nextLine().toUpperCase();

        System.out.println("Agora digite a quantidade total de quiloWatts:");
        double quantidadeQuiloWatts = scan.nextInt();

        System.out.printf("O valor da sua fatura é: %.2f", tipoTarifaPorClasse(tipoClasseTarifa, quantidadeQuiloWatts));
        scan.close();
    }

    static double tipoTarifaPorClasse(String tipoClasse, double consumoTotalQuiloWatts) {
        double tarifa;
        double valorDoFornecimento;
        double valorAPagar;
        double ICMS;

        if(tipoClasse.equals("A")) {
            tarifa = .5;

            valorDoFornecimento = consumoTotalQuiloWatts * tarifa;
            ICMS = 0.3 * valorDoFornecimento;

            valorAPagar = valorDoFornecimento + ICMS;

            return valorAPagar;

        } else if(tipoClasse.equals("B")) {
            tarifa = .8;

            valorDoFornecimento = consumoTotalQuiloWatts * tarifa;
            ICMS = 0.3 * valorDoFornecimento;
            valorAPagar = valorDoFornecimento + ICMS;

            return valorAPagar;

        } else if(tipoClasse.equals("C")) {
            tarifa = 1;

            valorDoFornecimento = consumoTotalQuiloWatts * tarifa;
            ICMS = 0.3 * valorDoFornecimento;
            valorAPagar = valorDoFornecimento + ICMS;

            return valorAPagar;

        } else {
            return 0.0;
        }
    }

}
