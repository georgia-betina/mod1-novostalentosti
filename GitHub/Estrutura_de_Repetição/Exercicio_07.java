package GitHub.Estrutura_de_Repetição;

import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {
        /*
        * Exercício 07) Número primo é aquele que só é divisível por ele mesmo
        * e pelo número 1. Faça um programa que determine e escreva os números
        * primos compreendidos entre um intervalo fornecido pelo usuário.
        */

        Scanner leitor = new Scanner(System.in);
        System.out.printf("Definida um intervalo. Decida o primeiro número: ");
        final int intervalo1 = leitor.nextInt();

        System.out.printf("Decida o segundo número: ");
        final int intervalo2 = leitor.nextInt();

        leitor.close();

        // ver qual entrada é maior e menor

        int intervaloReal = intervalo2 - intervalo1;
        intervaloReal = Math.abs(intervaloReal);

        for (int i = 0; i < intervaloReal; i++) {
            if () {
                
            }
        }

        System.out.println(intervaloReal);
    }
}
