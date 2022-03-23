package exercícios.GitHub.Estrutura_de_Decisão;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        System.out.println("Informe o valor de a:");
        Scanner leitor = new Scanner(System.in);
        final float valorA = leitor.nextFloat();

        if (valorA == 0) {
            System.out.println("A equação não é do segundo grau. Encerrando operação.");
        } else {

        System.out.println("Informe o valor de b:");
        final float valorB = leitor.nextFloat();

        System.out.println("Informe o valor de c:");
        final float valorC = leitor.nextFloat();

        double delta = (Math.pow(valorB, 2)) - (4 * valorA * valorC);

        double formulaBhaskaraPositivo = ((- valorB) + (Math.sqrt(delta))) / (2 * valorA);
        double formulaBhaskaraNegativo = ((- valorB) - (Math.sqrt(delta))) / (2 * valorA);

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais. Encerrando operação.");
        } else if (delta == 0) {
            System.out.printf("Ambas as raízes são iguais. Seu valor é %.0f.", formulaBhaskaraPositivo);
        } else if (delta > 0) {
            System.out.printf("As raízes são %.1f e %.1f.", formulaBhaskaraNegativo, formulaBhaskaraPositivo);
        }
        }
        leitor.close();
    }
}
