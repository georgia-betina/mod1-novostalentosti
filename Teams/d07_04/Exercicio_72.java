package Teams.d07_04;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio_72 {
    public static void main(String[] args) {
        /* 72) Faça um programa que receba dez números
        e armazene em uma lista. Em seguida percorra
        toda a lista mostrando apenas os números que
        cujo valor seja superior a 10. */

        Scanner leitor = new Scanner(System.in);
        int[] listaNumeros = new int[10];

        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.printf("Informe 10 números: ");
            listaNumeros[i] = leitor.nextInt();
            for (int j = 0; j < listaNumeros.length; j++) { // filtro
                if (listaNumeros[i] > 10) {
                    System.out.println(listaNumeros[i]);
                }
            }
        }
        leitor.close();
    }
}
