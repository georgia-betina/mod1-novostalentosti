import java.util.Scanner;

public class Exercicio_53 {
    public static void main(String[] args) {
        /* Faça um UNICO programa em que receba o nome, o salário-base
        e o tempo de serviço de um funcionário. 
 
        Calcule e mostre TODOS os item abaixo em um UNICO PROGRAMA:
        a. O imposto que esta na tabela a seguir:
 
        Salário Base                                         |   % de imposto sobre Salário Base
        -----------------------------------------------------+----------------------------------------
        Menor R$200,00 (inclusive)                           |             Isento
        Maior que R$200,00 até R$ 450,00 (inclusive)         |             3%
        Entre R$450,00 e R$ 700,00                           |             8%
        Igual a R$ 700,00                                    |             10%
        Maior que R$ 700,00                                  |             12%
        */

        System.out.printf("Informe o seu nome: ");
        Scanner leitor = new Scanner(System.in);
        final String nomeUsuario = leitor.nextLine();

        System.out.printf("Informe o seu salário-base: R$ ");
        final float salarioBase = leitor.nextFloat();

        System.out.printf("Informe o seu tempo de serviço na empresa: ");
        final int tempoServico = leitor.nextInt();
        leitor.close();

        final float imposto3 = 0.03f;
        final float imposto8 = 0.08f;
        final float imposto10 = 0.1f;
        final float imposto12 = 0.12f;

        double aplicaImposto, novoSalario;

        if (salarioBase <= 200) {
            System.out.printf("Você está isento de imposto sobre o salário.");
        } else if (salarioBase > 200 && salarioBase <= 450) {
            aplicaImposto = salarioBase * imposto3;
            novoSalario = salarioBase - aplicaImposto;

            System.out.printf("Olá, %s, com %d ano(s) de serviço. Seu novo salário é de R$ %.2f.", nomeUsuario, tempoServico, novoSalario);
        } else if (salarioBase > 450 && salarioBase < 700) {
            aplicaImposto = salarioBase * imposto8;
            novoSalario = salarioBase - aplicaImposto;

            System.out.printf("Olá, %s, com %d ano(s) de serviço. Seu novo salário é de R$ %.2f.", nomeUsuario, tempoServico, novoSalario);
        } else if (salarioBase == 700) {
            aplicaImposto = salarioBase * imposto10;
            novoSalario = salarioBase - aplicaImposto;

            System.out.printf("Olá, %s, com %d ano(s) de serviço. Seu novo salário é de R$ %.2f.", nomeUsuario, tempoServico, novoSalario);
        } else if (salarioBase > 700) {
            aplicaImposto = salarioBase * imposto12;
            novoSalario = salarioBase - aplicaImposto;

            System.out.printf("Olá, %s, com %d ano(s) de serviço. Seu novo salário é de R$ %.2f.", nomeUsuario, tempoServico, novoSalario);
        } else {
            System.out.printf("Valor inválido. Encerrando operação...");
        }
    }
}
