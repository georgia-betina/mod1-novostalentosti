package GitHub.Estrutura_de_Repetição;

import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        /*
        * Exercício 04) Construa um programa que exiba a tabuada de 1 até N,
        * onde N é informado pelo usuário. ex: Até a tabuada de 3, irá imprimir
        * as tabuadas de 1, 2 e 3.
        */

        Scanner leitor = new Scanner(System.in);
        int entradaNumero = 0;
        do {
            System.out.printf("Informe um número inteiro e positivo: ");
            entradaNumero = leitor.nextInt();

            if (entradaNumero > 0) {

                for (int g = 1; g <= entradaNumero; g++) {
                    int contador = 1;
                    int multiplica = g;

                    System.out.printf("TABUADA DE %d%n", g);
                    for (int i = 1; i <= 10; i++) {
                        multiplica *= contador;
                        System.out.printf("%d * %d = %d%n", g, contador, multiplica);
                        multiplica = g;
                        contador++;
                    }
                    System.out.println();
                }
            } else if (entradaNumero <= 0) {
                System.out.printf("Valor inválido. Encerrando operação...");
            }
        } while (entradaNumero > 0);

        leitor.close();
    }
}
