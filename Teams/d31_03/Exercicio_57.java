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

        //double formula += 1 + 1/(fatorial);

        // FATORIAL DE ACORDO COM O CONTADOR
        int contador1 = 1;
        while (contador1 < entradaNumero) {
            System.out.println("O contador é: " + contador1);
            int contador = contador1;
            int fatorial = 1;
            for(int i=1; i!=contador1; i++){
                fatorial *= contador;
                contador--;
            }
            contador1++;
            System.out.println("O fatorial é: " + fatorial);
        }

        // CONTADOR ATÉ ENTRADA NUMERO
        int contador2 = 1;
        while (contador1 < entradaNumero) {
            contador2++;
            System.out.println(contador2);
        }

        // FATORIAL
        int contador = contador1;
        int fatorial = entradaNumero;
        for(int i=1; i!=entradaNumero; i++){
            contador--;
            fatorial *= contador;
        }

        //System.out.println(fatorial);
    }
}
