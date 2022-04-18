package teams;

import java.util.Scanner;

public class Exercicio_12 {
    public static void main(String[] args) {
        /*
        * Exercício 12) Faça um programa que receba o peso
        * de uma pessoa em quilos, calcule e mostre esse
        * peso em gramas.
        */

        // ENTRADA
        System.out.println("Informe o seu peso em kg:");
        Scanner leitor = new Scanner(System.in);
        final float pesokg = leitor.nextFloat();
        leitor.close();

        // PROCESSAMENTO
        final double pesogramas = pesokg * 1000;

        // SAÍDA
        System.out.println(String.format("Seu peso em gramas é %.0fg.", pesogramas));
    }
}
