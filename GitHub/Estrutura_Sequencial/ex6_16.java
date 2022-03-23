package exercícios.GitHub.Estrutura_Sequencial;

import java.util.Scanner;

public class ex6_16 {
    public static void main(String[] args) {
        System.out.println("Digite um número qualquer:");
        Scanner leitor = new Scanner(System.in);
        final float numero1 = leitor.nextFloat();

        System.out.println("Digite um segundo número qualquer:");
        Scanner leitor1 = new Scanner(System.in);
        final float numero2 = leitor1.nextFloat();

        final float soma = numero1 + numero2;

        leitor.close();
        leitor1.close();

        System.out.println(String.format("O valor da adição dos valores é %.1f.", soma));
    }
}
