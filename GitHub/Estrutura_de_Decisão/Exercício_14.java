package exercícios.GitHub.Estrutura_de_Decisão;

import java.util.Scanner;

public class Exercício_14 {
    public static void main(String[] args) {
        System.out.printf("Quantidade de morangos (em kg) comprados: ");
        Scanner leitor = new Scanner(System.in);
        final int qtdeMorangos = leitor.nextInt();

        System.out.printf("Quantidade de maçãs (em kg) compradas: ");
        final int qtdeMacas = leitor.nextInt();

        // tabela MORANGO
        final float precoMorango5kg = 2.5f;
        final float precoMorango5kgmais = 2.2f;

        // tabela MAÇÃS
        final float precoMaca5kg = 1.8f;
        final float precoMaca5kgmais = 1.5f;

        final float desconto10 = 0.1f;
        double valorPagoMacas = 0;
        double valorPagoMorangos = 0;
        double valorPagoTotal = 0;
        int qtdeKGTotal = 0;
        double aplicaDesconto = 0;

        // calcula o preço x quantidade
        if (qtdeMacas <= 5) {
            valorPagoMacas = qtdeMacas * precoMaca5kg;
        } else if (qtdeMacas > 5) {
            valorPagoMacas = qtdeMacas * precoMaca5kgmais;
        }

        if (qtdeMorangos <= 5) {
            valorPagoMorangos = qtdeMorangos * precoMorango5kg;
        } else if (qtdeMorangos > 5) {
            valorPagoMorangos = qtdeMorangos * precoMorango5kgmais;
        }
       
        valorPagoTotal = valorPagoMacas + valorPagoMorangos;
        qtdeKGTotal = qtdeMacas + qtdeMorangos;

        if (valorPagoTotal > 25 | qtdeKGTotal > 8) {
            aplicaDesconto = valorPagoTotal * desconto10;
            valorPagoTotal = valorPagoTotal - aplicaDesconto;

            System.out.printf("O valor a ser pago equivale a R$ %.2f%nValor das maçãs (sem desconto): R$ %.2f%nValor dos morangos (sem desconto): R$ %.2f", valorPagoTotal, valorPagoMacas, valorPagoMorangos);
        } else if (valorPagoTotal <=25 | qtdeKGTotal <= 8) {
            System.out.printf("O valor a ser pago equivale a R$ %.2f%nValor das maçãs (sem desconto): R$ %.2f%nValor dos morangos (sem desconto): R$ %.2f", valorPagoTotal, valorPagoMacas, valorPagoMorangos);
        }

        leitor.close();
    }
}
