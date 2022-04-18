package Teams.d07_04;

//import java.util.Arrays;
import java.util.Scanner;

public class Exercicio_72 {
    public static void main(String[] args) {
        /*
         * 72) Faça um programa que receba dez números
         * e armazene em uma lista. Em seguida percorra
         * toda a lista mostrando apenas os números que
         * cujo valor seja superior a 10.
         */

        int[] listaNumeros = new int[10];

        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero");
            listaNumeros[i] = Integer.parseInt(leitor.nextLine());
        }

        leitor.close();

        System.out.printf("Os números maiores que 10 são: ");
        for (int j = 0; j < 10; j++) {
            if (listaNumeros[j] > 10) { // filtro
                System.out.printf("%d ", listaNumeros[j]);
            } 
        }
    }
}
