package GitHub.Estrutura_de_Repetição;

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        /*
        * Exercício 02) Escreva um programa que pergunte ao usuário um número
        * e após, escreva na tela a soma total de 1 até o número lido. Exemplo:
        * 5: 1 + 2 + 3 + 4 + 5 = 15
        */

        Scanner leitor = new Scanner(System.in);

        int entradaNumero = 0;
        int somaNumeros = 0;
        do {
            System.out.printf("Digite um número inteiro e positivo: ");
            entradaNumero = leitor.nextInt();

            if (entradaNumero > 0) {
                for (int i = entradaNumero; i >= 1; i--) {
                    somaNumeros += i;
                    if (i != 1) {
                        System.out.printf("%d + ", i);
                    } else if (i == 1) {
                        System.out.printf("%d", i);
                    }
                }
    
                System.out.printf(" = %d%n", somaNumeros);
                somaNumeros = 0;
            } else if (entradaNumero <= 0) {
                System.out.printf("Valor inválido. Encerrando operação...");
            }
        } while (entradaNumero > 0);
        leitor.close();
    }
}
