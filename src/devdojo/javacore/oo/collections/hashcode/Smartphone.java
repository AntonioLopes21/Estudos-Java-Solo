package devdojo.javacore.oo.collections.hashcode;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return Objects.equals(nome, that.nome) && Objects.equals(serialNumber, that.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, serialNumber);
    }
}
