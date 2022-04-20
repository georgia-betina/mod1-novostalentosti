package teams;

import java.util.Scanner;

public class Exercicio_60 {
    public static void main(String[] args) {
        /* 60) Elaborar um programa que efetue a leitura
        de 10 valores numéricos e apresente no final o
        total do somatório e a média do total. */
        
        Scanner leitor = new Scanner(System.in);
        int contaAte10;
        double media = 0;
        for (contaAte10 = 1; contaAte10 <= 10; contaAte10++) {
            System.out.printf("Informe o valor do número %d: ", contaAte10);
            float numero = leitor.nextFloat();
            media += numero;
        }
        leitor.close();

        contaAte10--;
        media = media / contaAte10;

        System.out.printf("A média das notas é: %.1f", media);
    }
}
