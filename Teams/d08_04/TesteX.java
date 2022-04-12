package Teams.d08_04;

import java.util.Scanner;

public class TesteX {
    public static void main(String[] args) {
        int[] listaNumeros = new int[10];
        int contador = 0;

        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.printf("Forneça um número: ");
            if (contador == 0) {
                listaNumeros[i] = leitor.nextInt();
                contador++;
            } else if (contador != 0) {
                listaNumeros[i] = leitor.nextInt();
                for (int j = i; j >= 1; j--) {
                    while (listaNumeros[j] == listaNumeros[i] && j != i) {
                        System.out.printf("Valor repetido. Informe outro: ");
                        listaNumeros[i] = leitor.nextInt();
                    }
                }
            }
        }
        leitor.close();
    }
}
