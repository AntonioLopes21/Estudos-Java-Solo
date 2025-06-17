package LogicaDeProgramacao.desafioLista3Repeticao;

public class Questao33 {
    //Calcular e mostrar a m´edia aritm´ etica dos n´ umeros pares compreendidos entre 13
    // e 73.

    public static void main(String[] args) {
        int soma = 0;
        int quantidadeItens = 0;

        for(int i = 13; i <= 73; i++) {

            if(i % 2 == 0) {
                soma += i;
                quantidadeItens ++;
//                System.out.println("Soma dos pares:" + soma + " Contador:" + i);
//                System.out.println("Quantidade de itens:" + quantidadeItens);
            }
        }

        System.out.println("Soma dos pares:" + soma);
        System.out.println("Quantidade de itens:" + quantidadeItens);

        double mediaAritmetica = (double) soma / quantidadeItens;
        System.out.printf("Média dos valores: %.2f", mediaAritmetica);


    }
}
