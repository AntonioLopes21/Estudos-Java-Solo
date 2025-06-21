package devdojo.javacore.oo.pooexercicio01;

import devdojo.javacore.oo.pooexercicio01.model.Funcionario;
//import dos métodos estáticos - não precisa instanciar a classe
import static devdojo.javacore.oo.pooexercicio01.model.ManipulacaoFuncionario.imprimirDadosFuncionario;
import static devdojo.javacore.oo.pooexercicio01.model.ManipulacaoFuncionario.tirarMediaSalarios;

public class main {
    //crie uma classe funcionário com nome, idade, salario

    //1, imprimir dados
    //2. tirar a média dos salarios

    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Carlos", 21, 1500.10);
        Funcionario func2 = new Funcionario("Luis", 36, 15000.00);
        Funcionario func3 = new Funcionario("André", 29, 6090.00);


        imprimirDadosFuncionario(func1);
        System.out.println("---------------------------\n");
        imprimirDadosFuncionario(func2);

        System.out.println("---------------------------\n");
        System.out.println(tirarMediaSalarios(func1.getSalario(), func2.getSalario(), func3.getSalario()));

    }
}
