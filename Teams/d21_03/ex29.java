package exercícios.Teams.d21_03;

import java.util.Scanner;

public class ex29 {
    public static void main(String[] args) {
        System.out.println("Digite um número");
        Scanner leitor = new Scanner(System.in);
        final float numero = leitor.nextFloat();
        leitor.close();

        if (numero%2 == 0) {
            System.out.println("Seu número é par!");
        } else {
            System.out.println("Seu número é ímpar!");
        }
    }
}
