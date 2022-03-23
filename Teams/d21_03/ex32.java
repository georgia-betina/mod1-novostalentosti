package exercícios.Teams.d21_03;

import java.util.Scanner;

public class ex32 {
    public static void main(String[] args) {
        System.out.println("Digite a primeira nota:");
        Scanner leitor = new Scanner(System.in);
        final float primeiraNota = leitor.nextFloat();

        System.out.println("Digite a segunda nota:");
        Scanner leitor1 = new Scanner(System.in);
        final float segundaNota = leitor1.nextFloat();

        System.out.println("Digite a terceira nota:");
        Scanner leitor2 = new Scanner(System.in);
        final float terceiraNota = leitor2.nextFloat();
        leitor.close();
        leitor1.close();
        leitor2.close();

        final double media = (primeiraNota + segundaNota + terceiraNota) / 3;

        if (media >= 7) {
            System.out.println("Você foi aprovado(a).");
        } else if (media >= 3 & media <= 7) {
            final double mediaExame = 6 - media;
            System.out.printf("Você está em exame e precisa tirar %.0f ponto(s).", mediaExame);
        } else if (media >= 0 & media <= 3) {
            System.out.println("Você está reprovado(a).");
        }
    }
}
