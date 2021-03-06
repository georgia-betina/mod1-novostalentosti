package teams;

import java.util.Scanner;

public class Exercicio_31 {
    public static void main(String[] args) {
        /*
        * Exercício 31) Faça um programa que mostre o menu de opções a seguir,
        * receba a opção do usuário e os dados necessários para executar cada
        * operação.
        * Menu de opções:
        * 1. Somar dois números
        * 2. Raiz quadrada de um número
        * Solicite ao usuário digitar a opção desejada.
        */

        System.out.printf("Digite um número para selecionar uma das opções a seguir:%n%n1. Somar dois números;%n2. Raiz quadrada de um número.%nR: ");
        Scanner leitor = new Scanner(System.in);
        final int digito = leitor.nextInt();

        switch (digito) {
            case 1:
                System.out.println("Digite o primeiro número:");
                final float numero1 = leitor.nextFloat();
                
                System.out.println("Digite o segundo número:");
                final float numero2 = leitor.nextFloat();

                final double soma = numero1 + numero2;

                System.out.printf("%.0f + %.0f = %.0f", numero1, numero2, soma);
                break;
            case 2:
                System.out.println("Digite um número:");
                final int numeroRaiz = leitor.nextInt();

                final double raiz = Math.sqrt(numeroRaiz);
                System.out.printf("A raiz de %d é %.0f", numeroRaiz, raiz);
                break;

            default:
            System.out.println("Não foi possível compreender sua entrada.");
        }
        leitor.close();
    }
}
