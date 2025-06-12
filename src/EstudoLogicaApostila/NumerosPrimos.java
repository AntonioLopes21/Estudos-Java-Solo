package EstudoLogicaApostila;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> listaDeNumeros = new ArrayList<>();

        System.out.println("Digite o primeiro número:");
        int valor = scan.nextInt();

        System.out.println("Digite o segundo número:");
        int valor2 = scan.nextInt();

        listaDeNumeros.add(valor);
        listaDeNumeros.add(valor2);

        
    }
}
