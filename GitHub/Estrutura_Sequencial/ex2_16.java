package exercícios.GitHub.Estrutura_Sequencial;

import java.util.Scanner;

public class ex2_16 {
    public static void main(String[] args) {
        System.out.println("Olá, querido usuário. Por favor, informe a nota do primeiro bimestre:");
        Scanner leitor = new Scanner(System.in);
        final float notabim1 = leitor.nextFloat();
        leitor.close();

        System.out.println("Agora, informe a nota do segundo bimestre:");
        Scanner leitor1 = new Scanner(System.in);
        final float notabim2 = leitor1.nextFloat();
        leitor1.close();

        System.out.println("Agora, informe a nota do terceiro bimestre:");
        Scanner leitor2 = new Scanner(System.in);
        final float notabim3 = leitor2.nextFloat();
        leitor2.close();

        System.out.println("Agora, informe a nota do quarto e último bimestre:");
        Scanner leitor3 = new Scanner(System.in);
        final float notabim4 = leitor3.nextFloat();
        leitor3.close();

        final float media = (notabim1 + notabim2 + notabim3 + notabim4) / 4.0f;

        System.out.println(String.format("A sua média final é %.1f.", media));
    }
}
