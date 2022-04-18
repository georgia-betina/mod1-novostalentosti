package Teams.d17_03;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        System.out.println("Informe o valor do seu salário:");
        Scanner leitor = new Scanner(System.in);
        final float salario = leitor.nextFloat();

        leitor.close();

        final float salariominimo2022 = 1212.0f;
        final float diferencadesalarios = salario / salariominimo2022;

        System.out.println(String.format("Você ganha %.2fx ", diferencadesalarios) + (diferencadesalarios>=0?"a mais":"a menos") + (" em relação ao salário mínimo de 2022."));
    }
}
