package teams;

import java.util.Scanner;

public class Exercicio_44 {
    public static void main(String[] args) {
        /*
        * Exercício 44) Escreva um algoritmo que calcule o valor de uma chamada
        * de telefone. Deverá ser informado a quantidade de minutos falados
        * durante a ligação além de sua origem. Considere que uma ligação “local”
        * custa R$0.020, ligação “intermunicipal” R$0,08 e “interestadual” R$0,1.
        */

        System.out.printf("Informe o tipo de ligação:%n1 - Local%n2 - Intermunicipal%n3 - Interestadual%n%nCódigo: ");
        Scanner leitor = new Scanner(System.in);
        final int codigoTipoLigacao = leitor.nextInt();

        System.out.printf("Agora, informe a quantidade de minutos da chamada: ");
        final float qtdeMinutos = leitor.nextFloat();
        leitor.close();

        final float valorLocal = 0.02f;
        final float valorIntermunicipal = 0.08f;
        final float valorInterestadual = 0.1f;
        double valorAPagar;

        switch (codigoTipoLigacao) {
            case 1:
                valorAPagar = qtdeMinutos * valorLocal;
                System.out.printf("O valor a ser pago será de R$ %.2f.", valorAPagar);
                break;
            case 2:
                valorAPagar = qtdeMinutos * valorIntermunicipal;
                System.out.printf("O valor a ser pago será de R$ %.2f.", valorAPagar);
                break;
            case 3:
                valorAPagar = qtdeMinutos * valorInterestadual;
                System.out.printf("O valor a ser pago será de R$ %.2f.", valorAPagar);
                break;
            default:
                System.out.printf("O sistema não pôde compreender o código informado. Encerrando operação...");
        }
    }
}
