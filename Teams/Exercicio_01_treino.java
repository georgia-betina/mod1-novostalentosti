package Teams.d17_03;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        System.out.println("Acrescente um numero real:");
        Scanner leitor = new Scanner(System.in);
        float numeroreal = leitor.nextFloat();
        leitor.close();

        // Faça um programa que receba um número real, encontre e mostre:

        // a parte inteira desse número;
        int numerointeiro = (int)numeroreal;

        float parteinteira = numeroreal - numerointeiro;

        float arredondamento = Math.round(numeroreal);

        System.out.println(String.format("O número inteiro é: %d%nA parte fracionária é: %.2f%nO arredondamento é: %.0f", numerointeiro, parteinteira, arredondamento));
    }
}
