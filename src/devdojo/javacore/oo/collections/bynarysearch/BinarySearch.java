package devdojo.javacore.oo.collections.bynarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(6);
        numeros.add(5);
        numeros.add(3);
        numeros.add(4);
        numeros.add(2);

        Collections.sort(numeros);

        System.out.println(numeros);

        //((- ponto de inserção) - 1)
        System.out.println(Collections.binarySearch(numeros, 1));

    }
}
