package devdojo.javacore.oo.associacao.exercicio.principal;

import devdojo.javacore.oo.associacao.exercicio.Aluno;
import devdojo.javacore.oo.associacao.exercicio.Local;
import devdojo.javacore.oo.associacao.exercicio.Professor;
import devdojo.javacore.oo.associacao.exercicio.Seminario;

public class Main {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Pedro", 21);
        Professor p1 = new Professor("Carlos", "Matemática");
        Professor p2 = new Professor("Aloisio", "Ciências");

        Local local = new Local("Rua 13 de março");
        Local local2 = new Local("parque ibirapuera");

        Aluno [] alunos = {a1};

        Professor [] professoresMatematica = new Professor[] {p1, p2};
        Professor [] professoresCiencias = new Professor[] {p1};


        Seminario s1 = new Seminario("Matemática para estudantes", professoresMatematica,alunos, local);
        Seminario s2 = new Seminario("Matemática para estudantes", professoresCiencias,alunos, local2);

        Seminario [] seminarios = {s1, s2};

        p1.setSeminarios(seminarios);


        a1.setSeminario(s1);
        a1.setSeminario(s2);

        System.out.println("========alunos");
        a1.imprime();

        System.out.println("========professores");
        p1.imprime();

        System.out.println("========Seminario");
        s1.imprime();

    }
}
