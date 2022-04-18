package teams;

import java.util.Scanner;

public class Exercicio_30 {
    public static void main(String[] args) {
        /*
        * Exercício 30) Uma empresa decide dar um aumento de 30% aos funcionários
        * com salários inferiores a R$ 500,00. Faça um programa que receba o salário
        * do funcionário e mostre o valor do salário reajustado ou uma mensagem caso
        * ele não tenha direito ao aumento. 
        */

        // ENTRADA
        System.out.println("Informe o valor do seu salário:");
        Scanner leitor = new Scanner(System.in);
        final float salario = leitor.nextFloat();
        leitor.close();

        // PROCESSAMENTO
        if (salario < 500) {
            final float aumento = 0.3f;
            double novoSalario = salario * aumento;
            novoSalario = salario + novoSalario;
            // SAÍDA
            System.out.println(String.format("Seu novo salário será de R$%.2f", novoSalario));
        } else {
            // SAÍDA
            System.out.println("Você não tem direito ao aumento.");
        }
    }
}
