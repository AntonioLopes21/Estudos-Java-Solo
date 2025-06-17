package LogicaDeProgramacao.desafioLista3Repeticao;

public class ContadorProgressivoERegressivoClean {
    public static void main(String[] args) {
        boolean loop = true;

        while (loop) {

            for(int i = 0; i <= 100; i ++) {
                if(!loop) {
                    break;
                }

                System.out.println(i);

                if(i == 100) {
                    for(i = 100; i >= 0; i --) {
                        System.out.println(i);

                        if(i == 0) {
                            loop = false;
                        }
                    }
                }
            }
        }

        }

}
