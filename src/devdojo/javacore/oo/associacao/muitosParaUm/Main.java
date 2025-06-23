package devdojo.javacore.oo.associacao.muitosParaUm;

public class Main {
    public static void main(String[] args) {
        Professor p1 = new Professor("Carlos");
        Professor p2 = new Professor("Jiraya");
        Professor [] professores = {p1, p2};

        Escola escola = new Escola("Escolinha fundamental 1", professores);
        escola.imprime();

    }
}
