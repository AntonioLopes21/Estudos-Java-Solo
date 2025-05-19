package LogicaDeProgramacao.desafiosChatGPT.desafio2.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private String nomeBiblioteca;
    private int quantidadeLivros;


    public Biblioteca() {}

    public Biblioteca(String nomeBiblioteca, int quantidadeLivros) {
        this.nomeBiblioteca = nomeBiblioteca;
        this.quantidadeLivros = quantidadeLivros;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public String getNomeBiblioteca() {
        return nomeBiblioteca;
    }

    public void setNomeBiblioteca(String nomeBiblioteca) {
        this.nomeBiblioteca = nomeBiblioteca;
    }

    public int getQuantidadeLivros() {
        return quantidadeLivros;
    }

    public void setQuantidadeLivros(int quantidadeLivros) {
        this.quantidadeLivros = quantidadeLivros;
    }


    //métodos para locar e devolver livro
    public boolean emprestarLivro(Livro livro) {
        if(!livro.isEstaLocado()) {
            System.out.println("Livro locado com sucesso!");
            livro.setEstaLocado(true);
        } else {
            System.out.println("O livro já está locado com outra pessoa.");
        }

        return livro.isEstaLocado();
    }

    public boolean devolverLivro(Livro livro) {
        if(livro.isEstaLocado()) {
            System.out.println("Livro devolvido com sucesso!");
            livro.setEstaLocado(false);
        } else {
            System.out.println("O livro ainda não foi locado para ser devolvido.");
        }

        return livro.isEstaLocado();
    }

    public void adicionarLivroNaLista(int id, List<Livro> listaLivrosDisponiveis) {
        for(Livro l : listaLivrosDisponiveis) {
            if(l.getId() == id) {
                listaLivrosDisponiveis.add(l);
                System.out.println("Livro com id:" + id + " adicionado com sucesso!");
            } else {
                System.out.println("Livro com id inexistente." + id);

            }
        }
    }

    public List<Livro> listarLivros(List<Livro> listaLivrosDisponiveis) {
        for (Livro l : listaLivrosDisponiveis) {
            System.out.println(l + "\n");
        }

        return livros;
    }

    public void editarLivroEmEstoque(int id, String nome, String nomeAutor, Date dataLancamento) {
        for(Livro l : livros) {
            if(l.getId() == id) {
                l.setNome(nome);
                l.setNomeAutor(nomeAutor);
                l.setDataLancamento(dataLancamento);

                System.out.println("Livro editado com sucesso!");
            } else {
                System.out.println("Livro com id: " + id + " não existe no estoque.");
            }
        }
    }

    public void removerLivroDoEstoque(int id, List<Livro> listaLivrosDisponiveis) {
        for(Livro l : listaLivrosDisponiveis) {
            if(l.getId() == id) {
                listaLivrosDisponiveis.remove(l);
                System.out.println("Livro removido do estoque com sucesso!");
            } else {
                System.out.println("O livro com o id:" + id + " não existe em estoque.") ;
            }
        }
    }
}
