package devdojo.javacore.oo;

public class VarArgs {
    public static void main(String[] args) {
        VarArgsArray varArgs = new VarArgsArray();

        varArgs.somarNumeros(new int [] {1,2,3,4,5,7}) ;
        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;");
        varArgs.somarNumeros(1,2,3,4,5,6,7,8,9,10);
    }
}
