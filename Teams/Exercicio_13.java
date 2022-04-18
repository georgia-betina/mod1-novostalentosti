package Teams;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        /*
        * Exercício 13) Faça um programa que calcule e mostre a
        * área de um trapézio. Sabe-se que: A=((base maior +
        * base menor) * altura)/2
        */

        // ENTRADAS
        System.out.println("Informe o valor da base maior do trapézio:");
        Scanner leitor = new Scanner(System.in);
        final float basemaior = leitor.nextFloat();

        System.out.println("Informe o valor da base menor do trapézio:");
        final float basemenor = leitor.nextFloat();

        System.out.println("Informe o valor da altura do trapézio:");
        final float altura = leitor.nextFloat();

        leitor.close();

        // PROCESSAMENTO
        final double calculoarea = ((basemaior + basemenor) * altura) / 2;

        // SAÍDA
        System.out.println(String.format("O valor da área do trapézio é %.0f.", calculoarea));
    }
}
