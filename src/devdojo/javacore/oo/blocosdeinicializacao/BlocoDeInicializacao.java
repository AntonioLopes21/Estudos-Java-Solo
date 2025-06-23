package devdojo.javacore.oo.blocosdeinicializacao;

public class BlocoDeInicializacao {
    private String nomeAnime;
    private int [] episodios;

    //bloco de inicialização
    {
        episodios = new int [100];
        for (int i = 0; i < episodios.length; i ++) {
            episodios[i] = i + 1;
        }
    }

    public BlocoDeInicializacao() {

        for(int numbers : episodios) {
            System.out.print(numbers + " ");
        }
    }

    public BlocoDeInicializacao(String nome, int [] episodios) {
        this.nomeAnime = nome;
        this.episodios = episodios;
    }

    public void setNome(String nomeAnime) {
        this.nomeAnime = nomeAnime;
    }

    public String getNome() {
        return nomeAnime;
    }

    public void setNumeroEpisodios(int [] episodios) {
        this.episodios = episodios;
    }

    public int [] getEpisodios() {
        return episodios;
    }
}
