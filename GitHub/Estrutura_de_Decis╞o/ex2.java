package exercícios.GitHub.Estrutura_de_Decisão;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        System.out.println("Digite um número:");
        Scanner leitor = new Scanner(System.in);
        final float numero1 = leitor.nextFloat();

        System.out.println("Digite outro número:");
        Scanner leitor1 = new Scanner(System.in);
        final float numero2 = leitor1.nextFloat();

        System.out.println("Digite outro número:");
        Scanner leitor2 = new Scanner(System.in);
        final float numero3 = leitor2.nextFloat();

        leitor.close();
        leitor1.close();
        leitor2.close();

        final double compara1 = Math.max(numero1, numero2);
        final double compara2 = Math.max(compara1, numero3);

        System.out.println(String.format("O maior número é %.0f.", compara2));
    }
}
