package Teams.d08_04;

import java.util.Scanner;

public class Exercicio_75 {
    public static void main(String[] args) {
        /* 75) Faça um programa que receba dez números e armazene em uma
        lista. Em seguida calcule a soma de todos os números percorrendo
        novamente a lista. Apresente a soma e em seguida a média baseada
        na soma e no número de números armazenados. */

        Scanner leitor = new Scanner(System.in);
        int[] listaNumeros = new int[10];
        int somaNumeros = 0;
        int contador = 0;

        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.printf("Informe um número: ");
            listaNumeros[i] = leitor.nextInt();
            contador++;
        }

        leitor.close();

        for (int i = 0; i < listaNumeros.length; i++) {
            somaNumeros += listaNumeros[i];
        }

        final float media = (float)somaNumeros / (float)contador;

        System.out.printf("A soma é %d%nA média é %.1f", somaNumeros, media);

    }
}
