package Teams.d17_03;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        System.out.println("Informe o valor do lado do quadrado:");
        Scanner leitor = new Scanner(System.in);
        final float lado = leitor.nextFloat();

        leitor.close();

        final double area = lado * lado;

        System.out.println(String.format("A área do quadrado é %.0f.", area));
    }
}
