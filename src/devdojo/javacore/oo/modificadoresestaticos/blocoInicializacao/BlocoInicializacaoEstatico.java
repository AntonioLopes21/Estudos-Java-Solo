package devdojo.javacore.oo.modificadoresestaticos.blocoInicializacao;

import devdojo.javacore.oo.blocosdeinicializacao.BlocoDeInicializacao;

public class BlocoInicializacaoEstatico {
    private String nome;
    private static int [] episodios;

    //bloco executado apenas uma vez
    static {
        System.out.println("Dentro do bloco de inicialização");
         episodios = new int [50];

        for (int i = 0; i < episodios.length; i++) {
            System.out.println("Episódio:" + (episodios[i] = i+1));
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int[] getEpisodios() {
        return episodios;
    }

    public static void setEpisodios(int[] episodios) {
        BlocoInicializacaoEstatico.episodios = episodios;
    }
}
