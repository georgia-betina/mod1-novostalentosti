package teams;

import java.util.Scanner;

public class Exercicio_76 {
    public static void main(String[] args) {
        /* 76) Faça um programa que receba dez números e armazene
        em uma lista. Em seguida percorra toda a lista e procure
        qual o MAIOR valor dentro da lista e qual o MENOR valor
        dentro da lista. No final apresente o MAIOR e o MENOR valor. */

        Scanner leitor = new Scanner(System.in);
        int[] listaNumeros = new int[10];
        int contador = 0;
        int maiorNumero = 0;
        int menorNumero = 0;

        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.printf("Informe um número: ");
            listaNumeros[i] = leitor.nextInt();
            if (contador == 0) {
                maiorNumero = listaNumeros[i];
                menorNumero = listaNumeros[i];
                contador++;
            } else if (contador != 0) {
                maiorNumero = Math.max(maiorNumero, listaNumeros[i]);
                menorNumero = Math.min(menorNumero, listaNumeros[i]);
            }
        }
        leitor.close();

        System.out.printf("O menor valor digitado foi %d e o maior valor digitado foi %d", menorNumero, maiorNumero);
    }
}
