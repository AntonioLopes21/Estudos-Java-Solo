package devdojo.javacore.oo.heranca;

public class Funcionario extends Pessoa{

    private double salario;

    public Funcionario(String nome, String cep, Endereco endereco, double salario) {
        super(nome, cep, endereco);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
