package exercícios.Teams.d17_03;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        System.out.println("Informe o valor do seu salário:");
        Scanner leitor = new Scanner(System.in);
        final float salario = leitor.nextFloat();

        System.out.println("Informe o valor da primeira conta atrasada:");
        Scanner leitor1 = new Scanner(System.in);
        final float conta1 = leitor1.nextFloat();

        System.out.println("Informe o valor da segunda conta atrasada:");
        Scanner leitor2 = new Scanner(System.in);
        final float conta2 = leitor2.nextFloat();

        leitor.close();
        leitor1.close();
        leitor2.close();

        final float multa = 0.02f;
        double atrasoconta1 = conta1 * multa;
        atrasoconta1 = conta1 + atrasoconta1;

        double atrasoconta2 = conta2 * multa;
        atrasoconta2 = conta2 + atrasoconta2;

        final double resto = salario - atrasoconta1 - atrasoconta2;

        System.out.println(String.format("O resto será R$ %.2f.", resto));
    }
}
