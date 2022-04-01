package Teams.d31_03;

import java.util.Scanner;

public class Exercicio_58 {
    public static void main(String[] args) {
        /* 58) Faça um programa que leia um número N que
        indica quantos valores inteiros e positivos devem
        ser lidos a seguir. Para cada número lido, mostre
        o valor lido e o fatorial desse valor. */

        int entradaNumero = 0;
        Scanner leitor = new Scanner(System.in);

        do {
            System.out.printf("Informe um número inteiro e positivo: ");
            entradaNumero = (int)leitor.nextFloat();
            if (entradaNumero < 0) {
                System.out.printf("Valor inválido. ");
            }
        } while (entradaNumero < 0);

        leitor.close();

        //FATORIAL
        System.out.printf("A quantidade de números inteiros e positivos a ser mostrada é: %d%n", entradaNumero);
        int contador = 0; // conta até a entrada
        double fatorial = 1;
        while (contador < entradaNumero) {
            contador++;
            for (int ii=1; ii <= contador; ii++) {
                fatorial *= ii;
            }
            System.out.printf("Número %d, fatorial: %.0f%n", contador, fatorial);
            fatorial = 1;
        }
    }
}
