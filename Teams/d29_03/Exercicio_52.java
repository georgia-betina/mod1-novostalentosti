import java.util.Scanner;

public class Exercicio_52 {
    public static void main(String[] args) {
        /* Um supermercado deseja reajustar os preços de seus
        produtos usando o seguinte critério: o produto poderá ter
        seu preço aumentado ou diminuído. Para alterar o preço o
        produto deve preencher pelo menos um dos requisitos a seguir:

        Requisitos                                     | Reajuste
        -----------------------------------------------+-------------------------------------
        Venda Média Mensal          Preço Atual        | % de Aumento    % de Redução
        -----------------------------------------------+-------------------------------------
        < R$ 500                   < R$ 30             |     12                           não    
        >= 500 e < 1.600          >= R$ 30 e < R$ 80   |     15                           não    
        >= 1.600                   >= R$ 80,00         |     não                          25
        */
        Scanner leitor = new Scanner(System.in);

        System.out.printf("Informe o valor do produto: R$ ");
        final float valorProduto = leitor.nextFloat();
        System.out.printf("Insira o valor da venda média mensal de acordo com os códigos abaixo:%n1 - < R$ 500%n2 - >= R$ 500 e < R$ 1.600%n3 - >= R$ 1600%n%nCódigo: ");
        final int codigoVendaMediaMensal = leitor.nextInt();
        leitor.close();

        final float aumenta12 = 0.12f;
        final float aumenta15 = 0.15f;
        final float diminui25 = 0.25f;
        double reajustaPreço, novoValorProduto;
        final String naoReajusta = "Não haverá reajuste de preço.";

        switch (codigoVendaMediaMensal) {
            case 1:
                if (valorProduto >= 30) {
                    System.out.printf(naoReajusta);
                } else if (valorProduto < 30) {
                    reajustaPreço = valorProduto * aumenta12;
                    novoValorProduto = valorProduto + reajustaPreço;

                    System.out.printf("O preço do produto com o novo reajuste de 12%% será de R$ %.2f.", novoValorProduto);
                }
                break;
            case 2:
                if (valorProduto < 30 || valorProduto >= 80) {
                    System.out.printf(naoReajusta);
                } else if (valorProduto >= 30 && valorProduto < 80) {
                    reajustaPreço = valorProduto * aumenta15;
                    novoValorProduto = valorProduto + reajustaPreço;

                    System.out.printf("O preço do produto com o novo reajuste de 15%% será de R$ %.2f.", novoValorProduto);
                }
                break;
            case 3:
                if (valorProduto < 80) {
                    System.out.printf(naoReajusta);
                } else if (valorProduto >= 80) {
                    reajustaPreço = valorProduto * diminui25;
                    novoValorProduto = valorProduto - reajustaPreço;

                    System.out.printf("O preço do produto com o novo desconto de 25%% será de R$ %.2f.", novoValorProduto);
                }
                break;
            default:
                System.out.printf("O código inserido é inválido. Encerrando operação...");
        }
    }
}
