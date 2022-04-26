package GitHub.Estrutura_de_Repetição;

import java.util.Scanner;

public class Exercicio_14 {
    public static void main(String[] args) {
        /*
        * Exercício 14) Escreva um programa que determine o fatorial de um número. Para este
        * problema, tem-se como entrada o valor do número do qual se deseja calcular o fatorial.
        * O fatorial de 0 é igual a 1. O fatorial de um número N(N!) é definido conforme a seguir:
        *
        * N! = 1 × 2 × 3 × 4 × ... × (N - 1) × N
        */

        Scanner leitor = new Scanner(System.in);
        System.out.printf("Informe um número para calcular o fatorial: ");
        int entradaNumero = leitor.nextInt();

        leitor.close();

        float fatorial = 1;
        float contador = 1;

        if (entradaNumero == 0) {
            System.out.printf("O fatorial é igual a 1.");
        } else if (entradaNumero != 0) {
            for (int i = 0; i < entradaNumero; i++) {
                fatorial *= contador;
                contador++;
            }
        }

        System.out.printf("O fatorial de %d é %.0f.", entradaNumero, fatorial);
    }
}
