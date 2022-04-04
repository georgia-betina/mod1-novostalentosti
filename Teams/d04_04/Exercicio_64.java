package Teams.d04_04;

import java.util.Scanner;

public class Exercicio_64 {
    public static void main(String[] args) {
        /* 64) Faça um algoritmo que calcule a multiplicação
        de dois números inteiros sem utilizar o operador “*”.
        Em vez disso, utilize apenas o operador de adição “+”.
        Para implementar esse algoritmo, devemos lembrar que
        qualquer multiplicação pode ser expressa por meio de
        somas. Por exemplo, o resultado da expressão 6 * 3 é
        o mesmo que 6 + 6 + 6 ou 3 + 3 + 3 + 3 + 3 + 3. Ou
        seja, soma-se um elemento com ele próprio o número
        de vezes do segundo elemento. */

        Scanner leitor = new Scanner(System.in);
        System.out.printf("Digite um número: ");
        final float numero1 = leitor.nextFloat();

        System.out.printf("Digite outro número a ser multiplicado pelo primeiro: ");
        final float numero2 = leitor.nextFloat();

        leitor.close();
        double multiplicacao = 0;

        for (int i = 0; i < numero2; i++) {
            multiplicacao += numero1;
        }

        System.out.printf("A multiplicação de %.1f por %.1f é: %.1f", numero1, numero2, multiplicacao);
    }
}
