package teams;

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
        int numero1 = 0; // entrada 1
        int numero2 = 0; // entrada 2
        int somaImpar = 0;
        int transformaAbsoluto = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.printf("Informe um valor inteiro: ");
        numero1 = leitor.nextInt();

        System.out.printf("Informe outro valor inteiro: ");
        numero2 = leitor.nextInt();

        leitor.close();

        faixaInicial = Math.min(numero1, numero2); // calcula qual numero é o menor p atribuir como faixaInicial
        faixaFinal = Math.max(numero1, numero2); // calcula qual numero é o maior p atribuir como faixaFinal

        int contador = faixaInicial; // variavel que é utilizada como contador

        while (contador < (faixaFinal - 1)) { // - 1 porque caso contrário, considerará a faixaInicial na conta
            contador++;
            if (contador % 2 != 0) {
                transformaAbsoluto = Math.abs(contador);
                somaImpar += transformaAbsoluto;
            }
        }
        System.out.printf("A soma dos números ímpares entre as faixas %d e %d é %d.", faixaInicial, faixaFinal, somaImpar);
    }
}
