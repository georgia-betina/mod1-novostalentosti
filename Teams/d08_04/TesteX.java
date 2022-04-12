package Teams.d08_04;

import java.util.Scanner;

public class TesteX {
    public static void main(String[] args) {
        /* 81) Faça um programa que carregue dois vetores, X e Y,
        com dez números inteiros cada um. Considere que os números
        de cada vetor digital, X e Y, não podem estar repetidos.
        Calcule e mostre os seguintes vetores resultantes: */

        int[] x = new int[5];
        int[] y = new int[5];
        int entradaNumero = 0;

        Scanner leitor = new Scanner(System.in);

        /* for (int i = 0; i < 5; i++) {
            System.out.println("Informe um numero: ");
            x[i] = leitor.nextInt();
        }
        
        leitor.close(); */

        /* for (int i = 4; i > 0; i--) {
            if (x[i] == x[i-1]) {
                System.out.println("Numero " + i + " é repetido com " + (i + 1));
            }
        } */

        /* for (int i = 0; i < 5; i++) {
            if (x[i] == x[i+1]) {
                System.out.println("Numero " + i + " é repetido com " + (i + 1));
            }
        } */

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe um numero: ");
            x[i] = leitor.nextInt();
            y[i] = leitor.nextInt();
            if (i != 0 && x[i] == x[i-1]) {
                System.out.println("Numero repetido!");
            }
            for (int j = i; j > 0; j--) {
                if (x[i] == y[j] && j != 0) {
                    System.out.println("IGUAL XI");
                }
            }
        }
            
        
        leitor.close();

        /* for (int i = 4; i > 0; i--) {
            if (x[i] == x[i-1]) {
                System.out.println("Numero " + i + " é repetido com " + (i + 1));
            }
        } */
    }
}
