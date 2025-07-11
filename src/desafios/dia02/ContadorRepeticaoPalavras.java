package desafios.dia02;

import java.util.*;

public class ContadorRepeticaoPalavras {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<Character, Integer> contadorPalavras = new HashMap<>();

        System.out.println("Digite uma palavra: ");
        String palavra = scan.nextLine();

        String palavraFormatada = palavra.replace(" ", "").toLowerCase();
        int contador = 0;

        for (int i = 0; i < palavraFormatada.length(); i++) {
            Character letraNoIndice = palavraFormatada.charAt(i);

            if (contadorPalavras.containsKey(letraNoIndice)) {
                contador++;
                contadorPalavras.put(letraNoIndice, contador);
            } else {
                contador = 1;
                contadorPalavras.put(letraNoIndice, contador);

            }
        }

        List<Map.Entry<Character, Integer>> listaOrdenada = new ArrayList<>(contadorPalavras.entrySet());
        listaOrdenada.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue())); // ordem decrescente

        System.out.println(listaOrdenada);



//        for (Map.Entry<Character, Integer> entry : contadorPalavras.entrySet()) {
//            Character chave = entry.getKey();
//            Integer valor = entry.getValue();
//
//            if(palavraFormatada.contains(chave.toString().toLowerCase()) && valor > 1) {
//                System.out.println("A letra:" + chave + " aparece " + valor + " vezes.");
//            }
//
//
//            if (contadorPalavras.containsKey(letraNoIndice)) {
//                contador++;
//                contadorPalavras.put(letraNoIndice, contador);
//            } else {
//                contadorPalavras.put(letraNoIndice, contador);
//            }
//
//
//        }


        scan.close();
    }
}
