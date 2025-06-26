package devdojo.javacore.oo.interfaces.classes;

import devdojo.javacore.oo.interfaces.interfaces.DataLoader;
import devdojo.javacore.oo.interfaces.interfaces.DataRemover;

public class DataBaseLoader implements DataLoader, DataRemover {
    //int contador;


    @Override
    public void load() {
//        for(contador = 0; contador <= 100; contador ++) {
//            if(contador == 100) {
//                System.out.println(contador);
//                System.out.println("banco de dados Carregado!");
//            } else {
//                System.out.println("Carregando...");
//                System.out.println(contador);
//

        System.out.println("Carregando arquivos do banco de dados...");
            }



    @Override
    public void remove() {
        System.out.println("Removendo arquivos do banco de dados...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões do banco de dados...");
    }
}
