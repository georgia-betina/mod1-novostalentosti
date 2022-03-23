package exercícios.GitHub.Estrutura_Sequencial;

import java.util.Scanner;

public class ex16_16 {
    public static void main(String[] args) {
        System.out.println("Digite um número:");
        Scanner leitor = new Scanner(System.in);
        final float numero1 = leitor.nextFloat();

        System.out.println("Digite um segundo número:");
        Scanner leitor1 = new Scanner(System.in);
        final float numero2 = leitor1.nextFloat();

        System.out.println("Digite um terceiro número:");
        Scanner leitor2 = new Scanner(System.in);
        final float numero3 = leitor2.nextFloat();

        System.out.println("Digite o quarto e último número:");
        Scanner leitor3 = new Scanner(System.in);
        final float numero4 = leitor3.nextFloat();

        leitor.close();
        leitor1.close();
        leitor2.close();
        leitor3.close();

        final double soma1 = numero1 + numero2, soma2 = numero1 + numero3, soma3 = numero1 + numero4, soma4 = numero2 + numero3, soma5 = numero2 + numero4, soma6 = numero3 + numero4;
        final double mult1 = numero1 * numero2, multi2 = numero1 * numero3, multi3 = numero1 * numero4, multi4 = numero2 * numero3, multi5 = numero2 * numero4, multi6 = numero3 * numero4;

        System.out.println(String.format("SOMAS:%n%.0f + %.0f = %.0f;%n%.0f + %.0f = %.0f;%n%.0f + %.0f = %.0f;%n%.0f + %.0f = %.0f;%n%.0f + %.0f = %.0f;%n%.0f + %.0f = %.0f.%n%nMULTIPLICAÇÕES:%n%.0f * %.0f = %.0f;%n%.0f * %.0f = %.0f;%n%.0f * %.0f = %.0f;%n%.0f * %.0f = %.0f;%n%.0f * %.0f = %.0f;%n%.0f * %.0f = %.0f.", numero1, numero2, soma1, numero1, numero3, soma2, numero1, numero4, soma3, numero2, numero3, soma4, numero2, numero4, soma5, numero3, numero4, soma6, numero1, numero2, mult1, numero1, numero3, multi2, numero1, numero4, multi3, numero2, numero3, multi4, numero2, numero4, multi5, numero3, numero4, multi6));
    }
}
