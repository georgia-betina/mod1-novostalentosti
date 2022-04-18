package Teams.d29_03;

import java.util.Scanner;

public class Exercicio_54 {
    public static void main(String[] args) {
    
    /* 54) Faça um ÚNICO programa para auxiliar uma empresa de
    importação a calcular o valor do preço final de importação
    de um produto. Para isso solicite ao usuário: o preço original
    do produto em dólares, o valor da cotação do dólar, o preço do
    transporte em reais e o tipo de imposto que deve incidir sobre
    o preço do produto (1 – IPI, 2 – ICMS, 3 – Ambos IPI e ICMS). 
 
    Para CADA item abaixo calcule e mostre: 
 
    O preço do produto em reais, que consiste no preço original do
    produto em dólares e o valor da cotação do dólar.
 
    O valor do imposto federal em reais, de acordo com a tabela abaixo,
    considerando o tipo informado de imposto que incide sobre o produto
    e o preço do produto em reais já calculado:
 
    Tipo Imposto             |Preço do Produto em Reais             |% de Imposto 
    -------------------------+--------------------------------------+----------------
    IPI                      |Até R$3.000,00 (inclusive)            | 1,5% 
                             |Mais de R$3.000,00                    | 2% 
    -------------------------+--------------------------------------+----------------
    ICMS                     |Até R$ 1.500,00                       | 2% 
                             |Mais de R$ 1.500,00 (inclusive)       | 3,5% 
    -------------------------+--------------------------------------+----------------
    Ambos IPI e ICMS                                                | 5% 
    -------------------------+--------------------------------------+----------------
 
    O valor do imposto estadual em reais, conforme a regra abaixo:
    O valor do imposto estadual em reais será 2/7 (dois sétimos) do
    valor do imposto federal em reais calculado anteriormente.
 
    O valor do preço final de importação de um produto, consiste na
    soma do preço do produto em reais com o valor do imposto federal
    em reais, o preço do transporte em reais, e o valor do imposto
    estadual em reais. */

    System.out.printf("Informe o preço original do produto em dólar: $ ");
    Scanner leitor = new Scanner(System.in);
    final float precoOriginalDolar = leitor.nextFloat();

    System.out.printf("Informe a cotação em dólar atual: ");
    final float cotacaoDolar = leitor.nextFloat();

    System.out.printf("Informe o preço do transporte em reais: R$ ");
    final float precoTransporte = leitor.nextFloat();

    System.out.printf("Informe o tipo de imposto de acordo com os códigos a seguir:%n1 - IPI%n2 - ICMS%n3 - Ambos IPI e ICMS%n%nCódigo: ");
    final int codigoImposto = leitor.nextInt();
    leitor.close();

    final double conversaoParaReal = precoOriginalDolar * cotacaoDolar;

    System.out.printf("O preço do produto em reais é R$ %.2f.", conversaoParaReal);

    final float imposto1_5 = 0.015f;
    final float imposto2 = 0.02f;
    final float imposto3_5 = 0.035f;
    final float imposto5 = 0.05f;
    double valorImpostoFederal = 0;

    switch(codigoImposto) {
        case 1:
            if (conversaoParaReal <= 3000) {
                valorImpostoFederal = conversaoParaReal * imposto1_5;
            } else if (conversaoParaReal > 3000) {
                valorImpostoFederal = conversaoParaReal * imposto2;
            }
            break;
        case 2:
            if (conversaoParaReal < 1500) {
                valorImpostoFederal = conversaoParaReal * imposto2;
            } else if (conversaoParaReal >= 1500) {
                valorImpostoFederal = conversaoParaReal * imposto3_5;
            }
            break;
        case 3:
            valorImpostoFederal = conversaoParaReal * imposto5;
            break;
        default:
            System.out.printf("Código inválido. Encerrando operação...");
    }

    System.out.printf(" O valor do imposto federal é R$ %.2f.", valorImpostoFederal);

    final double valorImpostoEstadual = ((float)2/(float)7) * valorImpostoFederal;

    System.out.printf(" O valor do imposto estadual é R$ %.2f.", valorImpostoEstadual);

    final double precoFinal = conversaoParaReal + valorImpostoEstadual + valorImpostoFederal + precoTransporte;

    System.out.printf(" O preço final é R$ %.2f.", precoFinal);
    }
}
