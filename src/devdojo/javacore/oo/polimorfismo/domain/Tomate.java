package devdojo.javacore.oo.polimorfismo.domain;

public class Tomate extends Produto{
    public static final double IMPOSTO_POR_CENTO = .06;
    private String dataDeValidade;

    public Tomate(double valor, String nome) {
        super(valor, nome);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do :" + nome);
        return valor * IMPOSTO_POR_CENTO;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }
}
