package devdojo.javacore.oo.modificadoresestaticos;

public class Main {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(500);

        Carro c1 = new Carro("Mustang", 250);
        Carro c2 = new Carro("Saveiro", 200);
        Carro c3 = new Carro("Celta", 300);

        c1.imprimeInformacoes();
        c2.imprimeInformacoes();
        c3.imprimeInformacoes();
    }
}
