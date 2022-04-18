package teams;

import java.util.Scanner;

public class Exercicio_11 {
    public static void main(String[] args) {
        /*
        * Exercício 11) Faça um programa que receba o peso de uma pessoa,
        * calcule e mostre:
        * - o novo peso, se a pessoa engordar 15% sobre o peso digitado;
        * - o novo peso, se a pessoa emagrecer 20% sobre o peso digitado.
        */

        // ENTRADAS
        System.out.println("Por favor, insira o valor do seu peso em kg:");
        Scanner leitor = new Scanner(System.in);
        final float peso = leitor.nextFloat();
        leitor.close();

        // PROCESSAMENTO
        double aumento15 = peso * 0.15;
        aumento15 = peso + aumento15;

        double emagrece20 = peso * 0.2;
        emagrece20 = peso - emagrece20;

        // SAÍDA
        System.out.println(String.format("Se você engordar 15%% do peso atual, ficará com %.1fkg. Se emagrecer 20%%, ficará com %.1fkg.", aumento15, emagrece20));
    }
}
