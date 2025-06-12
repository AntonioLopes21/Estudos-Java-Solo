package LogicaDeProgramacao.desafiosChatGPT.ListaExercicios3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContadorCaracteres {
    public static void main(String[] args) {
        //Nível: Iniciante
        //Peça uma frase ao usuário e exiba quantas vezes
        //cada letra aparece (ignorando espaços e
        //considerando letras minúsculas).

        Map<Character, Integer> contagemLetras = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a frase ou palavra:");
        String fraseOuPalavra = scan.nextLine().toLowerCase();

        //System.out.println(fraseOuPalavra);

        char [] listaPalavras = fraseOuPalavra.toCharArray();
        System.out.println(Arrays.toString(listaPalavras));
        int contador = 0;
        int contadorDoCiclo = 0;

        for(char letra : listaPalavras) {
            if (letra != ' ') {
                contagemLetras.put(letra, contagemLetras.getOrDefault(letra, 0) + 1);
            }

            contadorDoCiclo ++;
            if(contadorDoCiclo == listaPalavras.length) {
                System.out.println(contagemLetras);

            }
        }




    }


}
