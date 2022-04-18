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
        int menorEntrada = 0;
        int contador = 0;

        Scanner leitor = new Scanner(System.in);
        do {
            System.out.printf("Digite um número inteiro e positivo: ");
            entradaNumero = leitor.nextInt();
            if (entradaNumero > 0) {
                if (contador == 0) {
                    maiorEntrada = entradaNumero;
                    menorEntrada = entradaNumero;
                    contador++;
                } else if (contador != 0) {
                    maiorEntrada = Math.max(maiorEntrada, entradaNumero);
                    menorEntrada = Math.min(menorEntrada, entradaNumero);
                }
            }
        } while (entradaNumero > 0);
        leitor.close();

        System.out.println("O maior número apresentado foi " + maiorEntrada + " e o menor número apresentado foi " + menorEntrada);
    }
}
