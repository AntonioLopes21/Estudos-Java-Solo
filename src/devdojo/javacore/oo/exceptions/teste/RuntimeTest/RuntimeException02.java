package devdojo.javacore.oo.exceptions.teste.RuntimeTest;

import java.io.File;
import java.io.IOException;

public class RuntimeException02 {
    public static void main(String[] args) throws IOException {
        criarArquivo();
    }

    private static void criarArquivo() throws IOException {
        File file = new File("arquivo\\novoArquivo.txt");

        try {
            boolean isCreated = file.createNewFile();

            if(!isCreated) {
                System.out.println("Arquivo com nome já existente. Altere o nome do arquivo.");
            } else {
                System.out.println("Arquivo criado com sucesso! " + isCreated);
            }
        } catch(IOException e) {
            System.out.println("Arquivo não criado.");
            e.printStackTrace();
        }
    }
}
