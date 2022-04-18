package teams;

import java.util.Scanner;

public class Exercicio_79 {
    public static void main(String[] args) {
        /* 79) Faça um programa que receba a quantidade de peças
        vendidas por vendedor e armazene essas quantidades em um
        vetor. Receba também o preço da peça vendida de cada
        vendedor e armazene esses preços em outro vetor.
        Existem apenas dez vendedores e cada vendedor pode vender
        apenas um tipo de peça, isto é, para cada vendedor existe
        apenas um preço. Calcule e mostre a quantidade total de
        peças vendidas por todos os vendedores e para cada vendedor
        calcule e mostre o valor total da venda, isto é, a quantidade
        de peças * o preço da peça. */

        Scanner leitor = new Scanner(System.in);
        int somaPecasTotal = 0;
        int contador = 1;
        int[] valorPorVendedor = new int[10];
        int[] listaQuantidadePecas = new int[10];
        int[] listaPrecoPeca = new int[10];

        for (int i = 0; i < 10; i++) {        
            System.out.printf("Vendedor %d, informe a quantidade de peças vendidas: ", contador);
            listaQuantidadePecas[i] = leitor.nextInt();
            somaPecasTotal += listaQuantidadePecas[i];

            System.out.printf("Vendedor %d, informe o preço da peça vendida: R$ ", contador);
            listaPrecoPeca[i] = leitor.nextInt();

            valorPorVendedor[i] = listaQuantidadePecas[i] * listaPrecoPeca[i];
            System.out.printf("Vendedor %d, o valor total da venda foi de R$ %d%n", contador, valorPorVendedor[i]);
            contador++;
        }

        leitor.close();

        System.out.printf("A quantidade total de peças vendidas foi de %d", somaPecasTotal);
    }
}
