package EstudoLogicaApostila;

import java.lang.classfile.attribute.SourceDebugExtensionAttribute;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int fibo = 0;

        System.out.println("Digite o valor final para a sequencia de fibonacci:");
        int valor = scan.nextInt();

        System.out.println("Valor Fibo:" + a);
        System.out.println("Valor Fibo:" + b);

        while(fibo <= valor) {


            fibo = a + b;
            a = b;
            System.out.println("A:" + a);
            b = fibo;

            System.out.println( "B:" + b);

            System.out.println("Valor Fibo:" + fibo);

        }
    }
}
