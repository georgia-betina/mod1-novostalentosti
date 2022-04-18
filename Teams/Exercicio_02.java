package Teams;

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        /* Exercício 2) Faça um programa para calcular a quantidade
        * de carne necessária para um churrasco de acordo com o número
        * de pessoas convidadas. Considere que todas são adultas e que
        * um adulto consome 250 gramas de carne por refeição. */

        // ENTRADA
        System.out.println("Olá, querido usuário. Por favor, indique a quantidade de pessoas que estão convidadas para o churrasco:");
        Scanner leitor = new Scanner(System.in);
        final int qtdepessoas = leitor.nextInt();
        leitor.close();

        // PROCESSAMENTO
        final int qtdecarne = qtdepessoas * 250;

        if(qtdecarne >= 1000){
            final float qtdecarnef = qtdecarne / 1000;
            // SAÍDA
            System.out.println(String.format("A quantidade necessária de carne para o churrasco é %.1fkg.", qtdecarnef));
        } else {
            // SAÍDA
            System.out.println(String.format("A quantidade necessária de carne é %dg.", qtdecarne));
        }
    }
}
