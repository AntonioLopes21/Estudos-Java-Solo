package devdojo.javacore.oo.polimorfismo.servico;

import devdojo.javacore.oo.polimorfismo.repository.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um Banco de dados...");
    }
}
