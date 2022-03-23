package Teams.d17_03;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        System.out.println("Por favor, insira o valor do seu peso em kg:");
        Scanner leitor = new Scanner(System.in);
        final float peso = leitor.nextFloat();
        leitor.close();

        double aumento15 = peso * 0.15;
        aumento15 = peso + aumento15;

        double emagrece20 = peso * 0.2;
        emagrece20 = peso - emagrece20;

        System.out.println(String.format("Se você engordar 15%% do peso atual, ficará com %.1fkg. Se emagrecer 20%%, ficará com %.1fkg.", aumento15, emagrece20));
    }
}
