package teams;

import java.util.Scanner;

public class Exercicio_25 {
    public static void main(String[] args) {
        /*
        * Exercício 25) Um trabalhador recebeu seu salário e depositou em
        * sua conta corrente bancária. Esse trabalhador emitiu dois cheques
        * e agora deseja saber seu saldo atual. Sabe-se que cada operação
        * bancária de retirada paga CPMF de 0,38% e o saldo inicial da
        conta esta zerado. 
        */

        // ENTRADAS
        System.out.println("Insira o valor do depósito:");
        Scanner leitor = new Scanner(System.in);
        final float deposito = leitor.nextFloat();

        System.out.println("Insira o valor do primeiro cheque:");
        final float cheque1 = leitor.nextFloat();

        System.out.println("Insira o valor do segundo cheque:");
        final float cheque2 = leitor.nextFloat();

        leitor.close();
        
        // PROCESSAMENTO
        float saldoInicial = 0;
        saldoInicial = saldoInicial + deposito;
        final float cPMF = 0.38f;

        double retirada1 = cheque1 * cPMF;
        retirada1 = saldoInicial - cheque1 - retirada1;

        double retirada2 = cheque2 * cPMF;
        retirada2 = retirada1 - cheque2 - retirada2;

        final double saldoFinal = retirada2;

        // SAIDA
        System.out.println(String.format("O valor do saldo final é: R$%.2f.", saldoFinal));

    }
}
