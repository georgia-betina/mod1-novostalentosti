package Teams.d17_03;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        System.out.println("Informe o valor do produto:");
        Scanner leitor = new Scanner(System.in);
        final float valorinicial = leitor.nextFloat();
        leitor.close();

        double desconto = valorinicial * 0.1;
        desconto = valorinicial - desconto;

        System.out.println(String.format("O novo valor do produto, com desconto de 10%%, é R$ %.2f.", desconto));
    }
}
