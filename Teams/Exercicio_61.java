package Teams.d01_04;

import java.util.Scanner;

public class Exercicio_61 {
    public static void main(String[] args) {
        /* 61) Elaborar um programa que efetue a leitura
        sucessiva de valores numéricos e apresente no final
        o total do somatório, a média e o total de valores
        lidos. O programa deve fazer as leituras dos valores
        enquanto o usuário estiver fornecedor valores positivos.
        Ou seja, o programa deve parar quando o usuário fornecer
        um valor negativo. */

        Scanner leitor = new Scanner(System.in);

        
        int contador = 0;
        double entradaNumero = 0;
        double soma = 0;
        double media = 0;

        do {
            System.out.printf("Informe um número positivo: ");
            entradaNumero = leitor.nextDouble();
            if (entradaNumero > 0) {
                soma += entradaNumero;
            }
            contador++;
        } while (entradaNumero > 0);

        leitor.close();

        contador--;
        media = soma / contador;

        System.out.printf("A quantidade de números digitados é: %d%nA soma de todos os números é %.2f%nA média de todos os números é %.2f", contador, soma, media);
        
    }
}
