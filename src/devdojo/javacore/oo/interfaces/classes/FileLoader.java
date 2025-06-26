package devdojo.javacore.oo.interfaces.classes;

import devdojo.javacore.oo.interfaces.interfaces.DataLoader;
import devdojo.javacore.oo.interfaces.interfaces.DataRemover;

public class FileLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando arquivos...");

    }

    @Override
    public void remove() {
        System.out.println("Removendo arquivos...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões de arquivos...");
    }
}
