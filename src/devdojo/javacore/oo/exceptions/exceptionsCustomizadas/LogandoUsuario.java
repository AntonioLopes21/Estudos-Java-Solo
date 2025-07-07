package devdojo.javacore.oo.exceptions.exceptionsCustomizadas;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LogandoUsuario {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException("Usuário ou senha inválidos");
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner scan = new Scanner(System.in);
        String usernameDB = "Paulin";
        String passwordDB = "paulin123";

        System.out.println("Digite o nome do usuário:");
        String nomeDigitado = scan.nextLine();

        System.out.println("Digite a senha:");
        String senhaDigitada = scan.nextLine();

        if(!nomeDigitado.equals(usernameDB) || !senhaDigitada.equals(passwordDB)) {
            throw new LoginInvalidoException("Usuário ou senha inválidos.");
        }

        System.out.println("Usuário logado com sucesso!");

        scan.close();
    }
}
