package devdojo.javacore.oo.pooexercicio01.model;

public class ManipulacaoFuncionario {
    public static void imprimirDadosFuncionario(Funcionario funcionario) {
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Idade: " + funcionario.getIdade() +"\n");
        System.out.printf("Salário: R$ %.2f", funcionario.getSalario());
    }

    public static String tirarMediaSalarios(double ... salarios) {
        double media = 0;
        double soma = 0;
        double quantidadeSalarios = 0;

        for(double salarioDeCada : salarios) {
            soma += salarioDeCada;
            quantidadeSalarios = salarios.length;
            media = soma / quantidadeSalarios;
        }

        return String.format("Média dos salários: %.2f", media);
    }
}
