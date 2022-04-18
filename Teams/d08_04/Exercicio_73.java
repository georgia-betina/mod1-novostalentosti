package teams.d08_04;

import java.util.Scanner;

public class Exercicio_73 {
    public static void main(String[] args) {
        /* 73) Faça um programa que receba dez números e armazene
        em uma lista. Em seguida conte quantos números são impar e
        quantos são par. Apresente os contadores na tela. */

        Scanner leitor = new Scanner(System.in);
        int[] listaNumeros = new int[10];

        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.printf("Informe um número: ");
            listaNumeros[i] = leitor.nextInt();
        }
        leitor.close();

        int contaPares = 0;
        int contaImpares = 0;

        for (int i = 0; i < listaNumeros.length; i++) {
            if (listaNumeros[i] % 2 == 0) {
                contaPares++;
            } else if (listaNumeros[i] % 2 != 0) {
                contaImpares++;
            }
        }

        System.out.printf("A quantidade de números pares digitados é %d e a quantidade de números ímpares digitados é %d.", contaPares, contaImpares);
    }
}
