package teams;

import java.util.Scanner;

public class Exercicio_83 {
    public static void main(String[] args) {
        /* 83) Faça um programa que receba a temperatura média de cada
        mês do ano e armazene-as em um vetor. Calcule e mostre a maior
        e a menor temperatura do ano e em que mês elas ocorreram (mostrar
        o mês por extenso: 1- Janeiro, 2 – Fevereiro). Desconsidere empates. */

        // NAO CONTA TEMPERATURAS IGUAIS

        String[] mesesDoAno = new String[]{"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        Scanner leitor = new Scanner(System.in);
        int[] temperaturaEntrada = new int[14];
        int contador = 0;
        float maiorTemperatura = 0;
        float menorTemperatura = 0;
        int contaMesMaior = 0;
        int contaMesMenor = 0;

        for (int i = 0; i < 12; i++) {
            System.out.printf("Informe a temperatura média do mês de %s: ", mesesDoAno[i]);
            if (contador == 0) {
                temperaturaEntrada[i] = leitor.nextInt();
                maiorTemperatura = temperaturaEntrada[i];
                menorTemperatura = temperaturaEntrada[i];
                contador++;
                contaMesMaior = contador;
                contaMesMenor = contador;
            } else if (contador != 0) {
                temperaturaEntrada[i] = leitor.nextInt();
                contador++;
                maiorTemperatura = Math.max(maiorTemperatura, temperaturaEntrada[i]);
                menorTemperatura = Math.min(menorTemperatura, temperaturaEntrada[i]);
                if (maiorTemperatura == temperaturaEntrada[i]) {
                    contaMesMaior = contador;
                } else if (menorTemperatura == temperaturaEntrada[i]) {
                    contaMesMenor = contador;
                }
            }
        }

        System.out.println("Maior temperatura: " + maiorTemperatura + " mes da temperatura: " + contaMesMaior + "| Menor temperatura: " + menorTemperatura + " mes da temperatura: " + contaMesMenor);

        leitor.close();

        System.out.printf("A maior temperatura ocorreu no mês %d - %s, temperatura %d ° C e a menor temperatura ocorreu no mês %d - %s, temperatura %d ° C.", contaMesMaior, mesesDoAno[contaMesMaior], temperaturaEntrada[contaMesMaior], contaMesMenor, mesesDoAno[contaMesMenor], temperaturaEntrada[contaMesMenor]);
    }
}
