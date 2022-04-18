package Teams.d08_04;

import java.util.Scanner;

public class Exercicio_77 {
    public static void main(String[] args) {
        /* 77) Faça um programa que receba dez números e
        armazene em uma lista. Em seguida solicite um outro
        número e armazene em uma variável chamada multiplicador.
        Percorra todo a lista e multiplique cada número pelo
        multiplicador e apresente em tela. */

        Scanner leitor = new Scanner(System.in);
        int[] listaNumeros = new int[10];

        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.printf("Informe um número: ");
            listaNumeros[i] = leitor.nextInt();
        }

        int multiplicador;
        System.out.printf("Informe outro número para agir como multiplicador: ");
        multiplicador = leitor.nextInt();

        leitor.close();

        for (int i = 0; i < listaNumeros.length; i++) {
            listaNumeros[i] *= multiplicador;
            System.out.println(listaNumeros[i]);
        }
    }
}
