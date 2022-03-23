package Teams.d23_03;

import java.util.Scanner;

public class Exercicio_36 {
    public static void main(String[] args) {
        System.out.printf("Informe o peso do pacote de ração em kg: ");
        Scanner leitor = new Scanner(System.in);
        final float pacoteRacaoKG = leitor.nextFloat();

        final int transformadorGramas = 1000;
        final float transformadorKG = 0.001f;
        final double pacoteRacaoG = pacoteRacaoKG * (float)transformadorGramas;

        System.out.printf("Informe a quantidade de ração (em gramas) oferecida por dia para o gato 1: ");
        final float qtdeRacaoGato1 = leitor.nextFloat();
        System.out.printf("Informe a quantidade de ração (em gramas) oferecida por dia para o gato 2: ");
        final float qtdeRacaoGato2 = leitor.nextFloat();

        leitor.close();

        final double qtdeRacaoTotalDia = qtdeRacaoGato1 + qtdeRacaoGato2;

        final int qtdeDias5 = 5;
        final double qtdeSobraG = pacoteRacaoG - (qtdeRacaoTotalDia * qtdeDias5);
        final double qtdeSobraKG = qtdeSobraG * transformadorKG;

        System.out.printf("Após 5 dias, sobrarão %.0fg de ração (ou %.2fkg).", qtdeSobraG, qtdeSobraKG);
    }
}
