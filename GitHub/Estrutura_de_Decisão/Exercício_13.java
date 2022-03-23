package exercícios.GitHub.Estrutura_de_Decisão;

import java.util.Scanner;

public class Exercício_13 {
    public static void main(String[] args) {
        System.out.printf("Informe o tipo de combustível:%n%nA - Álcool%nG - Gasolina%n%nR: ");
        Scanner leitor = new Scanner(System.in);
        final String tipoCombustivel = leitor.nextLine();

        System.out.printf("%nInforme o número de litros: ");
        final float numeroLitros = leitor.nextFloat();

        float precoGasolina = 3.3f;
        float precoAlcool = 2.9f;

        double desconto = 0;

        final float descontoAlcool3 = 0.03f;
        final float descontoAlcool5 = 0.05f;

        final float descontoGasolina4 = 0.04f;
        final float descontoGasolina6 = 0.06f;

        double valorPago = 0;

        switch (tipoCombustivel) {
            case "A":
            case "a":
                if (numeroLitros <= 20) {
                    valorPago = precoAlcool * numeroLitros;
                    System.out.println(valorPago);
                    desconto = valorPago * descontoAlcool3;
                    System.out.println(desconto);
                    valorPago = valorPago - desconto;
                    System.out.println(valorPago);

                    System.out.printf("O valor a ser pago é R$ %.2f", valorPago);
                } else if (numeroLitros > 20) {
                    valorPago = precoAlcool * numeroLitros;
                    desconto = valorPago * descontoAlcool5;
                    valorPago = valorPago - desconto;

                    System.out.printf("O valor a ser pago é R$ %.2f", valorPago);
                } else {
                    System.out.println("Erro na operação. Caractere inválido.");
                }
                break;
            case "G":
            case "g":
                if (numeroLitros <= 20) {
                    valorPago = precoGasolina * numeroLitros;
                    desconto = valorPago * descontoGasolina4;
                    valorPago = valorPago - desconto;

                    System.out.printf("O valor a ser pago é R$ %.2f", valorPago);
                } else if (numeroLitros > 20) {
                    valorPago = precoGasolina * numeroLitros;
                    desconto = valorPago * descontoGasolina6;
                    valorPago = valorPago - desconto;

                    System.out.printf("O valor a ser pago é R$ %.2f", valorPago);
                }
                break;
            default:
                System.out.println("Erro na operação. Caractere inválido.");
                break;
        }

        leitor.close();
    }
}
