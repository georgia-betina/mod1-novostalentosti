package teams;

import java.util.Scanner;

public class Exercicio_42 {
    public static void main(String[] args) {
        /* Escreva um algoritmo que calcule o valor da multa (em UFIR)
        que um motorista deve receber de acordo com a velocidade de seu
        carro. Acima de 60km/h e ate 100km/h multa media 60 UFIR, acima
        de 100 km/h até 160km/h grave 120 UFIR, e acima de 160km/h
        gravíssima 180 UFIR */

        System.out.printf("Informe a velocidade do seu carro no momento da autuação: ");
        Scanner leitor = new Scanner(System.in);
        final float velocidadeAutomovel = leitor.nextFloat();
        leitor.close();

        final String multaMedia = "Multa média, 60 UFIR.";
        final String multaGrave = "Multa grave, 120 UFIR.";
        final String multaGravissima = "Multa gravíssima, 180 UFIR.";

        if (velocidadeAutomovel > 60 && velocidadeAutomovel <= 100) {
            System.out.printf(multaMedia);
        } else if (velocidadeAutomovel > 100 && velocidadeAutomovel <= 160) {
            System.out.printf(multaGrave);
        } else if (velocidadeAutomovel > 160) {
            System.out.printf(multaGravissima);
        }
    }
}
