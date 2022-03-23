package GitHub.Estrutura_Sequencial;

import java.util.Scanner;

public class ex8_16 {
    public static void main(String[] args) {
        System.out.println("Por favor, insira o tempo gasto na viagem em horas:");
        Scanner leitor = new Scanner(System.in);
        final float horaviagem = leitor.nextFloat();

        System.out.println("Agora, insira a velocidade média durante a viagem de acordo com o SI:");
        Scanner leitor1 = new Scanner(System.in);
        final float velocidademedia = leitor1.nextFloat();

        leitor.close();
        leitor1.close();

        final double distancia = (double)horaviagem * (double)velocidademedia;

        final double qtdedeL = distancia / 12.0d;

        System.out.println(String.format("A quantidade de litros utilizada na viagem foi de %.0fL.", qtdedeL));
    }
}
