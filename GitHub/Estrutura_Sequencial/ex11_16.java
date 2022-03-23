package exercícios.GitHub.Estrutura_Sequencial;

import java.util.Scanner;

public class ex11_16 {
    public static void main(String[] args) {
        System.out.println("Forneça a sua idade em anos:");
        Scanner leitor = new Scanner(System.in);
        final int idadeanos = leitor.nextInt();
        leitor.close();

        final int diasdoano = 365;

        //final int mesesdoano = 12;

        //final int mesesdaidade = idadeanos * mesesdoano;

        final int diasdaidade = diasdoano * idadeanos;

        System.out.println(String.format("A sua idade em dias é %d dias.", diasdaidade));
    }
}
