package devdojo.javacore.oo.enumeracao;

public enum TipoCliente {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    //não pode vir antes das enumerações
    public final int valor;

    TipoCliente(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
