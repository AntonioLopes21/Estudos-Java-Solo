package devdojo.javacore.oo.polimorfismo.domain;

public class Computador extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.21;

    public Computador(double valor, String nome) {
        super(valor, nome);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do :" + nome);
        return valor * IMPOSTO_POR_CENTO ;
    }
}
