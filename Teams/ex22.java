package Teams.d18_03;

import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        System.out.println("Informe o seu salário-base:");
        Scanner leitor = new Scanner(System.in);
        final float salario = leitor.nextFloat();
        leitor.close();

        final int gratificacao = 50;
        final float imposto = 0.1f;

        double impostoRetira = (salario * imposto);
        impostoRetira = salario - impostoRetira;

        final double salarioFinal = impostoRetira + (float)gratificacao;

        System.out.println(String.format("O valor do salário final será R$ %.2f.", salarioFinal));
    }
}
