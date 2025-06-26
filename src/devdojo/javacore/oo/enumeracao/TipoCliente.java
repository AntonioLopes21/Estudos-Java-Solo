package devdojo.javacore.oo.enumeracao;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    //não pode vir antes das enumerações
    public final int valor;
    private String nomeRelatorio;

    //busca por atributo
    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
        for(TipoCliente tipoCliente : values()) {
            if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
                return tipoCliente;
            }
        }

        return null;
    };

    TipoCliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public int getValor() {
        return valor;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public void setNomeRelatorio(String nomeRelatorio) {
        this.nomeRelatorio = nomeRelatorio;
    }


}
