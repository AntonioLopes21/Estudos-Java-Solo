package devdojo.javacore.oo.exceptions.teste.RuntimeTest;

public class RunTimeExceptionTeste01 {
    //checked e unchecked
    public static void main(String[] args) {
        //ctrl + q
        System.out.println(divisao(1, 0));
    }

    /**
     *
     * @param a
     * @param b  Não pode ser zero
     * @return  a/b
     * @Throws IllegalArgumentException caso b seja zero
     */

    static int divisao(int a, int b) {
//        if(b == 0) {
//            throw new RuntimeException("Argumento ilegal. Não pode ser zero.");
//        }

        try {
            return a/b;
        } catch(ArithmeticException e) {
            System.out.println("A divisão não pode ser realizada por zero.\n" + e.getMessage());
//            e.printStackTrace();
//            throw new ArithmeticException("A divisão não pode ser realizada por zero.");
        }
        return 0;
    }

}

