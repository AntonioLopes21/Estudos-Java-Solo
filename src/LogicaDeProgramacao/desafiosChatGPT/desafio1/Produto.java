package LogicaDeProgramacao.desafiosChatGPT.desafio1;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class Produto {

    private Long id;
    private String nome;
    private double preco;
    private int quantidade;
    private List<Produto> listaProdutos = new ArrayList<>();
    private List<Long> listaDeIds = new ArrayList<>();

    public Produto() {
    }

    public Produto(Long id, String nome, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public List<Long> getListaDeIds() {
        return listaDeIds;
    }

    public void setListaDeIds(List<Long> listaDeIds) {
        this.listaDeIds = listaDeIds;
    }

    public String somarValorTotalEmEstoque(int quantidade, double preco) {
        double valorTotalDoEstoque = quantidade * preco;

        return "O valor total do produto:" + this.nome + "\nde acordo com o que se possui em estoque é de: " + valorTotalDoEstoque;
    }

    public List exibirListaProduto() {
        if(listaProdutos.isEmpty()) {
            System.out.println("A lista está vazia.");
        }

        else {
            for (Produto produto : listaProdutos) {
                System.out.println("------------------------------------------");
                System.out.println("ID:" + produto.getId());
                System.out.println("Nome:" + produto.getNome());
                System.out.println("Preço:" + produto.getPreco());
                System.out.println("Quantidade em estoque:" + produto.getQuantidade());
                System.out.println(somarValorTotalEmEstoque(produto.getQuantidade(), produto.getPreco()));
                System.out.println("------------------------------------------");

            }
        }

        return listaProdutos;
    }

    public void criarProduto(Produto produto, Long id, String nome, double preco, int quantidade) {
        produto.setId(id);
        produto.setNome(nome);
        produto.setPreco(preco);
        produto.setQuantidade(quantidade);

        this.nome = produto.getNome();
        this.preco = produto.getPreco();
        this.quantidade = produto.getQuantidade();


        listaProdutos.add(produto);
        System.out.println(produto + "\nadicionado com sucesso!");
    }

    public void editarProduto(Long id, String nome, double preco, int quantidade) {
        for(Produto p : listaProdutos) {
            if(p.getId() == id) {
                p.setNome(nome);
                p.setPreco(preco);
                p.setQuantidade(quantidade);

                System.out.println("Produto editado com sucesso!\n" + p);
            }
        }
    }

    public void removerLista(Long id) {
        try {
            for(Produto p : listaProdutos) {
                if(p.getId() == id) {
                    listaProdutos.remove(p);
                    System.out.println("Pessoa removida com sucesso!");
                }
            }

        } catch (ConcurrentModificationException e) {
            System.out.println(("O produto está nulo:" + e.getMessage()));
        }
    }

    @Override
    public String toString() {
        return "Produto:\n" + "Nome do Produto: " + this.nome + "\nPreço do Produto: " + this.preco + "\nQuantidade do Produto: " + this.quantidade;
    }
}
