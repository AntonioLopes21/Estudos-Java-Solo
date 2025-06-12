package Java.ManipulacaoString;

public class FormatString {
    public static void main(String[] args) {
        String texto = "Olha isso, main!";
        int idade = 32;
        String nome = "Paulin";

        //System.out.println(String.format("Meu nome é %s e tenho %d anos.", nome, idade));

        //desnecessário demais
        System.out.printf("Meu nome é %s e tenho %d anos.", nome, idade);
    }

}
