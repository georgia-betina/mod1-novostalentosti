package Teams;

import java.util.Scanner;

public class Exercicio_01_treino {
    public static void main(String[] args) {
        /*
        * Exercício 08) Faça um programa que receba um número real, encontre
        * e mostre:
        * - a parte inteira desse número; 2 (arredondamento, conversão de
        * float pra int);
        * - a parte fracionária desse número; 0.5 (o numero original e
        * subtrair a parte inteira);
        * - o arredondamento desse número; 3 (fazer o arredondamento).
        */
        System.out.println("Acrescente um numero real:");
        Scanner leitor = new Scanner(System.in);
        float numeroreal = leitor.nextFloat();
        leitor.close();

        int numerointeiro = (int)numeroreal;

        float parteinteira = numeroreal - numerointeiro;

        float arredondamento = Math.round(numeroreal);

        System.out.println(String.format("O número inteiro é: %d%nA parte fracionária é: %.2f%nO arredondamento é: %.0f", numerointeiro, parteinteira, arredondamento));
    }
}
