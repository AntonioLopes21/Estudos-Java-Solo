package LogicaDeProgramacao.desafioLista3Repeticao;

import java.util.Scanner;

public class Questao34 {
    // Ler 10 valores, um de cada vez, e contar quantos deles est˜ ao no intervalo [10...50]
    // e quantos deles est˜ ao fora deste intervalo. Mostrar as quantidades calculadas.

    public static void main(String[] args) {
        int contadorContagemDentro = 0;
        int contadorContagemFora = 0;

        Scanner scan = new Scanner(System.in);
        int contadorScannerDentro = 0;
        int contadorScannerFora = 0;

        for(int i = 0; i < 10; i ++) {
            System.out.println("Digite um valor:");
            int valor = scan.nextInt();

            if(valor >= 10 && valor <= 50) {
                contadorScannerDentro ++;
                System.out.println(valor + " estão no intervalo de 10 a 50.\n" + " Contagem dentro:" + contadorScannerDentro);
            } else {
                contadorScannerFora ++;
                System.out.println(valor + " não estão no intervalo de 10 a 50.\n" + "ContagemFora:" + contadorScannerFora);
            }
        }

        System.out.println(contadorScannerDentro + " estão dentro do intervalo.");
        System.out.println(contadorScannerFora + " estão fora do intervalo.");


        //testes unitários na lógica
        for(int i = 0; i <= 100; i++) {
            if(i >= 10 && i <= 50) {
                contadorContagemDentro ++;
                verificarIntervalode10A50(i, contadorContagemDentro);
            } else {
                contadorContagemFora ++;
                verificarIntervalode10A50(i, contadorContagemFora);
            }
        }

    }



    static void verificarIntervalode10A50(int valor, int contador) {


        if(valor >= 10 && valor <= 50) {
            System.out.println(valor + " está no intervalo de 10 a 50.\n" + " Contagem dentro:" + contador);

        } else {
            System.out.println(valor + " não está no intervalo de 10 a 50.\n" + "ContagemFora:" + contador);
        }
    }
}
