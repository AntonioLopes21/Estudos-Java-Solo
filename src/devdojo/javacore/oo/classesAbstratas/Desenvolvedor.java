package devdojo.javacore.oo.classesAbstratas;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

//    @Override
//    public void imprime() {
//
//    }

    @Override
    public String calcularBonus() {
        double salarioBonus = salario * .10;
        salario = salarioBonus + salario;

        return String.format("salário com bônus: %.2f", salario);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
