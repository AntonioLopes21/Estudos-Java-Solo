package LogicaDeProgramacao.desafioLista3Repeticao;

public class ContadorProgressivoERegressivo {
    public static void main(String[] args) {
        int repeticao = 0;
        while(repeticao < 1) {
            System.out.println(contadorRegressivo(contadorProgressivo()));
           repeticao ++;
        }
    }

    static int contadorProgressivo() {
        int i;
        for(i = 0; i <= 100; i ++) {
            System.out.println(i);
        }

        return i;
    }

    static int contadorRegressivo(int contador) {
        for(contador = 100; contador > 0; contador --) {
            System.out.println(contador);
        }

        return contador;
    }
}
