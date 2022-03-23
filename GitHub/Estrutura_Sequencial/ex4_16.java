package GitHub.Estrutura_Sequencial;

import java.lang.Math;
import java.util.Scanner;

public class ex4_16 {
    public static void main(String[] args) {
        System.out.println("Digite um primeiro número:");
        Scanner leitor = new Scanner(System.in);
        final int numero1 = leitor.nextInt();

        System.out.println("Digite um segundo número:");
        Scanner leitor2 = new Scanner(System.in);
        final int numero2 = leitor2.nextInt();

        leitor.close();
        leitor2.close();

        final double potencia = Math.pow(numero1, numero2);

        System.out.println(String.format("O resultado de " + numero1 + " elevado a " + numero2 + " é igual a " + potencia + "."));
    }
}
