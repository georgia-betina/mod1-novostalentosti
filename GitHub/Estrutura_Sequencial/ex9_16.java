package GitHub.Estrutura_Sequencial;

import java.util.Scanner;

public class ex9_16 {
    public static void main(String[] args) {
        System.out.println("Forneça a distância total percorrida:");
        Scanner leitor = new Scanner(System.in);
        final float distancia = leitor.nextFloat();

        System.out.println("Agora, forneça o total de combustível gasto:");
        Scanner leitor1 = new Scanner(System.in);
        final float combustivel = leitor1.nextFloat();

        leitor.close();
        leitor1.close();

        final double consumo = distancia / combustivel;

        System.out.println(String.format("O consumo médio gasto é 1L para cada %.0fkm.", consumo));
    }
}
