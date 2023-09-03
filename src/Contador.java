import java.util.Scanner;

public class Contador {

    public static void main(String[] args){

        try(Scanner terminal = new Scanner(System.in)) {

            System.out.println("Digite o primeiro parâmetro :");
            int parametroUm = terminal.nextInt();

            System.out.println("Digite o segundo parâmetro :");
            int parametroDois = terminal.nextInt();

            validarParametros(parametroUm, parametroDois);
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }
    }

    private static void validarParametros(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior ou igual ao primeiro.");
        }
    }


    public static void contar(int parametroUm, int parametroDois){
        int contagem = parametroDois - parametroUm;

        for (int contagemInicial = 1; contagemInicial <= contagem; contagemInicial++) {
            System.out.println("Imprimindo o número " + contagemInicial);
        }
    }
}

