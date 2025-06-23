package devdojo.javacore.oo.heranca;

public class Pessoa {
    private String nome;
    private String cep;
    private Endereco endereco;

    public Pessoa(String nome, String cep, Endereco endereco) {
        this.nome = nome;
        this.cep = cep;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
