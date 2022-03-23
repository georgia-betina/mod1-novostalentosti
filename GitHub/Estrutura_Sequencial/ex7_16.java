package GitHub.Estrutura_Sequencial;

import java.util.Scanner;

public class ex7_16 {
    public static void main(String[] args) {
        System.out.println("Coloque a temperatura em graus Celsius:");
        Scanner leitor = new Scanner(System.in);
        final int temperaturaC = leitor.nextInt();
        leitor.close();

        final float conversao = (9 * temperaturaC + 160) / 5;

        System.out.println(String.format("A conversão da temperatura para Fahrenheit é %.0f.", conversao));
    }
}
