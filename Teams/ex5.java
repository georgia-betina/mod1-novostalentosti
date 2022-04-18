package Teams.d17_03;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        System.out.println("Informe o seu peso em kg:");
        Scanner leitor = new Scanner(System.in);
        final float pesokg = leitor.nextFloat();
        leitor.close();

        final double pesogramas = pesokg * 1000;

        System.out.println(String.format("Seu peso em gramas é %.0fg.", pesogramas));
    }
}
