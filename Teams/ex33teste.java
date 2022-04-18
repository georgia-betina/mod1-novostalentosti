package Teams.d21_03;

import java.util.Scanner;

public class ex33teste {
    public static void main(String[] args) {
        System.out.printf("Digite o código do produto (1-10): ");
        Scanner leitor = new Scanner(System.in);
        final int codigoProduto = leitor.nextInt();

        System.out.printf("Digite o peso do produto (em kg): ");
        final float peso = leitor.nextFloat();

        System.out.printf("Digite o código do país de origem (1-3): ");
        final int codigoPais = leitor.nextInt();

        leitor.close();

        final int gramas = 1000;
        final double pesoGramas = peso * (float)gramas;
        System.out.printf("O peso do seu produto em gramas é %.0fg%n", pesoGramas);

        double precoGramaFinal1 = 0, precoGramaFinal2 = 0, precoGramaFinal3 = 0;
        double novoPreco = 0, novoPrecoTotal = 0;
        double valorcImposto1 = 0, valorcImposto2 = 0;

        switch (codigoProduto) {
            case 1:
            case 2:
            case 3:
            case 4:
                final int precopGrama1 = 10;
                precoGramaFinal1 = pesoGramas * (float)precopGrama1;
                System.out.printf("O preço do produto é R$ %.2f%n", precoGramaFinal1);
                novoPreco = precoGramaFinal1;
                break;
            case 5:
            case 6:
            case 7:
                final int precopGrama2 = 25;
                precoGramaFinal2 = pesoGramas * precopGrama2;
                System.out.printf("O preço do produto é R$ %.2f%n", precoGramaFinal2);
                novoPreco = precoGramaFinal2;
                break;
            case 8:
            case 9:
            case 10:
                final int precopGrama3 = 35;
                precoGramaFinal3 = pesoGramas * precopGrama3;
                System.out.printf("O preço do produto é R$ %.2f%n", precoGramaFinal3);
                novoPreco = precoGramaFinal3;
                break;
            default:
                System.out.printf("Código de produto inválido.");
                break;
        }

        switch (codigoPais) {
            case 1:
                System.out.println("%nO valor do imposto é R$ 0,00");
                novoPrecoTotal = novoPreco;
                break;
            case 2:
                final float imposto1 = 0.15f;
                valorcImposto1 = novoPreco * imposto1;
                System.out.printf("O valor do imposto é R$ %.2f%n", valorcImposto1);
                valorcImposto1 = novoPreco + valorcImposto1;
                novoPrecoTotal = valorcImposto1;
                break;
            case 3:
                final float imposto2 = 0.25f;
                valorcImposto2 = novoPreco * imposto2;
                System.out.printf("O valor do imposto é R$ %.2f%n", valorcImposto2);
                valorcImposto2 = novoPreco + valorcImposto2;
                novoPrecoTotal = valorcImposto2;
                break;
            default:
                System.out.printf("Código de país inválido.");
        }

        System.out.printf("O valor do produto é R$ %.2f e o preço total é R$ %.2f.", novoPreco, novoPrecoTotal);
    }
}
