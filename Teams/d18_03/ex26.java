package exercícios.Teams.d18_03;

import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        System.out.println("Informe o valor do salário mínimo:");
        Scanner leitor = new Scanner(System.in);
        final float salarioMin = leitor.nextFloat();

        System.out.println("Informe o consumo em quilowatts:");
        Scanner leitor1 = new Scanner(System.in);
        final float consumo = leitor1.nextFloat();

        leitor.close();
        leitor1.close();

        final double valordQw = salarioMin / 5;
        final double valorpPagar = valordQw * consumo;
        final float desconto = 0.15f;
        double valorcDesconto = valorpPagar * desconto;
        valorcDesconto = valorpPagar - valorcDesconto;

        System.out.println(String.format("O valor de cada quilowatt é R$%.2f;%nO valor em reais a ser pago é R$%.2f;%nO valor em reais a ser pago com desconto de 15%% é R$%.2f.", valordQw, valorpPagar, valorcDesconto));

    }
}
