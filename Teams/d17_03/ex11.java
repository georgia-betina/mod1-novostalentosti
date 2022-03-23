package exercícios.Teams.d17_03;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        // import
        System.out.println("Coloque a temperatura em graus Celsius:");
        Scanner leitor = new Scanner(System.in);
        final int temperaturaC = leitor.nextInt();
        leitor.close();

        final float conversao = ((float)temperaturaC + 32) / 100 * 180;

        System.out.println(String.format("A conversão da temperatura para Fahrenheit é %.1f °F.", conversao));
    }
}
