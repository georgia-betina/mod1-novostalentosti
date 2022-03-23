package exercícios.GitHub.Estrutura_de_Decisão;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        System.out.println("Informe um ano:");
        Scanner leitor = new Scanner(System.in);
        final float anoEscolhido = leitor.nextFloat();

        if ((anoEscolhido % 4) == 0 & (anoEscolhido % 100) != 0) {
            System.out.println("O ano é bissexto.");
        } else if (anoEscolhido % 4 == 0 & anoEscolhido % 100 == 0 & anoEscolhido % 400 == 0){
            System.out.println("O ano é bissexto.");
        } else if (anoEscolhido % 4 != 0 | anoEscolhido % 400 != 0) {
            System.out.println("O ano não é bissexto.");
        }

        leitor.close();
    }
}
