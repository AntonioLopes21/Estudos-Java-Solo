package devdojo.javacore.oo.sobrecargametodos;

public class SobrecargaMetodo {
    private String nome;
    private String genero;
    private int episodios;
    private int anoLancamento;
    private String descricao;

    public SobrecargaMetodo() {

    }

    public SobrecargaMetodo (String nome, String genero, int episodios, int anoLancamento) {
        this.nome = nome;
        this.genero = genero;
        this.episodios = episodios;
        this.anoLancamento = anoLancamento;
    }

    public SobrecargaMetodo(String nome, String genero, int episodios, int anoLancamento, String descricao) {
        this.nome = nome;
        this.genero = genero;
        this.episodios = episodios;
        this.anoLancamento = anoLancamento;
        this.descricao = descricao;
    }

//    public void init(String nome, String genero, int episodios, int anoLancamento) {
//        this.nome = nome;
//        this.genero = genero;
//        this.episodios = episodios;
//        this.anoLancamento = anoLancamento;
//    }
//
//    public void init(String nome, String genero, int episodios, int anoLancamento, String descricao) {
//        this.init(nome, genero, episodios, anoLancamento);
//        this.descricao = descricao;
//    }

    public void imprime() {
        System.out.println("Nome:" + nome);
        System.out.println("Gênero:" + genero);
        System.out.println("Episodios:" + episodios);
        System.out.println("Ano de lançamento:" + anoLancamento);
        System.out.println("Descrição:" + descricao);
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

}
