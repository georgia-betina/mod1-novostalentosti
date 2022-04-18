package Teams;

import java.util.Scanner;

public class Exercicio_09 {
    public static void main(String[] args) {
        /*
        * Exercício 9) Faça um programa que receba o preço de um produto,
        * calcule e mostre o novo preço, sabendo-se que esse sofreu um
        * desconto de 10%
        */

        // ENTRADA
        System.out.println("Informe o valor do produto:");
        Scanner leitor = new Scanner(System.in);
        final float valorinicial = leitor.nextFloat();
        leitor.close();

        // PROCESSAMENTO
        double desconto = valorinicial * 0.1;
        desconto = valorinicial - desconto;

        // SAÍDA
        System.out.println(String.format("O novo valor do produto, com desconto de 10%%, é R$ %.2f.", desconto));
    }
}
