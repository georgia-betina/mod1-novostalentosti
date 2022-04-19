package teams;

import java.util.Scanner;

public class Exercicio_45 {
    public static void main(String[] args) {
        /*
        * Exercício 45) Escreva um algoritmo que calcule o valor de desconto
        * que será oferecido ao comprador de uma loja de acordo com o valor
        * da compra: compras até R$100 desconto de 5%, compras maiores que
        * R$ 100 e ate R$400 desconto de 10%, e acima de R$ 400 desconto de
        * 13%. Após o calculo do valor com desconto, acrescente o valor da
        * taxa de entrega que é de R$ 1,5 por item comprado.
        */

        System.out.printf("Informe o valor da compra: R$ ");
        Scanner leitor = new Scanner(System.in);
        final float valorCompra = leitor.nextFloat();
        System.out.printf("Informe a quantidade de itens comprados: ");
        final int qtdeItensComprados = leitor.nextInt();
        leitor.close();

        final float desconta5 = 0.05f;
        final float desconta10 = 0.1f;
        final float desconta13 = 0.13f;

        final float taxaEntrega = 1.5f; // reais

        double aplicaDesconto, valorTotal;

        final double aplicaTaxa = (float)qtdeItensComprados * taxaEntrega;
        

        if (valorCompra <= 100) {
            aplicaDesconto = valorCompra * desconta5;
            valorTotal = valorCompra - aplicaDesconto;
            valorTotal = valorTotal + aplicaTaxa;

            System.out.printf("O valor a pagar será de R$ %.2f.", valorTotal);
        } else if (valorCompra > 100 && valorCompra <= 400) {
            aplicaDesconto = valorCompra * desconta10;
            valorTotal = valorCompra - aplicaDesconto;
            valorTotal = valorTotal + aplicaTaxa;

            System.out.printf("O valor a pagar será de R$ %.2f.", valorTotal);
        } else if (valorCompra > 400) {
            aplicaDesconto = valorCompra * desconta13;
            valorTotal = valorCompra - aplicaDesconto;
            valorTotal = valorTotal + aplicaTaxa;

            System.out.printf("O valor a pagar será de R$ %.2f.", valorTotal);
        }
    }
}
