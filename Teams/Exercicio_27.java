package teams;

import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {
        /*
        * Exercício 27) Faça um programa que receba a quantidade de dinheiro em
        * reais que uma pessoa que vai viajar possui. Essa pessoa vai passar por
        * vários países e precisa converter seu dinheiro em dólares, marco alemão
        * e libra esterlina. Sabe-se que a cotação do dólar é R$ 1,80 do marco
        * alemão R$2,00 e da libra esterlina de R$ 1,57. O programa deve fazer as
        * conversões e mostrá-las.
        */

        // ENTRADA
        System.out.println("Informe o valor que possui:");
        Scanner leitor = new Scanner(System.in);
        final float valorInicial = leitor.nextFloat();
        leitor.close();

        // PROCESSAMENTO
        final float dolar = 1.8f;
        final int marcoAlemao = 2;
        final float libraEsterlina = 1.57f;

        final double valorEmDolares = valorInicial / dolar;
        final double valorEmMarco = valorInicial / (float)marcoAlemao;
        final double valorEmLibraE = valorInicial / libraEsterlina;

        // SAÍDA
        System.out.println(String.format("O valor a ser convertido em dólares corresponde a R$%.2f%nO valor a ser convertido em marco alemão corresponde a R$%.2f%nO valor a ser convertido em libras esterlinas corresponde a R$%.2f", valorEmDolares, valorEmMarco, valorEmLibraE));
    }
}
