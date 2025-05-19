package LogicaDeProgramacao.desafiosChatGPT.desafio2.model;
import java.util.Date;

public class Livro {

    private int id;
    private String nome;
    private String nomeAutor;
    private Date dataLancamento;
    private boolean estaLocado;

    public Livro() {}

    public Livro(String nome, String nomeAutor, Date dataLancamento) {
        this.nome = nome;
        this.nomeAutor = nomeAutor;
        this.dataLancamento = dataLancamento;
        this.estaLocado = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public boolean isEstaLocado() {
        return estaLocado;
    }

    public void setEstaLocado(boolean estaLocado) {
        this.estaLocado = estaLocado;
    }

    public String criarLivro(String nome, String nomeAutor, Date dataLancamento) {
        Livro livro = new Livro();
        livro.setNome(nome);
        livro.setNomeAutor(nomeAutor);
        livro.setDataLancamento(dataLancamento);

        return "Livro criado:\n" + livro;
    }

    @Override
    public String toString() {
        return "Nome do livro: " + this.getNome() + ", " + "Nome do autor: " + this.getNomeAutor() + ", " + "Data de lançamento: " + this.getDataLancamento();
    }
}
