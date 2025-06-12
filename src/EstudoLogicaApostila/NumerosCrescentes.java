package EstudoLogicaApostila;

import java.util.*;

public class NumerosCrescentes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> listaDeNumeros = new ArrayList<>();

        System.out.println("Digite o primeiro valor:");
        int valor1 = scan.nextInt();

        System.out.println("Digite o segundo valor:");
        int valor2 = scan.nextInt();

        System.out.println("Digite o terceiro valor:");
        int valor3 = scan.nextInt();

        System.out.println("Digite o quarto valor:");
        int valor4 = scan.nextInt();

        System.out.println("Digite o quinto valor:");
        int valor5 = scan.nextInt();


        listaDeNumeros.add(valor1);
        listaDeNumeros.add(valor2);
        listaDeNumeros.add(valor3);
        listaDeNumeros.add(valor4);
        listaDeNumeros.add(valor5);

        int index1 = listaDeNumeros.get(0);
        int index2 = listaDeNumeros.get(1);
        int index3 = listaDeNumeros.get(2);
        int index4 = listaDeNumeros.get(3);
        int index5 = listaDeNumeros.get(4);

        if((index1 < index2) && (index2 < index3) && (index3 < index4) && (index4 < index5)) {
            System.out.println("A lista está em ordem crescente!");
            System.out.println(listaDeNumeros);

        } else {
            System.out.println("A lista não está em ordem crescente.");
            System.out.println(listaDeNumeros);

        }


        Collections.sort(listaDeNumeros);



        System.out.println(listaDeNumeros);

    }
}
