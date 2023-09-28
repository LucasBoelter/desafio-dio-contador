import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {

		Scanner terminal = new Scanner(System.in);

		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();

		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}

		terminal.close();
	}

    /**
     * <b>Valida se parametroUm é MAIOR que parametroDois</b>
     * <p>
     * - Lançar a exceção caso seja maior.
     * <p>
     * <b>Não sendo o caso:</b>
     * <p>
     * - Subtrai parametroDois do parametroUm e realiza a contagem de 1 até o resultado;
     * <p>
     * - Realiza a contagem do parametroUm até o paramentroDois.
     */
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm>parametroDois)
            throw new ParametrosInvalidosException();
        
        else{
            int contagem = parametroDois - parametroUm;

            System.out.println(parametroDois+" - "+parametroUm+" = "+contagem);

            //realizar o for para imprimir os números com base na variável contagem
            for (int contador=1; contador<=contagem; contador++){
                System.out.println("Imprimindo "+contador);
            }

            // outra possibilidade de demonstração do uso do for
            System.out.println("-------------------------------------------------------");
            System.out.println("Imprimindo números de "+parametroUm+" a "+parametroDois);
            for (int contador = parametroUm; contador<=parametroDois; contador++){
                System.out.println(contador);
            }
        }
		
	}
}