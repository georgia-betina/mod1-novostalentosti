package teams;

import java.util.Scanner;

public class Exercicio_78 {
    public static void main(String[] args) {
        /* 78) Faça um programa que receba dez números e armazene em
        uma lista. Em seguida copie todos os números da primeira lista
        para uma segunda lista, mas na ordem invertida da primeira lista. */

        Scanner leitor = new Scanner(System.in);
        int[] listaNumeros = new int[10];
        int[] listaNumerosInvertidos = new int[10];

        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.printf("Informe um número: ");
            listaNumeros[i] = leitor.nextInt();
        }

        leitor.close();

        int contador = 0;
        System.out.printf("A lista invertida é: ");
        for (int i = 9; i >= 0; i--) {
            listaNumerosInvertidos[contador] = listaNumeros[i];
            System.out.println(listaNumerosInvertidos[contador]);
            contador++;
        }
    }
}
