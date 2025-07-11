package desafios.dia02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContadorVogaisEConsoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> vogais = new ArrayList<>();
        vogais.add("a");
        vogais.add("e");
        vogais.add("i");
        vogais.add("o");
        vogais.add("u");

        List<String> consoantes = new ArrayList<>(List.of(
                "b", "c", "d", "f", "g", "h", "j", "k", "l", "m",
                "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"
        ));

        System.out.println("Digite a frase ou palavra:");
        String frase = scan.nextLine();

        String fraseFormatada = frase.replaceAll(" ", "").toLowerCase();

        int contadorVogais = 0;
        int contadorConsoantes = 0;

        for(int i = 0; i < fraseFormatada.length(); i++){
            String itemfraseFormatada = fraseFormatada.charAt(i) + "";
            if(vogais.contains(itemfraseFormatada)){
                contadorVogais++;
            } else if(consoantes.contains(itemfraseFormatada)){
                contadorConsoantes++;
            }
        }

        System.out.println("Quantidade de consoantes: " +  contadorConsoantes);
        System.out.println("Quantidade de vogais: " +  contadorVogais);

        scan.close();
    }
}
