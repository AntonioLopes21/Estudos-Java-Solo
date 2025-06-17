package LogicaDeProgramacao.desafioLista3Repeticao;

public class Questao28 {
    // Fazer um algoritmo que calcule e mostre a soma dos cem primeiros n´ umeros
    // inteiros

    public static void main(String[] args) {
        int soma = 0;
        for(int i = 0; i <= 100; i ++) {
            soma += i;
        }

        System.out.println("A soma dos 100 primeiros números é:" + soma);
    }
}
