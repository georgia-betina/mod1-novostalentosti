package teams;

import java.util.Scanner;

public class Exercicio_65 {
    public static void main(String[] args) {
        /* 65) Faça um algoritmo que leia um número inteiro
        e calcule o seu fatorial. Se o número for negativo,
        informe que o valor é inválido. Sabemos que o fatorial
        de um número n, representado por n!, é dado por:
        n * (n-1) * (n-2) * ... * 1, para n > 0 e n! = 1 para n = 0 */

        float entradaNumero = 0f;
        Scanner leitor = new Scanner(System.in);

        do {
            System.out.printf("Digite um inteiro maior ou igual a zero: ");
            entradaNumero = (float)leitor.nextFloat();
            int contador = 1;
            double fatorial = 1;
            if (entradaNumero >=0 && entradaNumero != 1) {
                while (contador < entradaNumero) {
                    for (int i = 1; i <= entradaNumero; i++) {
                        fatorial *= contador;
                        contador++;
                    }
                }
                System.out.printf("O fatorial de %.0f é %.0f%n", entradaNumero, fatorial);
            } else if (entradaNumero < 0) {
                System.out.printf("Número inválido. ");
            } else if (entradaNumero == 1) {
                System.out.printf("O fatorial de %.0f é 0%n", entradaNumero);
            }
        } while (entradaNumero >= 0);

        leitor.close();
    }
}
