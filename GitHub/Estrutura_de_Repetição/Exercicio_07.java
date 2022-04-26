package GitHub.Estrutura_de_Repetição;

import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {
        /*
        * Exercício 07) Número primo é aquele que só é divisível por ele mesmo
        * e pelo número 1. Faça um programa que determine e escreva os números
        * primos compreendidos entre um intervalo fornecido pelo usuário.
        */

        int menorValor = 0;
        int maiorValor = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.printf("Definida um intervalo. Decida o primeiro número: ");
        final int intervalo1 = leitor.nextInt();

        System.out.printf("Decida o segundo número: ");
        final int intervalo2 = leitor.nextInt();

        leitor.close();

        maiorValor = Math.max(intervalo1, intervalo2);
        menorValor = Math.min(intervalo1, intervalo2);

        int intervaloReal = (maiorValor - menorValor);
        intervaloReal = Math.abs(intervaloReal);
        int contaDivisao = 0;
        int contaValor = menorValor;


        for (int i = 0; i <= intervaloReal; i++) { // vai repetir a quantidade de x do intervalo entre os números
            for (int j = 1; j <= contaValor; j++) { // conta de 1 até o número
                if (contaValor % j == 0) {
                    contaDivisao++;
                }
            }
            if (contaDivisao == 2) {
                System.out.println(contaValor);
                contaValor++;
                contaDivisao = 0;
            } else {
                contaValor++;
                contaDivisao = 0;
            }
        }

        System.out.println(intervaloReal);
    }
}
