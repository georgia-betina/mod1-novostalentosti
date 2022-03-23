package exercícios.Teams.d18_03;

import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {
        System.out.println("Informe o valor que possui:");
        Scanner leitor = new Scanner(System.in);
        final float valorInicial = leitor.nextFloat();
        leitor.close();

        final float dolar = 1.8f;
        final int marcoAlemao = 2;
        final float libraEsterlina = 1.57f;

        final double valorEmDolares = valorInicial / dolar;
        final double valorEmMarco = valorInicial / (float)marcoAlemao;
        final double valorEmLibraE = valorInicial / libraEsterlina;

        System.out.println(String.format("O valor a ser convertido em dólares corresponde a R$%.2f%nO valor a ser convertido em marco alemão corresponde a R$%.2f%nO valor a ser convertido em libras esterlinas corresponde a R$%.2f", valorEmDolares, valorEmMarco, valorEmLibraE));
    }
}
