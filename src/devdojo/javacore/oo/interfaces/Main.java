package devdojo.javacore.oo.interfaces;

import devdojo.javacore.oo.interfaces.classes.DataBaseLoader;
import devdojo.javacore.oo.interfaces.classes.FileLoader;

public class Main {
    public static void main(String[] args) {
        DataBaseLoader d = new DataBaseLoader();
        FileLoader f = new FileLoader();

        f.load();
        d.load();

        f.remove();
        d.remove();
        d.checkPermission();
        f.checkPermission();
    }
}
