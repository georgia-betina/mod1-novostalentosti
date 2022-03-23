package exercícios.GitHub.Estrutura_Sequencial;

import java.util.Scanner;

public class ex10_16 {
    public static void main(String[] args) {
        System.out.println("Forneça o comprimento do objeto:");
        Scanner leitor = new Scanner(System.in);
        final float comprimento = leitor.nextFloat();

        System.out.println("Forneça a largura do objeto:");
        Scanner leitor1 = new Scanner(System.in);
        final float largura = leitor1.nextFloat();

        System.out.println("Forneça a altura do objeto:");
        Scanner leitor2 = new Scanner(System.in);
        final float altura = leitor2.nextFloat();

        leitor.close();
        leitor1.close();
        leitor2.close();

        final double volume = comprimento * largura * altura;

        System.out.println(String.format("O volume da caixa é %.0f.", volume));
    }
}
