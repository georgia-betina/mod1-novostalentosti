package Teams.d21_03;

import java.util.Scanner;

public class ex28 {
    public static void main(String[] args) {
        System.out.println("Digite a sua idade:");
        Scanner leitor = new Scanner(System.in);
        final float idade = leitor.nextFloat();

        leitor.close();

        if (idade >= 18){
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
    }
}