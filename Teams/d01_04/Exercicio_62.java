package Teams.d01_04;

import java.util.Scanner;

public class Exercicio_62 {
    public static void main(String[] args) {
        /* 62) Elaborar um programa que efetue a leitura de
        valores positivos inteiros até que um valor negativo
        seja informado. Ao final deve ser apresentados o maior
        e o menor número informado pelo usuário. */

        int entradaNumero = 0;
        int maiorEntrada = 0;
        int menorEntrada;

        Scanner leitor = new Scanner(System.in);
        do {
            System.out.printf("Digite um número inteiro e positivo: ");
            menorEntrada = entradaNumero;
            entradaNumero = leitor.nextInt();
            if (entradaNumero > 0) {
                maiorEntrada = Math.max(entradaNumero, maiorEntrada);
                menorEntrada = Math.min(entradaNumero, menorEntrada);
            }
        } while (entradaNumero > 0);
        leitor.close();

        System.out.println("O maior número apresentado foi " + maiorEntrada + " e o menor número apresentado foi " + menorEntrada);
    }
}
