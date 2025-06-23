package devdojo.javacore.oo.enumeracao;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Carlos", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente1 = new Cliente("lUIS", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente.getTipoCliente());
    }
}
