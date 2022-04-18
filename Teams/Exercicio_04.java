package Teams;

import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        /* Exercício 4) Construa um programa que retorne o valor total da
        * revelação de um filme de 24 poses, solicite o número de
        * fotos reveladas. E considere que o valor unitário da
        * revelação por foto é de R$ 0,90. */

        // ENTRADA
        System.out.println("Olá, querido usuário. Por favor, informe o número de fotos reveladas:");
        Scanner leitor = new Scanner(System.in);
        final int qtderevel = leitor.nextInt();
        leitor.close();

        // PROCESSAMENTO
        final double valtotal = (float)qtderevel * 0.9;

        // SAÍDA
        System.out.println(String.format("O valor total da revelação é de R$%.2d.", valtotal));
    }
}
