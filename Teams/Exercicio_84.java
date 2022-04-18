package teams;

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

        i.    Efetuar depósito OK
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
        float[] saldo = new float[10];
        int codigoConta;
        float valorDeposito;
        String operacao = "null";
        boolean saida = false;
        float valorSaque;
        double ativoBancario = 0;

        for (int i = 0; i < codigosBanco.length; i++) {
            System.out.printf("Informe o código da sua conta: ");
            codigosBanco[i] = leitor.nextInt();
            saldo[i] = 0f;
        }

        while (saida == false) {
            System.out.printf("%nInforme a operação que deseja realizar:%ni. Efetuar depósito%nii. Efetuar saque%niii. Consultar o ativo bancário%niv. Finalizar o programa%n%nOperação: ");
            operacao = leitor.next();

            switch (operacao) {
                case "i":
                case "I":
                    System.out.printf("Informe o código da conta: ");
                    codigoConta = leitor.nextInt();

                    for (int i = 0; i < codigosBanco.length; i++) {
                        if (i == 9 && codigoConta != codigosBanco[i]) {
                            System.out.printf("Conta não encontrada. Retornando ao menu.%n");
                            break;
                        } else if (i !=9 && codigoConta == codigosBanco[i]) {
                            System.out.printf("Informe o valor a ser depositado: R$ ");
                            valorDeposito = leitor.nextFloat();
                            saldo[i] += valorDeposito;
                            System.out.printf("Depósito realizado com sucesso. Retornando ao menu.%n");
                            break;
                        }
                    }
                    break;
                case "ii":
                case "II":
                    System.out.printf("Informe o código da conta: ");
                    codigoConta = leitor.nextInt();

                    for (int i = 0; i < codigosBanco.length; i++) {
                        if (i == 9 && codigoConta != codigosBanco[i]) {
                            System.out.printf("Conta não encontrada. Retornando ao menu.%n");
                            break;
                        } else if (i != 9 && codigoConta == codigosBanco[i]) {
                            System.out.printf("Informe o valor do saque: R$ ");
                            valorSaque = leitor.nextFloat();

                            if (valorSaque <= saldo[i]) {
                                saldo[i] -= valorSaque;
                                System.out.printf("Saque realizado com sucesso. Retornando ao menu.%n");
                                break;
                            } else if (valorSaque > saldo[i]) {
                                System.out.printf("Saldo insuficiente. Retornando ao menu.%n");
                                break;
                            }
                        }
                    }
                    break;
                case "iii":
                case "III":
                case "Iii":
                case "IIi":
                case "iIi":
                case "iiI":
                case "iII":
                    for (int i = 0; i < codigosBanco.length; i++) {
                        ativoBancario += saldo[i];
                    }
                    System.out.printf("O ativo bancário é R$ %.2f. Retornando ao menu.%n", ativoBancario);
                    break;
                case "iv":
                case "Iv":
                case "iV":
                case "IV":
                    saida = true;
                    break;
                default:
                    System.out.printf("Operação inválida.%n");
                    break;
            }
        }
        
        leitor.close();
    }
}
