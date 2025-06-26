package devdojo.javacore.oo.enumeracao;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Carlos", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente1 = new Cliente("lUIS", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente.getTipoCliente());

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_JURIDICA");
        System.out.println(tipoCliente);

        //por nome relatório
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);

    }

}
