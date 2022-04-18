package Teams;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        /*
        * Exercício 18) Faça um programa que receba uma temperatura em
        * Celsius, calcule e mostre essa temperatura em Fahrenheit.
        * Sabe-se que F = C x 1,8 + 32
        */

        // ENTRADA
        System.out.println("Coloque a temperatura em graus Celsius:");
        Scanner leitor = new Scanner(System.in);
        final int temperaturaC = leitor.nextInt();
        leitor.close();

        // PROCESSAMENTO
        final float conversao = ((float)temperaturaC + 32) / 100 * 180;

        // SAÍDA
        System.out.println(String.format("A conversão da temperatura para Fahrenheit é %.1f °F.", conversao));
    }
}
