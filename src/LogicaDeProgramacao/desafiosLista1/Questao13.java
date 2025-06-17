package LogicaDeProgramacao.desafiosLista1;

import EstudoLogicaApostila.Main;

import java.util.Scanner;

public class Questao13 {
    //O prec¸o de um autom´ ovel ´ e calculado pela soma do prec¸o de f´ abrica, o prec¸o dos
    // impostos (45% do prec¸o de f´ abrica) e a porcentagem do revendedor (28% do prec¸o de f´ abrica).
    // Fazer um algoritmo que leia o prec¸o de f´ abrica. Calcule e mostre o prec¸o final do carro

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Digite o valor do preço de fábrica do veículo:");
        double precoFabrica = scan.nextDouble();

        System.out.println("O novo valor do veículo é: R$" + recalcularValorVeiculoComTaxasAdicionais(precoFabrica));

        scan.close();
    }

    static double recalcularValorVeiculoComTaxasAdicionais(double precoInicial) {
        double precoImpostos = 0.45;
        double porcentagemRevendedor = .28;

        double precoComImpostos = precoInicial * precoImpostos;
        double precoDoRevendedor = precoInicial * porcentagemRevendedor;

        return precoInicial + precoComImpostos + precoDoRevendedor;

    }
}
