package LogicaDeProgramacao.desafiosChatGPT.ListaExercicios3;

import java.text.BreakIterator;
import java.util.Scanner;

public class NumerosPrimos1A100 {
    public static void main(String[] args) {
        //🔁 2. Números Primos de 1 a 100
        //Nível: Iniciante a intermediário
        //Liste todos os números primos de 1 a 100.
        // Crie um método que verifique se um número é primo.

        for(int i = 0; i <= 100; i ++) {
            String verificarPrimo = ehPrimo(i)? "É primo." : "Não é primo.";
            System.out.println("Número:" + i + " " + verificarPrimo);
        }

    }

    static boolean ehPrimo(int valor) {
        if (valor < 2) return false;
        for (int i = 2; i <= Math.sqrt(valor); i++) {
            if (valor % i == 0) {
                return false;
            }
        }
        return true;
    }
}
