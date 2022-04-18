package Teams.d18_03;

import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        float saldoInicial = 0;
        System.out.println("Insira o valor do depósito:");
        Scanner leitor = new Scanner(System.in);
        final float deposito = leitor.nextFloat();

        System.out.println("Insira o valor do primeiro cheque:");
        Scanner leitor1 = new Scanner(System.in);
        final float cheque1 = leitor1.nextFloat();

        System.out.println("Insira o valor do segundo cheque:");
        Scanner leitor2 = new Scanner(System.in);
        final float cheque2 = leitor2.nextFloat();

        leitor.close();
        leitor1.close();
        leitor2.close();
        
        saldoInicial = saldoInicial + deposito;
        final float cPMF = 0.38f;

        double retirada1 = cheque1 * cPMF;
        retirada1 = saldoInicial - cheque1 - retirada1;

        double retirada2 = cheque2 * cPMF;
        retirada2 = retirada1 - cheque2 - retirada2;

        final double saldoFinal = retirada2;

        System.out.println(String.format("O valor do saldo final é: R$%.2f.", saldoFinal));

    }
}
