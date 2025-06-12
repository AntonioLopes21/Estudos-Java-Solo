package Java.ManipulacaoString;

public class StringBuilderJava {
    public static void main(String[] args) {
        String texto = "Esse texto ";
        StringBuilder texto2 = new StringBuilder();

        texto += "é a continuação do texto sem o stringBuilder";

        System.out.println(texto);

        texto2.append("Inicio ");
        texto2.append("do texto ");
        texto2.append("SpringBuilder\n" + texto);

        System.out.println(texto2);
    }
}
