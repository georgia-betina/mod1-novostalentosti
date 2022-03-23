package Teams.d17_03;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        System.out.println("Digite apenas as horas (sem os minutos):");
        Scanner leitor = new Scanner(System.in);
        final int horas = leitor.nextInt();

        System.out.println("Digite apenas os minutos:");
        Scanner leitor1 = new Scanner(System.in);
        final int minutos = leitor1.nextInt();

        leitor.close();
        leitor1.close();

        final int horasMinutos = horas * 60;

        final int totalMinutos = horasMinutos + minutos;

        final int totalSegundos = totalMinutos * 60;

        System.out.println(String.format("As horas convertidas em minutos representam %d minutos.%nO total de minutos é %d.%nO total de minutos convertido em segundos é %d.", horasMinutos, totalMinutos, totalSegundos));
    }
}
