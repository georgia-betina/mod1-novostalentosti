package Teams.d28_03;

import java.util.Scanner;

public class Exercicio_46 {
    public static void main(String[] args) {
        /* Construa um algoritmo que calcule o consumo de combustível
        de um veículo qualquer baseado nas informações de quilometragem 
        inicial e final de um percurso, e a quantidade de gasolina consumida
        em litros. Caso o consumo esteja entre 10 e 16 litros/km mostre a
        mensagem “consumo normal”, caso seja maior que 16 litros/km apresente
        a mensagem “consumo anormal”. */

        System.out.printf("Insira o valor da quilometragem inicial: ");
        Scanner leitor = new Scanner(System.in);
        final float quilometragemInicial = leitor.nextFloat();

        System.out.printf("Insira o valor da quilometragem final: ");
        final float quilometragemFinal = leitor.nextFloat();

        System.out.printf("Insira a quantidade de gasolina consumida (em L): ");
        final float qtdeGasolina = leitor.nextFloat();

        leitor.close();

        final double calculaConsumo = (quilometragemFinal - quilometragemInicial) / qtdeGasolina;

        if (calculaConsumo >= 10 && calculaConsumo <= 16) {
            System.out.printf("O consumo está normal.");
        } else if (calculaConsumo > 16) {
            System.out.printf("O consumo está anormal.");
        }
    }
}
