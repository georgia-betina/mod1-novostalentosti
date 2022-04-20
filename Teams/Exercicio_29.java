package teams;

import java.util.Scanner;

public class Exercicio_29 {
    public static void main(String[] args) {
        /*
        * Exercício 29) Faça um programa que receba um número inteiro
        * e mostre se ele é par ou impar.
        */

        // ENTRADA
        System.out.println("Digite um número");
        Scanner leitor = new Scanner(System.in);
        final float numero = leitor.nextFloat();
        leitor.close();

        // PROCESSAMENTO
        if (numero%2 == 0) {
            // SAÍDA
            System.out.println("Seu número é par!");
        } else {
            // SAÍDA
            System.out.println("Seu número é ímpar!");
        }
    }
}
