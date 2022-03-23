package exercícios.Teams.d17_03;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        System.out.println("Informe o valor da base maior do trapézio:");
        Scanner leitor = new Scanner(System.in);
        final float basemaior = leitor.nextFloat();

        System.out.println("Informe o valor da base menor do trapézio:");
        Scanner leitor1 = new Scanner(System.in);
        final float basemenor = leitor1.nextFloat();

        System.out.println("Informe o valor da altura do trapézio:");
        Scanner leitor2 = new Scanner(System.in);
        final float altura = leitor2.nextFloat();

        leitor.close();
        leitor1.close();
        leitor2.close();

        final double calculoarea = ((basemaior + basemenor) * altura) / 2;

        System.out.println(String.format("O valor da área do trapézio é %.0f.", calculoarea));
    }
}
