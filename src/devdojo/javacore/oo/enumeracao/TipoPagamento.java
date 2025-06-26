package devdojo.javacore.oo.enumeracao;

public enum TipoPagamento {
    CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * .1;
        }
    }
    ,
    //ctrl + o
    DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * .05;
        }
    };

    //metodo abstrato - sem corpo.
    //regra - utilizar o metodo abstrato
    public abstract double calcularDesconto(double valor);


}

