package GitHub.Estrutura_de_Repetição;

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        /* Faça um programa que peça dois números, base e
        expoente, calcule e mostre o primeiro número
        elevado ao segundo número. Não utilize a
        função de potência da linguagem. */

        Scanner leitor = new Scanner(System.in);
        System.out.printf("Informe um número (base): ");
        final int numeroBase = leitor.nextInt();

        System.out.printf("Informe outro número (expoente): ");
        final int numeroExpoente = leitor.nextInt();

        leitor.close();

        int potencia = 1;

        for (int i = 1; i <= numeroExpoente; i++) {
            potencia *= numeroBase;
        }

        System.out.printf("A potência de %d elevado a %d é %d.", numeroBase, numeroExpoente, potencia);

    }
}
