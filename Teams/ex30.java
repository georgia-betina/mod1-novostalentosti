package Teams.d21_03;

import java.util.Scanner;

public class ex30 {
    public static void main(String[] args) {
        System.out.println("Informe o valor do seu salário:");
        Scanner leitor = new Scanner(System.in);
        final float salario = leitor.nextFloat();
        leitor.close();

        if (salario < 500) {
            final float aumento = 0.3f;
            double novoSalario = salario * aumento;
            novoSalario = salario + novoSalario;
            System.out.println(String.format("Seu novo salário será de R$%.2f", novoSalario));
        } else {
            System.out.println("Você não tem direito ao aumento.");
        }
    }
}
