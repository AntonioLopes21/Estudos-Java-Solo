package LogicaDeProgramacao.desafiosLista2Condicionais;

import java.util.Scanner;

public class Questao21 {
    // Escrever um algoritmo que leia trˆ es valores inteiros e verifique se eles podem ser os
    // lados de um triˆ angulo. Se forem, informar qual o tipo de triˆ angulo que eles formam: equil´ atero,
    // is ´ oscele ou escaleno.
    // • Propriedade: o comprimento de cada lado de um triˆ angulo ´e menor do que a soma dos
    // comprimentos dos outros dois lados.
    // • Triˆ angulo Equil´ atero: aquele que tem os comprimentos dos trˆ es lados iguais;
    // • Triˆ angulo Is´oscele: aquele que tem os comprimentos de dois lados iguais. Portanto, todo
    // triˆ
    // angulo equil´ atero ´ e tamb´em is´osceles;
    // • Triˆ angulo Escaleno: aquele que tem os comprimentos de seus trˆ es lados diferentes

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        int primeiro = scan.nextInt();

        System.out.println("Digite o segundo valor:");
        int segundo = scan.nextInt();

        System.out.println("Digite o terceiro valor:");
        int terceiro = scan.nextInt();

        System.out.println("Tipo de triângulo: " + verificarTrianguloValido(primeiro, segundo, terceiro));

        scan.close();
    }

    static String verificarTrianguloValido(int v1, int v2, int v3) {
        if(v1 >= v2 + v3 || v2 >= v1 + v3 || v3 >= v1 + v2) {
            return "Não é um triângulo válido";
        } else {
            return "É um triângulo válido:" + verificarTipoTriangulo(v1, v2, v3);
        }
    }

    static String verificarTipoTriangulo(int valor1, int valor2, int valor3) {
        String resposta = "";

        if(valor1 == valor2 && valor1 == valor3) {
            resposta = "Triângulo equilátero.";
        }

        if(valor1 == valor2 && valor2 != valor3 || valor1 == valor3 && valor3 != valor2 || valor2 == valor3 && valor2 != valor1) {
            resposta = "Triângulo Isóscele.";
        }

        if(valor1 != valor2 && valor1 != valor3) {
            resposta ="Triângulo Escaleno.";
        }

        return resposta;
    }
}
