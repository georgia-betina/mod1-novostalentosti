package teams.d08_04;

import java.util.Scanner;

public class Exercicio_74 {
    public static void main(String[] args) {
        /* 74) Faça um programa que receba dez números e armazene
        em uma lista. Em seguida, substitua todos os números cujo
        valor seja menor que 10 pelo valor ZERO. Imprima a lista
        em tela. */

        Scanner leitor = new Scanner(System.in);
        int[] listaNumeros = new int[10];

        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.printf("Informe um número: ");
            listaNumeros[i] = leitor.nextInt();
        }

        leitor.close();

        for (int i = 0; i < listaNumeros.length; i++) {
            if (listaNumeros[i] < 10) {
                listaNumeros[i] = 0;
            }
            System.out.println(listaNumeros[i]);
        }
    }
}
