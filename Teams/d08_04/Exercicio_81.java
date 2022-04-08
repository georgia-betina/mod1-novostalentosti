package Teams.d08_04;

import java.util.Scanner;

public class Exercicio_81 {
    public static void main(String[] args) {
        /* 81) Faça um programa que carregue dois vetores, X e Y,
        com dez números inteiros cada um. Considere que os números
        de cada vetor digital, X e Y, não podem estar repetidos.
        Calcule e mostre os seguintes vetores resultantes:

        - a união de X com Y (todos os elementos de X e os elementos
        de Y que não estejam em X)
        - a diferença entre X e Y (todos os elementos de X que não
        existam em Y)
        - a soma entre X e Y (soma de cada elemento de X com o elemento
        de mesma posição em Y)
        - produto entre X e Y (multiplicação de cada elemento de X com
        o elemento de mesma posição em Y)
        - a interseção entre X e Y (apenas os elementos que aparecem
        nos dois vetores) */

        Scanner leitor = new Scanner(System.in);
        int[] x = new int[10];
        int[] y = new int[10];
        int contador = 0;

        for (int i = 0; i < x.length; i++) {
            System.out.printf("Informe um número: ");
            if (contador == 0) {
                x[i] = leitor.nextInt();
                contador++;
            } else if (contador != 0) {
                x[i] = leitor.nextInt();
                for (int j = i; j > 0; j--) {
                    while (x[i] == x[i - 1] || x[i] == x[0]) {
                        System.out.printf("Número repetido. Informe outro: ");
                        x[i] = leitor.nextInt();
                    }
                }
                /* while ( == x[i]) {
                    
                } */
            }
            System.out.printf("A casa é %d, o número colocado é %d%n%n", i, x[i]);
        }

        for (int i = 0; i < y.length; i++) {
            System.out.printf("Informe outro número: ");
            y[i] = leitor.nextInt();
        }

        leitor.close();
    }
}
