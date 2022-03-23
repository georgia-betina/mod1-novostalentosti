package Teams.d23_03;

import java.util.Scanner;

public class Exercicio_37 {
    public static void main(String[] args) {
        System.out.printf("Informe o valor do seu salário: R$ ");
        Scanner leitor = new Scanner(System.in);
        final float salarioBase = leitor.nextFloat();

        System.out.printf("Informe o seu código de acordo com as opções a seguir:%n1 - Escrituário;%n2 - Secretário%n3 - Caixa;%n4 - Gerente;%n5 - Diretor.%n%nCódigo: ");
        final int codigoInserido = leitor.nextInt();
        leitor.close();

        final float percentualEscrituario50 = 0.5f;
        final float percentualSecretario35 = 0.35f;
        final float percentualCaixa20 = 0.2f;
        final float percentualGerente10 = 0.1f;
        final int percentualDiretor0 = 0;

        double aplicaPercentual, salarioFinal;

        String cargo = "";

        switch (codigoInserido){
            case 1: // Escrituário
                cargo = cargo.replace("", "escrituário");
                aplicaPercentual = salarioBase * percentualEscrituario50;
                salarioFinal = salarioBase + aplicaPercentual;

                System.out.printf("Seu cargo é %s, portanto, o valor do aumento é de R$ %.2f. Seu novo salário será de R$ %.2f", cargo, aplicaPercentual, salarioFinal);
                break;
            case 2: // Secretário
                cargo = cargo.replace("", "secretário");
                aplicaPercentual = salarioBase * percentualSecretario35;
                salarioFinal = salarioBase + aplicaPercentual;

                System.out.printf("Seu cargo é %s, portanto, o valor do aumento é de R$ %.2f. Seu novo salário será de R$ %.2f", cargo, aplicaPercentual, salarioFinal);
                break;
            case 3: // Caixa
                cargo = cargo.replace("", "caixa");
                aplicaPercentual = salarioBase * percentualCaixa20;
                salarioFinal = salarioBase + aplicaPercentual;

                System.out.printf("Seu cargo é %s, portanto, o valor do aumento é de R$ %.2f. Seu novo salário será de R$ %.2f", cargo, aplicaPercentual, salarioFinal);
                break;
            case 4: // Gerente
                cargo = cargo.replace("", "gerente");
                aplicaPercentual = salarioBase * percentualGerente10;
                salarioFinal = salarioBase + aplicaPercentual;

                System.out.printf("Seu cargo é %s, portanto, o valor do aumento é de R$ %.2f. Seu novo salário será de R$ %.2f", cargo, aplicaPercentual, salarioFinal);
                break;
            case 5: // Diretor
                cargo = cargo.replace("", "diretor");
                aplicaPercentual = salarioBase * percentualDiretor0;
                salarioFinal = salarioBase + aplicaPercentual;

                System.out.printf("Seu cargo é %s, portanto, o valor do aumento é de R$ %.2f. Seu novo salário será de R$ %.2f", cargo, aplicaPercentual, salarioFinal);
                break;
            default:
                System.out.printf("Não foi possível compreender a entrada. Encerrando operação.");
        }
    }
}
