package Teams;

import java.util.Scanner;

public class Exercicio_80 {
    public static void main(String[] args) {
        /*
        * Exercício 80) Faça um programa que carregue dois vetores de dez
        * elementos numéricos cada um e mostre um vetor resultante
        * da intercalação desses dois vetores.
        */

        Scanner leitor = new Scanner(System.in);
        int[] listaNumeros1 = new int[10];
        int[] listaNumeros2 = new int[10];
        int[] vetorResultante = new int[20];
        int contador1 = 0;
        int contador2 = 0;

        for (int i = 0; i < listaNumeros1.length; i++) {
            System.out.printf("Informe um número: ");
            listaNumeros1[i] = leitor.nextInt();
        }

        for (int i = 0; i < listaNumeros2.length; i++) {
            System.out.printf("Informe outro número: ");
            listaNumeros2[i] = leitor.nextInt();
        }

        for (int i = 0; i < 10; i++) {

            vetorResultante[contador1] = listaNumeros1[contador2];
            System.out.printf("%d - ", vetorResultante[contador1]);
            contador1++;

            vetorResultante[contador1] = listaNumeros2[contador2];
            System.out.printf("%d%n", vetorResultante[contador1]);
            contador1++;
            contador2++;
        }

        leitor.close();
    }
}
