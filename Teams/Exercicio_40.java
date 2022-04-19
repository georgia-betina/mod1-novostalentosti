package teams;

import java.util.Scanner;

public class Exercicio_40 {
    public static void main(String[] args) {
        /*
        * Exercício 40) Escreva um algoritmo que solicite a quantidade total
        * em miligramas de colesterol mau existente no sangue de um paciente.
        * Considerando que o valor máximo ideal para uma pessoa saudável é
        * 130mg, caso a quantidade esteja menor apresente uma mensagem
        * indicando que esta menor. Caso esteja acima, calcule o percentual
        * que esta acima e apresente uma mensagem.
        */

        System.out.printf("Informe a quantidade total de colesterol em mg: ");
        Scanner leitor = new Scanner(System.in);
        final float qtdeColesterol = leitor.nextFloat();
        leitor.close();

        final int valorIdeal = 130;

        if (qtdeColesterol <= valorIdeal) {
            System.out.printf("A quantidade de colesterol presente no sangue está ideal.");
        } else if (qtdeColesterol > valorIdeal) {
            final int porCento = 100;
            final double percentualAcima = ((qtdeColesterol * (float)porCento) / (float)valorIdeal) - porCento;
            System.out.printf("Você possui %.0f%% de colesterol acima do valor ideal no sangue.", percentualAcima);
        }
    }
}
