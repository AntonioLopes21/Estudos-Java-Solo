package devdojo.java;

import java.util.Scanner;

public class ArrayMulti {
    public static void main(String[] args) {
        int[][] arrayMulti = new int [3][3];

        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < arrayMulti.length; i ++) {
            for(int j = 0; j < arrayMulti[i].length; j ++){
                System.out.println("Digite o valor do índice:");
                int numero = scan.nextInt();
                arrayMulti[i][j] = numero;
            }
        }

        for(int [] array : arrayMulti) {
            System.out.println("\n------------");
            for(int num : array) {
                System.out.print(num + " ");
            }
        }
    }
}
