package LogicaDeProgramacao.desafiosChatGPT.desafio2.main;

import LogicaDeProgramacao.desafiosChatGPT.desafio2.model.Biblioteca;
import LogicaDeProgramacao.desafiosChatGPT.desafio2.model.Livro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws ParseException {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        List<Livro> livrosCriados = new ArrayList<>();

        while(loop) {
            System.out.println("Bem vindo a biblioteca! o que deseja fazer:\n1 - Adicionar Livro no estoque\n2 - remover Livro do estoque\n3 - Listar livros no estoque\n4 - Editar livro\n 5 - Criar livro\n6 - sair do programa");
            int decisao = scan.nextInt();
            scan.nextLine();

            switch(decisao) {
                case 1:
                    System.out.println("Adicionando livro no estoque:");
                    System.out.println("Digite o id do livro:");
                    int id = scan.nextInt();
                    scan.nextLine();

                    biblioteca.adicionarLivroNaLista(id, livrosCriados);
                break;

                case 2:
                    System.out.println("Removendo livro do estoque:");
                    System.out.println("Digite o id do livro:");
                    id = scan.nextInt();
                    scan.nextLine();

                    biblioteca.removerLivroDoEstoque(id, livrosCriados);
                break;

                case 3:
                    System.out.println("Listar livros no estoque:");
                    biblioteca.listarLivros(livrosCriados);
                break;

                case 4:
                    System.out.println("Editando livro:");
                    System.out.println("Digite o id do livro:");
                    id = scan.nextInt();
                    scan.nextLine();

                    System.out.println("Digite o nome do livro:");
                    String nomeEdit = scan.nextLine();

                    System.out.println("Digite o nome do autor:");
                    String nomeAutorEdit = scan.nextLine();

                    System.out.print("Digite a data de lançamento (dd/MM/yyyy): ");
                    String dataTextoEdit = scan.nextLine();

                    SimpleDateFormat formatoEdit = new SimpleDateFormat("dd/MM/yyyy");
                    Date dataConvertidaEdit = formatoEdit.parse(dataTextoEdit);

                    biblioteca.editarLivroEmEstoque(id, nomeEdit, nomeAutorEdit, dataConvertidaEdit);

                break;

                case 5:
                    Livro livro = new Livro();
                    System.out.println("Criando livro:");
                    System.out.println("Digite o id do livro:");
                    id = scan.nextInt();
                    scan.nextLine();

                    System.out.println("Digite o nome do livro:");
                    String nome = scan.nextLine();

                    System.out.println("Digite o nome do autor:");
                    String nomeAutor = scan.nextLine();

                    System.out.print("Digite a data de lançamento (dd/MM/yyyy): ");
                    String dataTexto = scan.nextLine();

                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    Date dataConvertida = formato.parse(dataTexto);

                    livro.setNome(nome);
                    livro.setNomeAutor(nomeAutor);
                    livro.setDataLancamento(dataConvertida);
                    livrosCriados.add(livro);
                break;

                case 6:
                    System.out.println("Obrigado por utilizar nossos serviços!");
                    loop = false;
                break;

                default:
                    System.out.println("Opção inválida! Escolha de 1 a 6");
                break;
            }
        }
        scan.close();
    }
}
