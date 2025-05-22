package EstudoLogicaApostila;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        System.out.println("Digite a primeira nota:");
        double nota1 = scan.nextInt();

        System.out.println("Digite a segunda nota:");
        double nota2 = scan.nextInt();

        System.out.println("Digite a terceira nota:");
        double nota3 = scan.nextInt();

        double media = (nota1 + nota2 + nota3)/ 3;

        System.out.printf("A média do estudante é %.2f", media);
        */ //ATIVIDADE 1

        /*
        System.out.println("Digite o valor em dólar");
        double dolar = scan.nextDouble();

        double real = dolar * 5.62;

        System.out.printf("O valor convertido de dólar em real é: %.2f", real); */ //ATIVIDADE 2

        /*
        double reajuste = 1.0/100.0;
        System.out.println(reajuste);

        System.out.println("Digite o valor do seu salário:");
        double salario = scan.nextDouble();

        double valorDoReajuste = salario * reajuste;

        System.out.println(valorDoReajuste);
        System.out.println("O valor do seu salário com reajuste é: R$" + (salario - valorDoReajuste));
        */ //ATIVIDADE 3

        /*
        double reajuste = 33.33/100.0;
        System.out.println(reajuste);

        System.out.println("Digite o valor do salário:");
        double salario = scan.nextDouble();

        double valorDoReajuste = salario * reajuste;

        System.out.println("O valor do salário com reajuste é: " + (salario - valorDoReajuste));
        */ //ATIVIDADE 4

        /*
        System.out.println("Qual a temperatura em graus Celsius:");
        double grausCelsius = scan.nextDouble();

        double fahrenheit = (grausCelsius * 1.8) + 32;

        System.out.println("O valor em fahrenheit é:" + fahrenheit);

         */ //ATIVIDADE 5

        /*System.out.println("Digite o valor em fahrenheit:");
        double fahrenheit = scan.nextDouble();

        double celcius = (fahrenheit - 32) / 1.8;

        System.out.printf("O valor em Celcius é: %.2f", celcius);

         */ //ATIVIDADE 6

        /*
        System.out.println("Digite o seu salário:");
        double salarioInicial = scan.nextDouble();

        System.out.println("Agora digite seu novo salário:");
        double novoSalario = scan.nextDouble();

        double porcentagem = ((novoSalario - salarioInicial)/ salarioInicial) * 100;

        System.out.println("A diferença do salário é de: " + porcentagem + "%");

         */ //ATIVIDADE 7

        /*
        System.out.println("Digite um valor:");
        int valor = scan.nextInt();

        if(valor < 0 ) {
            System.out.println("Você digitou um valor negativo.");
        } else if(valor == 0) {
            System.out.println("Você digitou zero.");
        } else {
            System.out.println("Você digitou um valor positivo.");
        }

         */ //ATIVIDADE 8

        /*
        System.out.println("Digite a primeira nota:");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = scan.nextDouble();

        System.out.println("Digite a terceira nota:");
        double nota3 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if(media < 5) {
            System.out.printf("Você foi reprovado!\nMédia: %.2f", media);

        } else if(media >= 5 && media < 7) {
            System.out.printf("Você está de recuperação.\nMédia: %.2f", media);
        } else {
            System.out.printf("Você foi aprovado.\nMédia: %.2f", media);
        }

         */ //ATIVIDADE 9

        /*
        System.out.println("Digite um número:");
        int valor = scan.nextInt();

        if(valor % 2 == 0) {
            System.out.println("É par.");
        } else {
            System.out.println("É impar.");
        }

         */ //ATIVIDADE 10

        /*
        System.out.println("Digite a sua idade:");
        int idade = scan.nextInt();

        if(idade < 0) {
            System.out.println("A idade não pode ser zero.");
        } else if(idade < 9) {
            System.out.println("Você é mirim.");
        } else if(idade >= 9 && idade < 14) {
            System.out.println("você é infantil.");
        } else if(idade >= 14 && idade < 18) {
            System.out.println("Você é Juvenil.");
        } else if(idade >= 18 && idade < 60) {
            System.out.println("Você é Adulto.");
        } else if(idade >= 60 && idade < 110) {
            System.out.println("Você é Idoso.");
        } else {
            System.out.println("Você já deve estar morto.");
        }

         */ //ATIVIDADE 11

        /*
        System.out.println("Digite o primeiro valor: ");
        int valor1 = scan.nextInt();

        System.out.println("Digite o segundo valor: ");
        int valor2 = scan.nextInt();

        System.out.println("Digite o terceiro valor: ");
        int valor3 = scan.nextInt();

        if(valor1 > valor2 && valor1 > valor3) {
            System.out.println(valor1 +" é o maior valor entre eles.");
        } else if(valor2 > valor1 && valor2 > valor3) {
            System.out.println(valor2 +" é o maior valor entre eles.");
        } else if(valor3 > valor1 && valor3 > valor2) {
            System.out.println(valor3 +" é o maior valor entre eles.");
        } else if(valor1 == valor2 && valor2 == valor3) {
            System.out.println("Todas as idades são iguais.");
        }

         */ //ATIVIDADE 12

        /*
        System.out.println("Digite o primeiro valor:");
        int valor1 = scan.nextInt();

        System.out.println("Digite o segundo valor:");
        int valor2 = scan.nextInt();

        int soma = valor1 + valor2;

        if(soma > 20) {
            soma += 8;
            System.out.println("Novo valor somado:" + soma);
        } else {
            soma -= 5;
            System.out.println("Novo valor subtraído:" + soma);
        }

         */ //ATIVIDADE 13

        /*
        System.out.println("Digite o valor da compra: ");
        double valorCompra = scan.nextDouble();

        if(valorCompra < 20) {
            double porcentagem = 0.45;
            double valorCompraPorcentagem = valorCompra * porcentagem;
            double novoValor = valorCompra + valorCompraPorcentagem;


            System.out.printf("Novo valor da compra: %.2f", novoValor);
        } else {
            double porcentagem = 0.30;
            double valorCompraPorcentagem = valorCompra * porcentagem;
            double novoValor = valorCompra + valorCompraPorcentagem;


            System.out.printf("Novo valor da compra: %.2f", novoValor);
        }

         */ //ATIVIDADE 14
    }


}