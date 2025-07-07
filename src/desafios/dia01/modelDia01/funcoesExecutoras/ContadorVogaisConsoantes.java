package desafios.dia01.modelDia01.funcoesExecutoras;

import java.util.ArrayList;
import java.util.List;

public class ContadorVogaisConsoantes {
    static List<Character> vogais = new ArrayList<>(List.of('a', 'e', 'i', 'o', 'u'));
    static List<Character> consoantes = new ArrayList<>(List.of( 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm',
            'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'));


    public static void contarVogaisEConsoantes(String mensagem) {

        String mensagemFormatada = mensagem.replaceAll(" ", "").toLowerCase();
        int contadorVogais = 0;
        int contadorConsoantes = 0;

        for(int i = 0; i < mensagemFormatada.length(); i ++) {
            char c = mensagemFormatada.charAt(i);

            if(vogais.contains(c)) {
                contadorVogais ++;
            } else if(consoantes.contains(c)){
                contadorConsoantes ++;
            }
        }

        System.out.println("Quantidade de vogais:" + contadorVogais + "\nQuantidade de consoantes:" + contadorConsoantes);
    }
}
