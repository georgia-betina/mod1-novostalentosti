package Teams;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        /*
        * Exercício 15) Faça um programa que calcule e mostre
        * a área de um losango. Sabe-se que: A = (diagonal
        * maior * diagonal menor) / 2
        */

        // ENTRADAS
        System.out.println("Informe o valor da diagonal maior:");
        Scanner leitor = new Scanner(System.in);
        final float diagonalmaior = leitor.nextFloat();

        System.out.println("Informe o valor da diagonal menor:");
        final float diagonalmenor = leitor.nextFloat();

        leitor.close();

        // PROCESSAMENTO
        final double calculoarea = (diagonalmaior * diagonalmenor)/2;

        // SAÍDA
        System.out.println(String.format("O valor da área é %.0f.", calculoarea));
    }
}
