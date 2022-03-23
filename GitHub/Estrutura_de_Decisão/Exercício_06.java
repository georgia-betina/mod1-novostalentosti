package exercícios.GitHub.Estrutura_de_Decisão;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        System.out.printf("Informe o seu nome: ");
        Scanner leitor = new Scanner(System.in);
        final String nome = leitor.nextLine();

        System.out.printf("Informe o valor da venda: ");
        final float valorVendas = leitor.nextFloat();

        leitor.close();

        final float comissaoGrande = 0.12f;
        final float comissaoMedia = 0.095f;
        final float comissaoPequena = 0.07f;

        double comissao = 0;

        if (valorVendas > 50000) {
            comissao = valorVendas * comissaoGrande;
        } else if (valorVendas > 30000 & valorVendas < 50000) {
            comissao = valorVendas * comissaoMedia;
        } else if (valorVendas < 30000) {
            comissao = valorVendas * comissaoPequena;
        }

        System.out.printf("%s, o valor da sua venda foi de R$ %.2f e o valor da comissão é de R$ %.2f.", nome, valorVendas, comissao);
    }
}
