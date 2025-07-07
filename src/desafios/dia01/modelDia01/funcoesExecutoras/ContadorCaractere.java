package desafios.dia01.modelDia01.funcoesExecutoras;

public class ContadorCaractere {

    public static void contarCaracteres(String mensagem) {
        String novaMensagem = mensagem.replaceAll(" ", "");
        int i;

        for(i = 0; i < novaMensagem.length(); i ++) {
            //System.out.println(i);
        }

        System.out.println("No texto existem:" + i + " caracteres!");
    }
}
