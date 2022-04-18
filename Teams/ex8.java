package Teams.d17_03;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        System.out.println("Informe o valor da diagonal maior:");
        Scanner leitor = new Scanner(System.in);
        final float diagonalmaior = leitor.nextFloat();

        System.out.println("Informe o valor da diagonal menor:");
        Scanner leitor1 = new Scanner(System.in);
        final float diagonalmenor = leitor1.nextFloat();

        leitor.close();
        leitor1.close();

        final double calculoarea = (diagonalmaior * diagonalmenor)/2;

        System.out.println(String.format("O valor da área é %.0f.", calculoarea));
    }
}
