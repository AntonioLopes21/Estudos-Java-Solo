package devdojo.javacore.oo.associacao.muitosParaMuitos;

public class Main {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Neymar");
        Jogador j2 = new Jogador("Sérgio Ramos");


        Time time1 = new Time("São Paulo");
        Time time2 = new Time("Barcelona");

        Jogador [] jogadores = {j1, j2};

        System.out.println("----jogador");

        j1.imprime();

        System.out.println("----time 1");
        time1.imprime();
        time1.setJogadores(jogadores);
        time1.imprime();
        System.out.println("----time 2");

        time2.setJogadores(jogadores);
        time2.imprime();

    }
}
