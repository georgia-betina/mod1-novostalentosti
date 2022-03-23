package exercícios.GitHub.Estrutura_Sequencial;

import java.util.Scanner;

public class ex14_16 {
    public static void main(String[] args) {
        System.out.println("Qual é o tamanho em metros quadrados da área:");
        Scanner leitor = new Scanner(System.in);
        final float tamanho = leitor.nextFloat();
        leitor.close();

        double qtdeL = tamanho/3.0f;

        if (qtdeL < 18){
            System.out.println("Uma lata serve.");
        } else {
            double latas = qtdeL / 18;
            double valor = latas * 80.0f;
            System.out.println(String.format("Será necessário %.0f lata(s) e R$ %.2f reais para comprar as respectivas latas.", latas, valor));
        }
    }
}
