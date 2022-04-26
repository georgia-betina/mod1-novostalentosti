package GitHub.Estrutura_de_Repetição;

import java.util.Scanner;

public class Exercicio_11 {
    public static void main(String[] args) {
        /*
        * Exercício 11) Um determinado material radioativo perde metade de sua
        * massa a cada 50 segundos. Dada a massa inicial, em gramas, faça um
        * programa que determine o tempo necessário para que essa massa se torne
        * menor que 0,05 gramas.
        */

        Scanner leitor = new Scanner(System.in);
        System.out.printf("Informe a massa inicial em gramas: ");
        float massaInicial = leitor.nextFloat();

        int tempo = 0;

        leitor.close();

        while (massaInicial > 0.05) {
            massaInicial /= 2;
            tempo += 50;
        }
        
        System.out.printf("Será necessário %d segundos para que a massa se torne menor que 0.05g.", tempo);
    }
}
