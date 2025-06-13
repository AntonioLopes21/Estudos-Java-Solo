package LogicaDeProgramacao.HackerRank;

import java.util.*;
public class HackerRank {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named
        Solution. */
        Scanner scan = new Scanner(System.in);

        StringBuilder nome = new StringBuilder(scan.nextLine());
        int valor = scan.nextInt();
        scan.nextLine();

        StringBuilder segundoNome = new StringBuilder(scan.nextLine());
        int valor2 = scan.nextInt();
        scan.nextLine();

        StringBuilder terceiroNome = new StringBuilder(scan.nextLine());
        int valor3 = scan.nextInt();
        scan.nextLine();


        System.out.println("================================");
        System.out.println(verificarTamanho(nome) + formatarValores(valor));
        System.out.println(verificarTamanho(segundoNome) + formatarValores(valor2));
        System.out.println(verificarTamanho(terceiroNome) + formatarValores(valor3));
        System.out.println("================================");

        scan.close();

    }

    static StringBuilder verificarTamanho(StringBuilder nome) {
        int contador = 15;
        String mensagem = " ";

        if (nome.length() <= contador) {
            for (int i = nome.length(); i < contador; i++) {
                nome.append(mensagem);
            }
        }

        return nome;
    }

    static String formatarValores(int valor) {
        String juncao = null;

        if (valor < 10) {
            String novaString = String.valueOf(valor);
            String zeroFixo = "00";

            juncao = zeroFixo + novaString;
        } else if (valor < 100) {
            String novaString = String.valueOf(valor);
            String zeroFixo = "0";

            juncao = zeroFixo + novaString;
        } else {
            juncao = String.valueOf(valor);
        }

        return juncao;
    }
}
