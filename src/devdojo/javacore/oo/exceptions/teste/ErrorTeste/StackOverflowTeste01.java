package devdojo.javacore.oo.exceptions.teste.ErrorTeste;

public class StackOverflowTeste01 {
    public static void main(String[] args) {
        try {
            recursividade();
        } catch (StackOverflowError e) {
            System.out.println("A memória estourou devido a recursividade excessiva da função.");
        }

    }

    static void recursividade() {
        recursividade();
    }
}
