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
        int[] z = new int[20];
        int multiplica = 1;
        int soma = 0;
        int contador = 0;

            for (int i = 0; i < 5; i++) {
                System.out.printf("Informe um número (X): ");
                x[i] = leitor.nextInt();
                
            }

            for (int k = 0; k < 5; k++) {
                System.out.printf("Informe um número (Y): ");
                y[k] = leitor.nextInt();
            }

            int contador2 = 4;
            for (int i = 0; i < 5; i++) {
                if (x[i] != y[i] && y[contador2] != x[contador2-1]) {
                    System.out.println("diferente: " + x[i]);
                }
            }

            // SOMA
            for (int i = 0; i < 5; i++) {
                soma = x[i] + y[i];
                System.out.println(soma);
            }

            // MULTIPLICAÇÃO
            for (int i = 0; i < 5; i++) {
                multiplica = x[i] * y[i];
                System.out.println(multiplica);
            }

            // LISTA (X)
            System.out.printf("(X) = ");
            for (int i = 0; i < x.length; i++) {
                System.out.printf("%d ", x[i]);
            }

            // LISTA (Y)
            System.out.printf("(Y) = ");
            for (int i = 0; i < x.length; i++) {
                System.out.printf("%d ", y[i]);
            }

            // DIFERENÇA
            System.out.printf("%nA diferença de X e Y é: ");
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
            System.out.printf("%nA interseção entre X e Y é: ");
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

            /*for (int j = 0; j < 5; j++) {

            z[contador1] = x[conta0];
            contador1++;
            z[contador1] = y[conta0];
            contador1++;
            conta0++;
            }*/

        leitor.close();




        /* Scanner leitor = new Scanner(System.in);
        int[] x = new int[10];
        int[] y = new int[10];
        int contadorContrario = 9;
        int contador = 0;

        for (int i = 0; i < x.length; i++) {
            System.out.printf("Informe um número: ");
            if (contador == 0) {
                x[i] = leitor.nextInt();
                y[contadorContrario] = leitor.nextInt();
                contador++;
            } else if (contador != 0) {
                x[i] = leitor.nextInt();
                do {
                    while (x[i] == y[contadorContrario]) {
                        System.out.printf("Número repetido. Informe outro número: ");
                        x[i] = leitor.nextInt();
                        contadorContrario--;
                    }
                    break;
                } while (true);
            }                        
        }

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
                    
                }
            }
            System.out.printf("A casa é %d, o número colocado é %d%n%n", i, x[i]);
        }

        for (int i = 0; i < y.length; i++) {
            System.out.printf("Informe outro número: ");
            y[i] = leitor.nextInt();
        }

        leitor.close(); */
    }
}
