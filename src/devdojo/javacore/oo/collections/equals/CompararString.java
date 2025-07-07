package devdojo.javacore.oo.collections.equals;

public class CompararString {
    public static void main(String[] args) {
        String nome1 = "Itália";
        String nome2 = "Itália";

        System.out.println(nome1 == nome2);
        System.out.println(nome1.equals(nome2));

        String nome3 = "salvador";
        String nome4 = new String("salvador");

        System.out.println(nome1 == nome2);
        System.out.println(nome1.equals(nome2));

        Smartphone s1 = new Smartphone("aPPLE", 100000000D);
        Smartphone s2 = new Smartphone("DRAAAGON ROOOORE", 10D);
        Smartphone s3 = s1;

        System.out.println(s1.equals(s3));
    }
}
