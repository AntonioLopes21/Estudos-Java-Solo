package devdojo.javacore.oo;

public class VarArgsArray {
    public void somarNumeros(int...numeros) {
        int soma = 0;
        for(int numero : numeros) {
            soma += numero;
        }

        System.out.println(soma);
    }
}
