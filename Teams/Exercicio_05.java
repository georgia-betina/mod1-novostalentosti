package teams;

import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        /*
        * Exercício 5) Construa um programa que mostre o percentual que uma
        * despesa mensal representa do seu salário total.
        */

        // ENTRADAS
        System.out.println("Olá, querido usuário. Primeiro, acrescente o valor líquido do seu sálario:");
        Scanner leitor = new Scanner(System.in);
        final float salario = leitor.nextFloat();

        System.out.println("Agora, coloque o valor da sua despesa do mês:");
        final float despesa = leitor.nextFloat();

        leitor.close();

        // PROCESSAMENTO
        final float porcento = ((despesa * 100) / salario);

        // SAÍDA
        System.out.println(String.format("O percentual da despesa mensal do seu salário é de %.1f%%.", porcento));
    }
}
