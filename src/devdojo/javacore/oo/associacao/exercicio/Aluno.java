package devdojo.javacore.oo.associacao.exercicio;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;
    private int quantidade;

    public Aluno( String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, Seminario seminario) {
        this.nome = nome;
        this.seminario = seminario;
    }

    public void imprime() {
        System.out.println("Nome do aluno:" + nome);
        System.out.println("Idade do aluno:" + idade);
        System.out.println("Seminário que está participando:" + this.getSeminario().getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSeminario(Seminario seminario) {
        if(quantidade > 1 ) {
            System.out.println("um aluno não pode estar em mais de um seminário.");
        } else {
            this.quantidade += 1;
            this.seminario = seminario;
        }

    }

}
