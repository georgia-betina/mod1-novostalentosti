package exercícios.GitHub.Estrutura_de_Decisão;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        System.out.println("Digite um número:");
        Scanner leitor = new Scanner(System.in);
        final float numero1 = leitor.nextFloat();

        System.out.println("Digite outro número:");
        Scanner leitor1 = new Scanner(System.in);
        final float numero2 = leitor1.nextFloat();

        leitor.close();
        leitor1.close();

        final double compara = Math.max(numero1, numero2);

        System.out.println(String.format("O maior número é %.0f.", compara));
    }
}
