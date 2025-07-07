package devdojo.javacore.oo.collections.equals;

public class Smartphone {
    private String nome;
    private Double serialNumber;

    public Smartphone(String nome, Double serialNumber) {
        this.nome = nome;
        this.serialNumber = serialNumber;
    }

    public String getNome() {
        return nome;
    }

    public Double getSerialNumber() {
        return serialNumber;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSerialNumber(Double serialNumber) {
        this.serialNumber = serialNumber;
    }
}
