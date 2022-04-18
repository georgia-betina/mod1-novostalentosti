package Teams.d04_04;

import java.util.Scanner;

public class Exercicio_67 {
    public static void main(String[] args) {
        /* 67) Faça um programa que apresente os resultados
        de uma tabuada de um número qualquer, a qual deve ser
        impressa no seguinte formato:
        Considerando como exemplo o fornecimento do número 2
        para o número qualquer, ter-se-ia a seguinte situação:
        2 x 1 = 2
        2 x 2 = 4
        2 x 3 = 6
        ...
        2 x 10 = 20 */

        System.out.printf("Informe um número inteiro e positivo para calcular a sua tabuada: ");
        Scanner leitor = new Scanner(System.in);
        final int numeroEntrada = leitor.nextInt();
        leitor.close();

        int nInicial = 1;
        int nFinal = 10;
        float multiplica = numeroEntrada;

        for (int i = nInicial; i <= nFinal; i++){
            multiplica *= i;
            System.out.printf("%d x %d = %.0f%n", numeroEntrada, i, multiplica);
            multiplica = numeroEntrada;
        }


    }
}
