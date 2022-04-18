package teams;

import java.util.Scanner;

public class Exercicio_39 {
    public static void main(String[] args) {
        System.out.printf("Escreva o primeiro número: ");
        Scanner leitor = new Scanner(System.in);
        final float numero1 = leitor.nextFloat();

        System.out.printf("Escreva o segundo número: ");
        final float numero2 = leitor.nextFloat();

        if (numero1 == numero2) {
            final double media = (numero1 + numero2) / 2;
            System.out.printf("Os números são iguais e a média entre eles é %.0f.", media);
        } else if (numero1 != numero2) {
            final double maiorNumero = Math.max(numero1, numero2);
            final double menorNumero = Math.min(numero1, numero2);

            System.out.printf("Os números são diferentes. %.0f é o maior número e %.0f é o menor.", maiorNumero, menorNumero);
        }
        leitor.close();
    }
}
