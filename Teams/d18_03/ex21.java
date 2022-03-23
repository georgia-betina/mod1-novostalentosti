package Teams.d18_03;

import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        System.out.println("Insira o valor do salário:");
        Scanner leitor = new Scanner(System.in);
        final float salario = leitor.nextFloat();

        System.out.println("Insira o percentual de aumento (número inteiro):");
        Scanner leitor1 = new Scanner(System.in);
        final int percAumento = leitor1.nextInt();
        leitor.close();
        leitor1.close();

        final float percTransforma = (float)percAumento / 100;
        final double salarioAumento = percTransforma * salario;

        final double salarioFinal = salario + salarioAumento;

        System.out.println(String.format("O valor do aumento é R$ %.2f.%nO novo salário é R$ %.2f.", salarioAumento, salarioFinal));

    }
}
