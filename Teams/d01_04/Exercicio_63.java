package Teams.d01_04;

import java.util.Scanner;

public class Exercicio_63 {
    public static void main(String[] args) {
        /* 63) Faça um programa que receba vários números, calcule e mostre:
        - a soma dos números digitados;
        - a quantidade de números digitados;
        - a média dos números digitados;
        - o maior número digitado;
        - o menor número digitado;
        - a média dos números pares;
        - a porcentagem dos números ímpares entre todos os números digitados.
        Finalize a entrada de dados com a digitação do número 30000. */

        Scanner leitor = new Scanner(System.in);
        float entradaNumero = 0;
        int contadorTotal = 0;
        int contaImpares = 0;
        int contaPares = 0;
        double soma = 0;
        double somaParaMedia = 0;
        int somaPares = 0;
        double maiorEntrada = 0;
        double menorEntrada = 0;
        int contadorParaMaiorMenor = 0;

        do {
            System.out.printf("Digite um número para gravar e 30000 para sair: ");
            entradaNumero = leitor.nextFloat();
            if (entradaNumero != 30000) {
                soma += entradaNumero;

                if (contadorParaMaiorMenor == 0) {
                    maiorEntrada = entradaNumero;
                    menorEntrada = entradaNumero;
                    contadorParaMaiorMenor++;
                } else if (contadorParaMaiorMenor != 0) {
                    maiorEntrada = Math.max(maiorEntrada, entradaNumero);
                    menorEntrada = Math.min(menorEntrada, entradaNumero);
                }

                entradaNumero = Math.abs(entradaNumero);

                somaParaMedia += entradaNumero;
                if (entradaNumero % 2 == 0 && entradaNumero > 0) {
                    somaPares += entradaNumero;
                    contaPares++;
                } else if (entradaNumero % 2 != 0) {
                    contaImpares++;
                }
                contadorTotal++;
            }
        } while (entradaNumero != 30000);
        leitor.close();

        final double mediaTotal = somaParaMedia / contadorTotal;
        final int mediaPares = somaPares / contaPares;
        final double porcentagemImpares = (contaImpares * (float)100) / contadorTotal;

        System.out.printf("A soma dos números digitados é %.2f%nA quantidade de números digitados é %d%nA média dos números digitados é %.2f%nO maior número digitado foi %.2f%nO menor número digitado foi %.2f%nA média dos números pares digitados é %d%nA porcentagem de números ímpares digitados em comparação ao todo é %.2f%%", soma, contadorTotal, mediaTotal, maiorEntrada, menorEntrada, mediaPares, porcentagemImpares);

    }
}
