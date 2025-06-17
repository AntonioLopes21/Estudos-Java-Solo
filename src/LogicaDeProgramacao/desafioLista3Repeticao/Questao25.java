package LogicaDeProgramacao.desafioLista3Repeticao;

public class Questao25 {
    // Fac¸a um algoritmo que mostre os n´ umeros pares compreendidos entre 14 e 30
    // (inclusive)
    public static void main(String[] args) {
        int contador;
        for(contador = 14; contador <= 30; contador ++) {
            if(contador % 2 != 0) {
                continue;
            }

            System.out.println(contador);
        }
    }
}
