package devdojo.javacore.oo.heranca;

public class Endereco {
    private String rua;
    private String cep;

    public Endereco(String rua, String cep) {
        this.rua = rua;
        this.cep = cep;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
}
