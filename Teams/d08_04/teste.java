package Teams.d08_04;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        int numeroTeste = 1;
        int numeroTeste2 = 2;
        int[] listaNumeros = new int[10];
        int[] listaNumeros2 = new int[10];
        int contador = 0;

        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.printf("Informe um número: ");
            if (contador == 0) {
                listaNumeros[i] = leitor.nextInt();
                listaNumeros2[i] = leitor.nextInt();
                contador++;
            } else if (contador != 0) {
                while (contador == 1) {
                    while (listaNumeros[i] == listaNumeros2[i-1]) {
                        
                    }
                }
            }
            /* if (contador == 0) {
                listaNumeros[i] = leitor.nextInt();
                listaNumeros2[i] = leitor.nextInt();
                contador++;
            } else if (contador != 0) {
                while (int i : listaNumeros) {

                }
                for (int j = 0; j >= 0; j++) {
                    while (listaNumeros[i] == ) {
                        System.out.printf("Número repetido. Informe outro: ");
                        listaNumeros[i] = leitor.nextInt();
                    }
                }
            }

            while (listaNumeros[i] == numeroTeste) {
                
            } */
        }
        leitor.close();
    }
}
