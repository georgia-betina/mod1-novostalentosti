package Teams.d31_03;

import java.util.Scanner;

public class Exercicio_57 {
    public static void main(String[] args) {
        /*
        * 57) Faça um programa que leia um valor N inteiro e positivo.
        * Calcule e mostre o valor de E, conforme a fórmula a seguir:
        * E = 1 + 1/(1!) + 1/(2!) + 1/(3!) + ... + 1/(N!)
        */

        int entradaNumero = 0;
        Scanner leitor = new Scanner(System.in);
        do {
            System.out.printf("Informe um valor inteiro e positivo: ");
            entradaNumero = (int) leitor.nextInt();
            if (entradaNumero < 0) {
                System.out.printf("Valor inválido. ");
            }
        } while (entradaNumero < 0);

        leitor.close();

        // CONTADOR ATÉ 5
        int contador1 = 1;
        while (contador1 < entradaNumero) {
            contador1++;
            System.out.println(contador1);
        }

        // FATORIAL
        int contador = entradaNumero;
        int fatorial = entradaNumero;
        for(int i=1; i!=entradaNumero; i++){
            contador--;
            fatorial *= contador;
        }
    }
}
