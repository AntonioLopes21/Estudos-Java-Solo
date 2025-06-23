package devdojo.javacore.oo.associacao.muitosParaMuitos;

public class Jogador {
    private String nome;
    private int numeroCamisa;
    private Time time;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Jogador(String nome, int numeroCamisa, Time time) {
        this.nome = nome;
        this.numeroCamisa = numeroCamisa;
        this.time = time;
    }

    public void imprime() {
        System.out.println("Jogador:" + nome);
        if(numeroCamisa == 0) {
            System.out.println(nome + " não tem número de camisa.");
        } else {
            System.out.println("Número da camisa:" + numeroCamisa);
        }

        if(time == null) {
            System.out.println(nome + " não tem clube.");
        } else {
            System.out.println("Clube:" + time);
        }
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

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
        if(time != null) {
            System.out.println(nome + " contratado pelo time do:" + time.getNome());
        }
    }
}
