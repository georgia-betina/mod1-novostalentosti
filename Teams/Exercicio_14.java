package Teams;

import java.util.Scanner;

public class Exercicio_14 {
    public static void main(String[] args) {
        /*
        * Exercício 14) Faça um programa que calcule e mostre
        * a área de um quadrado. Sabe-se que: A= lado * lado
        */

        // ENTRADA
        System.out.println("Informe o valor do lado do quadrado:");
        Scanner leitor = new Scanner(System.in);
        final float lado = leitor.nextFloat();

        leitor.close();

        // PROCESSAMENTO
        final double area = lado * lado;

        // SAÍDA
        System.out.println(String.format("A área do quadrado é %.0f.", area));
    }
}
