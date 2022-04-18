package Teams;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        /*
        * Exercício 20) Faça um programa que receba uma hora (uma
        * variável para hora e outra para minutos), calcule e mostre:
        *  - a hora digitada convertida em minutos;
        *  - o total dos minutos, ou seja, os minutos digitados mais
        * a conversão anterior;
        *  - o total dos minutos convertidos em segundos.
        */

        // ENTRADAS
        System.out.println("Digite apenas as horas (sem os minutos):");
        Scanner leitor = new Scanner(System.in);
        final int horas = leitor.nextInt();

        System.out.println("Digite apenas os minutos:");
        Scanner leitor1 = new Scanner(System.in);
        final int minutos = leitor.nextInt();

        leitor.close();

        // PROCESSAMENTO
        final int horasMinutos = horas * 60;

        final int totalMinutos = horasMinutos + minutos;

        final int totalSegundos = totalMinutos * 60;

        // SAÍDA
        System.out.println(String.format("As horas convertidas em minutos representam %d minutos.%nO total de minutos é %d.%nO total de minutos convertido em segundos é %d.", horasMinutos, totalMinutos, totalSegundos));
    }
}
