package Teams.d13_04;

import java.util.Scanner;

public class Exercicio_84 {
    public static void main(String[] args) {
        /* 84)Faça um programa que simule um controle bancário.
        Para tanto, devem ser lidos os códigos de dez contas e
        os seus respectivos saldos. Os códigos devem ser
        armazenados em um vetor de números inteiros (não pode
        haver mais que uma conta com o mesmo código) e os saldos
        devem ser armazenados em um vetor de números reais. O
        saldo deverá ser cadastrado na mesma posição do código.
        Por exemplo, se a conta 504 for armazenada na quinta
        posição do vetor de saldos. Depois de fazer a leitura
        dos valores, mostrar o seguinte menu na tela:

        i.    Efetuar depósito
        ii.    Efetuar saque
        iii.    Consultar o ativo bancário (ou seja, o somatório
        dos saldos de todos os clientes)
        iv.    Finalizar o programa

        Para efetuar depósito deve-se solicitar o código da
        conta e o valor a ser depositado. Se a conta não estiver
        cadastrada, mostrar a mensagem Conta não encontrada e
        voltar ao menu. Se a conta existir, atualizar o seu saldo.
        Para efetuar saque deve-se solicitar o código da conta e o
        valor a ser sacado. Se a conta não estiver cadastrada,
        mostrar a mensagem Conta não encontrada e voltar ao menu.
        Se a conta existir, verificar se o seu saldo é suficiente
        para cobrir o saque. (Estamos supondo que a conta não pode
        ficar com o saldo negativo). Se o saldo for suficiente,
        realizar o saque e voltar ao menu. Caso contrário mostrar
        a mensagem Saldo insuficiente e voltar ao menu.

        Para consultar o ativo bancário deve-se somar o saldo de
        todas as contas do banco. Depois de mostrar esse valor,
        voltar ao menu.
        O programa só termina quando for digitada a opção 4 –
        Finalizar o programa. */

        Scanner leitor = new Scanner(System.in);
        int[] codigosBanco = new int[10];
        int codigoConta;
        float valorDeposito;
        String operacao = "null";

        for (int i = 0; i < codigosBanco.length; i++) {
            System.out.printf("Informe o código da sua conta: ");
            codigosBanco[i] = leitor.nextInt();
        }

        while (operacao != "iv") {
            System.out.printf("Informe a operação que deseja realizar:%ni. Efetuar depósito%nii. Efetuar saque%niii. Consultar o ativo bancário%niv. Finalizar o programa");
            operacao = leitor.nextLine();

            switch (operacao) {
                case "i":
                    System.out.printf("Informe o código da conta: ");
                    codigoConta = leitor.nextInt();

                    System.out.printf("Informe o valor a ser depositado: ");
                    valorDeposito = leitor.nextFloat();
                    break;
                
            }
        }
        
        leitor.close();
    }
}
