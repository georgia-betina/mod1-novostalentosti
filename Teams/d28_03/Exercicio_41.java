package Teams.d28_03;

import java.util.Scanner;

public class Exercicio_41 {
    public static void main(String[] args) {
        /* Escreva um algoritmo que calcule o número de páginas mínimo
        que um leitor deve ler para terminar um livro em um determinado
        numero de dias informado. Caso o número de paginas a ler por dia
        for maior que 100, informe ao usuário que é impossível de realizar
        a leitura, caso contrário apresente o número de paginas. */

        System.out.printf("Informe a quantidade total de páginas do livro: ");
        Scanner leitor = new Scanner(System.in);
        final int numeroPaginas = leitor.nextInt();

        System.out.printf("Informe a quantidade de dias desejados para ler o livro: ");
        final int numeroDias = leitor.nextInt();
        leitor.close();

        final float qtdePaginasPorDia = numeroPaginas / numeroDias;
        final int limitePaginas = 100;

        if (qtdePaginasPorDia > limitePaginas) {
            System.out.printf("Impossível realizar a leitura, pois é necessário mais de 100 páginas por dia.");
        } else if (qtdePaginasPorDia <= 100) {
            System.out.printf("O número de páginas que precisam ser lidas para terminar o livro em %d dia(s) é %.0f.", numeroDias, qtdePaginasPorDia);
        }
    }
}
