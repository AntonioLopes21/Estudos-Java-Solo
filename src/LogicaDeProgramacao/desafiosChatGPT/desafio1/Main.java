package LogicaDeProgramacao.desafiosChatGPT.desafio1;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Produto produto = new Produto();
        boolean verificacao = true;

        System.out.println("Bem vindo ao estoque de produtos");

        while(verificacao) {
            System.out.println("O que você deseja fazer:\n1 - Adicionar produto\n2 - Listar produto\n3 - editar produto\n4 - remover produto\n 5 - sair do programa");
            int escolha = scan.nextInt();
            scan.nextLine();

            switch(escolha) {
                case 1:
                    System.out.println("Adicionando produto...");
                    System.out.println("Digite o id do produto:");
                    Long id = scan.nextLong();
                    scan.nextLine();

                    System.out.println("Digite o nome do produto:");
                    String nome = scan.nextLine();

                    System.out.println("Digite o preço do produto:");
                    double preco = scan.nextDouble();
                    scan.nextLine();

                    System.out.println("Digite a quantidade do produto em estoque:");
                    int quantidade = scan.nextInt();
                    scan.nextLine();

                    produto.criarProduto(produto,id , nome, preco, quantidade);
                break;
                case 2:
                    System.out.println("Listando produto...");
                    produto.exibirListaProduto();
                break;
                case 3:
                    System.out.println("Editando produto...");
                    System.out.println("Digite o id do produto:");
                    id = scan.nextLong();
                    scan.nextLine();

                    System.out.println("Digite o nome do produto:");
                    nome = scan.nextLine();

                    System.out.println("Digite o preço do produto:");
                    preco = scan.nextDouble();
                    scan.nextLine();

                    System.out.println("Digite a quantidade do produto em estoque:");
                    quantidade = scan.nextInt();
                    scan.nextLine();

                    produto.editarProduto(id, nome, preco, quantidade);
                    break;
                case 4:
                    System.out.println("Removendo produto...");
                    System.out.println("Digite o id do produto:");
                    id = scan.nextLong();


                    produto.removerLista(id);
                    break;
                case 5:
                    System.out.println("Obrigado por utilizar o programa!");
                    verificacao = false;
                break;
                default:
                    System.out.println("\nOpção inválida\n");
                break;
            }
        }
    }
}
