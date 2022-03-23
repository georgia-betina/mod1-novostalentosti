package exercícios.GitHub.Estrutura_de_Decisão;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        System.out.println("Informe o valor do primeiro lado:");
        Scanner leitor = new Scanner(System.in);
        final float lado1 = leitor.nextFloat();

        System.out.println("Informe o valor do segundo lado:");
        final float lado2 = leitor.nextFloat();

        System.out.println("Informe o valor do terceiro lado:");
        final float lado3 = leitor.nextFloat();

        leitor.close();

        if (lado1 < (lado2 + lado3) & lado2 < (lado1 + lado3) & lado3 < (lado1 + lado2)) {
            System.out.println("É um triângulo!");
            if ((lado1 == lado2) & (lado2 == lado3)) { // equilátero
                System.out.println("É um equilátero!");
            } else if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)) { // isósceles
                System.out.println("É um isósceles!");
            } else { // escaleno
                System.out.println("É um escaleno!");
            }
        } else {
            System.out.println("Não é um triângulo!");
        }
    }
}
