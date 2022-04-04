package Teams.d04_04;

import java.util.Scanner;

public class Exercicio_66 {
    public static void main(String[] args) {
        /*
         * 66) Faça um algoritmo que calcule a soma de
         * todos os números ímpares dentro de uma faixa de
         * valores determinada pelo usuário. Um número é ímpar
         * quando sua divisão por 2 não é exata, ou seja, o resto
         * resultante da divisão inteira pelo número 2 tem valor 1.
         * Utilize a palavra resto como operador que calcula o resto
         * da divisão de um numero por outro.
         */

        int faixaInicial = 0;
        int faixaFinal = 0;
        int numero1 = 0;
        int numero2 = 0;
        int somaImpar = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.printf("Informe um valor inteiro: ");
        numero1 = leitor.nextInt();

        System.out.printf("Informe outro valor inteiro: ");
        numero2 = leitor.nextInt();

        leitor.close();

        faixaInicial = Math.min(numero1, numero2);
        faixaFinal = Math.max(numero1, numero2);

        int valorVariado = faixaInicial;

        while (valorVariado < (faixaFinal - 1)) {
            valorVariado++;
            if (valorVariado % 2 != 0) {
                somaImpar += valorVariado;
            }
        }
        System.out.printf("A soma dos números ímpares entre as faixas %d e %d é %d.", faixaInicial, faixaFinal, somaImpar);
    }
}
