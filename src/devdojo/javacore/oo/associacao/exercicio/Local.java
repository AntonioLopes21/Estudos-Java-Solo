package devdojo.javacore.oo.associacao.exercicio;

public class Local {
    private String nome;
    private Seminario seminario;
    private int quantidadeSeminarios = 0;

    public Local(String nome) {
        this.nome = nome;
    }

    public Local(String nome, Seminario seminario) {
        this.nome = nome;
        this.seminario = seminario;
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

    public void setSeminario(Seminario seminario) {
        if(quantidadeSeminarios > 1) {
            System.out.println("Um local pode exibir apenas um seminário.");
        } else {
            quantidadeSeminarios +=1;
            this.seminario = seminario;
        }
    }
}
