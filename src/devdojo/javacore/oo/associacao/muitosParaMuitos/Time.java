package devdojo.javacore.oo.associacao.muitosParaMuitos;

public class Time {
    private String nome;
    private Jogador [] jogadores;

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprime() {
        System.out.println("Nome do clube:" + nome);
        if(jogadores == null) {
            System.out.println("O clube:" + nome + " não tem jogadores.");
        } else {
            for(Jogador jogador : jogadores) {
                jogador.setTime(Time.this);
                System.out.println("Nome do clube:\n"+ nome + "\nNome do jogador:\n" + jogador.getNome() + "\nNúmero da camisa:" + jogador.getNumeroCamisa() + "\n");
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
        int contador = 1;
        for(Jogador jogador : jogadores) {
            jogador.setNumeroCamisa(contador);
            contador ++;
        }
    }

    @Override
    public String toString() {
        return "Nome do time:" + nome;
    }
}
