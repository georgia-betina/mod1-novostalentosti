package exercícios.GitHub.Estrutura_de_Decisão;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        System.out.println("Informe a primeira nota:");
        Scanner leitor = new Scanner(System.in);
        final int nota1 = leitor.nextInt();

        System.out.println("Informe a segunda nota:");
        final int nota2 = leitor.nextInt();

        System.out.println("Informe a terceira nota:");
        final int nota3 = leitor.nextInt();

        System.out.println("Informe a quarta nota:");
        final int nota4 = leitor.nextInt();

        final double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("A sua média foi %.1f. ", media);

        if (media >= 7) {
            System.out.printf("Você foi aprovado(a)!");
        } else if (media < 7) {
            System.out.printf("Você ficou em exame. Por favor, insira a nota do exame: %n");
            final float notaExame = leitor.nextFloat();
            final double novaMedia = (media + notaExame) / 2;
            if (novaMedia >= 5) {
                System.out.printf("Você foi aprovado(a)!");
            } else if (novaMedia < 5) {
                System.out.printf("Você foi reprovado(a)!");
            }
        }
        leitor.close();
    }
}
