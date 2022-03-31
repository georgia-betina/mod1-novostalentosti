package Teams.d31_03;

import java.util.Scanner;

public class Exercicio_58 {
    public static void main(String[] args) {
        /* 58) Faça um programa que leia um número N que
        indica quantos valores inteiros e positivos devem
        ser lidos a seguir. Para cada número lido, mostre
        o valor lido e o fatorial desse valor. */

        System.out.printf("Informe um número: ");
        Scanner leitor = new Scanner(System.in);
        final int entradaNumero = (int)leitor.nextFloat();
        leitor.close();

        int contador = 0;
        while (contador < entradaNumero) {
            contador++;
            System.out.println(contador);
        }
    }
}
