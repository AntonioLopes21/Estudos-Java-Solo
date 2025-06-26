package devdojo.javacore.oo.classesAbstratas;

public class Main {
    public static void main(String[] args) {
        Desenvolvedor dev = new Desenvolvedor("CARLINHOS", 10000);
        Gerente ger = new Gerente("Gervásio", 500000);


        System.out.println(dev.calcularBonus());
        System.out.println(ger.calcularBonus());

    }
}
