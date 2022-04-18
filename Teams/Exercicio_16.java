package teams;

import java.util.Scanner;

import javax.net.ssl.SSLPeerUnverifiedException;
import javax.sound.sampled.SourceDataLine;

public class Exercicio_16 {
    public static void main(String[] args) {
        /*
        * Exercício 16) Faça um programa que receba o valor do
        * salario mínimo e o valor do salário de um funcionário,
        * calcule e mostre a quantidade de salários mínimos que
        * esse funcionário ganha.
        */

        // ENTRADAS
        System.out.println("Informe o valor do seu salário:");
        Scanner leitor = new Scanner(System.in);
        final float salario = leitor.nextFloat();

        System.out.printf("Informe o valor do salário mínimo: R$ ");
        final float salariominimo = leitor.nextFloat();

        leitor.close();

        // PROCESSAMENTO
        final float diferencadesalarios = salario / salariominimo;

        // SAÍDA
        System.out.println(String.format("Você ganha %.2fx ", diferencadesalarios) + (diferencadesalarios>=0?"a mais":"a menos") + (" em relação ao salário mínimo de 2022."));
    }
}
