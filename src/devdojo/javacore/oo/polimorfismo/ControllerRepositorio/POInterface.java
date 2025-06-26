package devdojo.javacore.oo.polimorfismo.ControllerRepositorio;

import devdojo.javacore.oo.polimorfismo.repository.Repositorio;
import devdojo.javacore.oo.polimorfismo.servico.RepositorioArquivo;
import devdojo.javacore.oo.polimorfismo.servico.RepositorioBancoDeDados;
import devdojo.javacore.oo.polimorfismo.servico.RepositorioMemoria;

public class POInterface {
    public static void main(String[] args) {
//        RepositorioBancoDeDados repositorioBancoDeDados = new RepositorioBancoDeDados();
//        repositorioBancoDeDados.salvar();
//
//        RepositorioArquivo repositorioArquivo = new RepositorioArquivo();
        Repositorio repositoriobd = new RepositorioBancoDeDados();
        Repositorio repositorioMemoria = new RepositorioMemoria();
        Repositorio repositorioArquivo = new RepositorioArquivo();



    }
}
