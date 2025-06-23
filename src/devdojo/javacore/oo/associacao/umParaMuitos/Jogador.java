package devdojo.javacore.oo.associacao.umParaMuitos;

public class Jogador {
    private String nome;
    private int numeroCamisa;
    private Time time;

    public Jogador(String nome, int numeroCamisa, Time time) {
        this.nome = nome;
        this.numeroCamisa = numeroCamisa;
        this.time = time;
    }

    public Jogador(String nome, int numeroCamisa) {
        this.nome = nome;
        this.numeroCamisa = numeroCamisa;
    }

    public void imprime() {
        System.out.println("Nome:" + nome);
        System.out.println("Número:" + numeroCamisa);
        if(time == null) {
            System.out.println("Time: sem time");
        } else {
            System.out.println("Time:" + time.getNome());
        }
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        System.out.println(getNome() + " Contratado por: " + time.getNome());
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }
}
