package Teams.d08_04;

import java.util.Scanner;

public class Exercicio_81 {
    public static void main(String[] args) {
        /* 81) Faça um programa que carregue dois vetores, X e Y,
        com dez números inteiros cada um. Considere que os números
        de cada vetor digital, X e Y, não podem estar repetidos.
        Calcule e mostre os seguintes vetores resultantes:

        - OK a união de X com Y (todos os elementos de X e os elementos
        de Y que não estejam em X)
        - OK - a diferença entre X e Y (todos os elementos de X que não
        existam em Y)
        - OK - a soma entre X e Y (soma de cada elemento de X com o elemento
        de mesma posição em Y)
        - OK - produto entre X e Y (multiplicação de cada elemento de X com
        o elemento de mesma posição em Y)
        - OK - a interseção entre X e Y (apenas os elementos que aparecem
        nos dois vetores) */

        Scanner leitor = new Scanner(System.in);
        int[] x = new int[5];
        int[] y = new int[5];
        int multiplica = 1;
        int soma = 0;

            for (int i = 0; i < 5; i++) {
                System.out.printf("Informe um número (X): ");
                x[i] = leitor.nextInt();
                
            }

            for (int k = 0; k < 5; k++) {
                System.out.printf("Informe um número (Y): ");
                y[k] = leitor.nextInt();
            }

            // LISTA (X)
            System.out.printf("%n%n(X) = ");
            for (int i = 0; i < x.length; i++) {
                System.out.printf("%d ", x[i]);
            }

            // LISTA (Y)
            System.out.printf("%n(Y) = ");
            for (int i = 0; i < x.length; i++) {
                System.out.printf("%d ", y[i]);
            }

            // SOMA
            System.out.printf("%n%nA soma de (X) com (Y) é: ");
            for (int i = 0; i < 5; i++) {
                soma = x[i] + y[i];
                if (i <= 3) {
                    System.out.printf("%d - ", soma);
                } else if (i == 4) {
                    System.out.printf("%d", soma);
                }
            }

            // MULTIPLICAÇÃO
            System.out.printf("%nA multiplicação de (X) com (Y) é: ");
            for (int i = 0; i < 5; i++) {
                multiplica = x[i] * y[i];
                if (i <= 3) {
                    System.out.printf("%d - ", multiplica);
                } else if (i == 4) {
                    System.out.printf("%d", multiplica);
                }
            }

            // UNIÃO
            System.out.printf("%nA união de (X) e (Y) é: ");
            for (int i = 0; i < x.length; i++) {
                System.out.printf("%d ", x[i]);
            }
            for (int i = 0; i < x.length; i++) {
                if (y[i] != x[0] && y[i] != x[1] && y[i] != x[2] && y[i] != x[3] && y[i] != x[4]) {
                    System.out.printf("%d ", y[i]);
                }
            }

            // DIFERENÇA
            System.out.printf("%nA diferença de (X) e (Y) é: ");
            for (int i = 0; i < x.length; i++) {
                if (x[i] == y[0]) {
                } else if (x[i] == y[1]) {
                } else if (x[i] == y[2]) {
                } else if (x[i] == y[3]) {
                } else if (x[i] == y[4]) {
                } else {
                    System.out.printf("%d ", x[i]);
                }
            }

            // INTERSEÇÃO
            System.out.printf("%nA interseção entre (X) e (Y) é: ");
            for (int i = 0; i < x.length; i++) {
                if (x[i] == y[0]) {
                    System.out.printf("%d ", x[i]);
                } else if (x[i] == y[1]) {
                    System.out.printf("%d ", x[i]);
                } else if (x[i] == y[2]) {
                    System.out.printf("%d ", x[i]);
                } else if (x[i] == y[3]) {
                    System.out.printf("%d ", x[i]);
                } else if (x[i] == y[4]) {
                    System.out.printf("%d ", x[i]);
                }
            }

        leitor.close();

    }
}
