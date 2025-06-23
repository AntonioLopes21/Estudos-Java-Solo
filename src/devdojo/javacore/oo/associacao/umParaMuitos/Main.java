package devdojo.javacore.oo.associacao.umParaMuitos;

public class Main {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Neymar", 10);

        Time time = new Time("São Paulo");

        j1.imprime();
        j1.setTime(time);

        j1.imprime();
    }

}
