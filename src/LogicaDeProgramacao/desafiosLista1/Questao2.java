package LogicaDeProgramacao.desafiosLista1;

import java.util.Scanner;

public class Questao2 {
    //Fazer um algoritmo que leia um n  ́umero e mostre o seu antecessor e o seu sucessor
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor:");
        int valor = scan.nextInt();

        int antecessor = valor - 1;
        int sucessor = valor + 1;

        System.out.printf("O antecessor de %d é %d e o sucessor é %d", valor, antecessor, sucessor);

    }
}
