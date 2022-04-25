package GitHub.Estrutura_de_Repetição;

import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        /*
        * Exercício 05) Faça um programa para calcular e escrever a soma dos cubos
        * dos números pares compreendidos entre A e B (B > A). A e B são lidos pelo
        * teclado.
        */

        Scanner leitor = new Scanner(System.in);
        int valorA = 0;
        int valorB = 0;

        do {
            System.out.printf("Informe o valor de A: ");
            valorA = leitor.nextInt();

            System.out.printf("Informe o valor de B (sendo que B deve ser maior que A: ");
            valorB = leitor.nextInt();

            int aumentaContagem = valorA;
            int aoCubo = aumentaContagem;
            int somaNumeros = 0;

            if (valorB > valorA) {
                for (int i = valorA; i <= valorB; i++) {
                    if (aumentaContagem % 2 == 0) {
                        aoCubo *= aumentaContagem * aumentaContagem;
                        somaNumeros += aoCubo;
                        aumentaContagem++;
                        aoCubo = aumentaContagem;
                    }
                }
                System.out.printf("A soma é %d\n", somaNumeros);
                // contador até valor B -> os resultados sao pares? se sim, calcula o cubo e soma
            }

        } while (valorB > valorA);

        leitor.close();
    }
}
