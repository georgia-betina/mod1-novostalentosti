package Teams.d13_04;

import java.util.Scanner;

public class e84_em_partes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] codigosBanco = new int[5];

        for (int i = 0; i < codigosBanco.length; i++) {
            System.out.printf("Informe o código dos bancos: ");
            codigosBanco[i] = leitor.nextInt();
        }

        int codigoConta;
        float valorDeposito;
        float saldo = 0;
        boolean saida = false;
        String operacao = null;

        do {
            System.out.printf("Informe a operação que deseja realizar:%ni. Efetuar depósito%niv. Finalizar o programa%n%n");
            operacao = leitor.next();

            if (saida == false) {
                switch (operacao) {
                    case "i":
                    case "I":
                        System.out.printf("Informe o código da conta: ");
                        codigoConta = leitor.nextInt();
    
                        for (int i = 0; i < codigosBanco.length; i++) {
                            if (codigoConta != codigosBanco[i]) {
                                System.out.printf("Conta não encontrada. Retornando ao menu...%n%n");
                                break;
                            } else {
                                System.out.printf("Informe o valor a ser depositado: ");
                        valorDeposito = leitor.nextFloat();
                        saldo = valorDeposito;
    
                        System.out.println(saldo);
                            }
                        }
    
                        
                        break;
                    case "iv":
                    case "Iv":
                    case "iV":
                    case "IV":
                        saida = true;
                        break; 
                }
            }            
        } while (saida == false);

        leitor.close();
    }
}
