package devdojo.javacore.oo.modificadoresestaticos;

public class Carro {
    private String modelo;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 200;

//    {
//        if(velocidadeMaxima > velocidadeLimite) {
//            System.out.println("A velocidade máxima não pode ser maior que a velocidade limite.");
//            velocidadeMaxima = velocidadeLimite;
//        }
//    }

    public Carro(String modelo, double velocidadeMaxima) {
        this.modelo = modelo;
        setVelocidadeMaxima(velocidadeMaxima);
    }

    public void imprimeInformacoes() {
        System.out.println("--------------------------");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite: " + Carro.velocidadeLimite);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        if(velocidadeMaxima > velocidadeLimite) {
            System.out.println("A velocidade máxima não pode ser maior que a velocidade limite.");
            this.velocidadeMaxima = velocidadeLimite;
        } else {
            this.velocidadeMaxima = velocidadeMaxima;
        }
    }

    //method static
    public static double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }

    //method static
    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }
}
