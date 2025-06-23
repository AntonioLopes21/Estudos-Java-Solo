package devdojo.javacore.oo.associacao.exercicio;

public class Seminario {
    private String nome;
    private Professor [] professores;
    private Aluno [] alunos;
    private Local local;

    public Seminario(String nome, Professor[] professores, Local local) {
        this.nome = nome;
        this.professores = professores;
        this.local = local;
    }

    public Seminario(String nome, Professor[] professores, Aluno[] alunos, Local local) {
        this.nome = nome;
        this.professores = professores;
        this.alunos = alunos;
        this.local = local;
    }

    public void imprime() {
        System.out.println("Local:" + local.getNome());
        System.out.println("Professores:");
        if(professores == null) {
            System.out.println("Não existem professores palestrantes.");
        } else {
            System.out.println("Professores palestrantes:");
            for(Professor professor : professores) {
                System.out.println("Professor:" + professor.getNome());
            }
        }
        System.out.println("Alunos:");
        if(alunos == null) {
            System.out.println("O seminário não tem espectadores alunos.");
        } else {
            System.out.println("Estão assistindo o seminário:");
            for(Aluno aluno : alunos) {
                System.out.println("Nome: " + aluno.getNome());
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

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;

        if(professores == null) {
            System.out.println("Não existem professores palestrantes.");
        } else {
            System.out.println("Professores palestrantes:");
            for(Professor professor : professores) {
                System.out.println("Professor:" + professor.getNome());
            }
        }
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;

        if(alunos == null) {
            System.out.println("O seminário não tem espectadores alunos.");
        } else {
            System.out.println("Estão assistindo o seminário:");
            for(Aluno aluno : alunos) {
                System.out.println("Nome: " + aluno.getNome());
            }
        }
    }
}
