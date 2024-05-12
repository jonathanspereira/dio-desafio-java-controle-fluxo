import java.util.Scanner;

public class Contador {
    public static void main (String[] args){

        Scanner terminal = new Scanner(System.in);

        System.out.println("\n- Digite o primeiro parâmetro: ");
          int parametroUm = terminal.nextInt();
        System.out.println("- Digite o segundo parâmetro: ");
          int parametroDois = terminal.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
            System.out.println("\nContagem Finalizado!");

        }catch (ParametrosInvalidosException exception) {
            //lançando exceção
            System.out.println("\n##ERRO: O segundo parâmetro deve ser maior que o primeiro!\n");
        }

        terminal.close();
    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("##ERRO: O segundo tem que ser maior que o promeiro!");
        } else {
            int contagem = parametroDois - parametroUm;

            System.out.println("\nImprimindo contagem...");

            //realizar o for para imprimir os números com base na variável contagem
            for(int i = 0; i <= contagem; i++) {
            
                System.out.println("- número: " + i);
            }

        }

    }

}
