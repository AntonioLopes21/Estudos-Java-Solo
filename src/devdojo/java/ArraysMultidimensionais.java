package devdojo.java;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        //formas de declaração de arrays
        int [] numeros = new int [3];
        int [] numeros2 = {1, 2, 3, 4, 5};
        int [] numeros3 = new int[] {5,4,3,2,1};

        // dias e meses do ano
        //1 - meses
        //2 - dias
//        int [] [] janeiro = new int[31][];
//        int [] [] fevereiro = new int [28][];
//        int [] [] marco = new int [31][];

        int [] [] dias = new int [4][4];
        dias [0] [0] = 31;
        dias [0] [1] = 28;
        dias [0] [2] = 31;
        dias [0] [3] = 30;


        //for comum
        for (int i = 0; i < dias.length; i ++) {

            for(int j = 0; j < dias[i].length; j ++) {
                //System.out.println("\nINDICE I:" + i + "\nINDICE J:" + j + "\nVALOR INDICE I J:" + dias[i][j]);
            }
        }

        //forEach
        //valores passados de cada um dos arrays
        for(int []dia : dias) {
            for(int num : dia) {
                System.out.println(num);
            }
        }


    }
}
