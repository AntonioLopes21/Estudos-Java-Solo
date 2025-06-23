package devdojo.javacore.oo.associacao.dominio;

public class Main {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Pelé", 10);
        Jogador j2 = new Jogador("Zico", 10);
        Jogador j3 = new Jogador("Neymar", 10 );

        Jogador [] jogadores = {j1, j1, j1};
        Jogador [] jogadores1 = new Jogador[] {j3, j3};
        Jogador [] jogadores2 = new Jogador[] {j2, j2};

        Jogador [][] arrayDeArray = new Jogador[][] {jogadores, jogadores1, jogadores2};

        try {



        for(Jogador [] playerList : arrayDeArray) {
            //chama apenas o endereço de memória
            //System.out.println(playerList);
            System.out.println("Lista separada:");

            for(Jogador player : playerList) {
                System.out.println(player.getNome());
            }
        }

        } catch (NullPointerException e) {
            System.out.println("Não existem jogadores na array solicitada." + e.getMessage());
        }
    }
}
