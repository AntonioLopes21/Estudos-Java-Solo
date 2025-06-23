package devdojo.javacore.oo.associacao.exercicio;

import java.util.Arrays;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario [] seminarios;
    private int quantidadeSeminarios = 0;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("Nome do professor:" + nome);
        System.out.println("Idade do professor:" + especialidade);
        System.out.println("Seminários que está participando:");


        try {


        for(Seminario seminario : seminarios) {
            if(seminario == null) {
                System.out.println("Nenhum.");
            } else {
                System.out.println(seminario.getNome());
            }
        }
        } catch(NullPointerException e) {
            System.out.println("ERRO NO TAMANHO DO ARRAY" + e.getMessage());
        }
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Seminario[] getSeminarios() {
        return seminarios;

    }

    public void setSeminarios(Seminario[] seminarios) {
        if(quantidadeSeminarios < 1) {
            System.out.println("O professor não ministra nenhuma palestra.");
        } else if(quantidadeSeminarios == 1) {
            System.out.println("O professor ministra apenas um seminário.");
            for(Seminario seminario : seminarios) {
                System.out.println(seminario.getNome());
            }
        } else {
            System.out.println("O professor ministra vários seminários:");
            for(Seminario seminario : seminarios) {
                System.out.println(seminario.getNome());
            }
        }

        quantidadeSeminarios ++;
        this.seminarios = seminarios;
    }
}
