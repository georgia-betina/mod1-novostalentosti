package exercícios.GitHub.Estrutura_Sequencial;

import java.util.Scanner;

public class ex15_16 {
    public static void main(String[] args) {
        System.out.println("Informe o seu salário bruto:");
        Scanner leitor = new Scanner(System.in);
        final float salarioinicial = leitor.nextFloat();
        leitor.close();

        final double porcento = salarioinicial * 0.1;
        final double descontoinicial = salarioinicial - porcento;

        final double porcento2 = descontoinicial * 0.05;
        final double descontofinal = descontoinicial - porcento2;

        System.out.println(String.format("Seu salário bruto é R$ %.2f e o líquido é R$ %.2f.", salarioinicial, descontofinal));
    }
}
