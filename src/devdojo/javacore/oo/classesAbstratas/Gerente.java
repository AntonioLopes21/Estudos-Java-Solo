package devdojo.javacore.oo.classesAbstratas;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

//    @Override
//    public void imprime() {
//    }

    @Override
    public String calcularBonus() {
        double salarioBonus = salario * .10;
        salario = salarioBonus + salario;

        return String.format("salário com bônus: %.2f", salario);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "salario=" + salario +
                ", nome='" + nome + '\'' +
                '}';
    }
}
