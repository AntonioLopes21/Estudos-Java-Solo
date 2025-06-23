package devdojo.javacore.oo.associacao.muitosParaUm;

public class Escola {
    private String nome;
    private Professor [] professores;

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void imprime() {
        System.out.println("Nome da escola:\n" + nome);
        if(professores == null) {
            System.out.println("A escola ainda não tem professores.");
        } else {
            int quantidade = 1;
            for(Professor professor : professores) {
                System.out.println("Quantidade de professores:\n" + quantidade);
                System.out.println("Professor:" + quantidade + " Nome:" + professor.getNome());
                quantidade ++;
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
