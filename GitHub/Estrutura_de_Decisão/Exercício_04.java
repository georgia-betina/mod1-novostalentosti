package exercícios.GitHub.Estrutura_de_Decisão;

import java.util.Scanner;

public class Exercício_04 {
    public static void main(String[] args) {
        System.out.println("Informe a quantidade de maçãs compradas:");
        Scanner leitor = new Scanner(System.in);
        final int quantidadeComprada = leitor.nextInt();
        leitor.close();

        double custo = 0;
        final float valor1 = 1.3f;
        final int valor2 = 1;

        if (quantidadeComprada < 12) {
            custo = quantidadeComprada * valor1;
        } else if (quantidadeComprada >= 12) {
            custo = quantidadeComprada * (float)valor2;
        }

        System.out.printf("O custo total da compra é R$ %.2f", custo);
    }
}
