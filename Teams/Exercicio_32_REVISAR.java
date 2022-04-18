package teams;

import java.util.Scanner;

public class ex32 {
    public static void main(String[] args) {
        /*
        * Exercício 32) Faça um programa que receba três notas de um aluno, calcule
        * e mostre a média aritmética e a mensagem constante na tabela a seguir.
        * Aos alunos que ficaram para exame,  calcule e mostre a nota que deverão
        * tirar para serem aprovados, considerando que a média exigida é 7.0
        * Média Aritmética      Mensagem
        * 0,0    ●-------O     3,0      Reprovado
        * 3,0    ●-------O     7,0   Exame
        * 7,0    ●-------● 10,00 Aprovado
        */

        // ENTRADAS
        System.out.println("Digite a primeira nota:");
        Scanner leitor = new Scanner(System.in);
        final float primeiraNota = leitor.nextFloat();

        System.out.println("Digite a segunda nota:");
        final float segundaNota = leitor.nextFloat();

        System.out.println("Digite a terceira nota:");
        final float terceiraNota = leitor.nextFloat();
        leitor.close();

        // PROCESSAMENTO
        final double media = (primeiraNota + segundaNota + terceiraNota) / 3;

        if (media >= 7) {
            // SAÍDA
            System.out.println("Você foi aprovado(a).");
        } else if (media >= 3 & media <= 7) {
            final double mediaExame = 6 - media;
            // SAÍDA
            System.out.printf("Você está em exame e precisa tirar %.0f ponto(s).", mediaExame);
        } else if (media >= 0 & media <= 3) {
            // SAÍDA
            System.out.println("Você está reprovado(a).");
        }
    }
}
