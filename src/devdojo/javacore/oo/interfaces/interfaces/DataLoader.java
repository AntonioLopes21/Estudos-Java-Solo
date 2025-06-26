package devdojo.javacore.oo.interfaces.interfaces;

public interface DataLoader {
    //public static final
    int MAX_DATA_SIZE = 10;

    void load();

    default void checkPermission() {
        System.out.println("Fazendo checagem de permissões.");
    };
}
