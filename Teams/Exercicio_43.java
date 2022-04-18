package Teams.d28_03;

import java.util.Scanner;

public class Exercicio_43 {
    public static void main(String[] args) {
        /* Escreva um algoritmo que calcule o numero de prateleiras
        necessárias para guardar uma quantidade informada de livros.
        Considerando que em média uma prateleira comporta 32 livros. */

        System.out.printf("Informe a quantidade de livros: ");
        Scanner leitor = new Scanner(System.in);
        final int qtdeLivros = leitor.nextInt();
        leitor.close();

        final int prateleiraComporta = 32;

        if (qtdeLivros <= prateleiraComporta) {
            System.out.printf("Você precisa de uma prateleira.");
        } else if (qtdeLivros > prateleiraComporta) {
            double qtdePrateleiras = (float)qtdeLivros / (float)prateleiraComporta;
            qtdePrateleiras = Math.ceil(qtdePrateleiras);
            System.out.printf("Você precisa de %.0f prateleiras.", qtdePrateleiras);
        }
    }
}
