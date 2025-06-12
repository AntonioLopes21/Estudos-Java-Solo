package EstudoLogicaApostila;

import java.util.Scanner;

public class ContagemCaracteres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um nome ou texto:");
        String textoOuNome = scan.nextLine();

        String resultado = textoOuNome.trim().replaceAll("\\s", "");
        System.out.println(resultado + " com o trim");


        for(int contador = 0; contador < resultado.length(); contador ++) {
            System.out.println("Caractere N°:" +(contador + 1) + ": " + resultado.charAt(contador));
        }


    }
}
