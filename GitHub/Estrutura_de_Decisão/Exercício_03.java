package exercícios.GitHub.Estrutura_de_Decisão;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        System.out.println("Digite um número:");
        Scanner leitor = new Scanner(System.in);
        final float numero1 = leitor.nextFloat();

        System.out.println("Digite outro número:");
        final float numero2 = leitor.nextFloat();

        System.out.println("Digite outro número:");
        final float numero3 = leitor.nextFloat();

        leitor.close();

        double posicao1 = 0, posicao2 = 0, posicao3 = 0;

        if (numero1 > numero2 & numero1 > numero3) {
            posicao1 = numero1;
        } else if (numero2 > numero1 & numero2 > numero3) {
            posicao1 = numero2;
        } else if (numero3 > numero1 & numero3 > numero2) {
            posicao1 = numero3;
        }
        
        if (posicao1 == numero1) {
            posicao2 = Math.max(numero2, numero3);
            posicao3 = Math.min(numero2, numero3);
        } else if (posicao1 == numero2) {
            posicao2 = Math.max(numero1, numero3);
            posicao3 = Math.min(numero1, numero3);
        } else if (posicao1 == numero3) {
            posicao2 = Math.max(numero1, numero2);
            posicao3 = Math.min(numero1, numero2);
        }

        System.out.printf("%.0f - %.0f - %.0f", posicao3, posicao2, posicao1);

    }
}
