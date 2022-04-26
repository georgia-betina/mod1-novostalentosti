package GitHub.Estrutura_de_Repetição;

import java.util.Scanner;

public class Exercicio_15 {
    public static void main(String[] args) {
        /*
        * Exercício 15) Faça um programa que peça para o usuário ir informando números até que ele informe 0 (zero).
        * Após isto apresente os seguintes dados sobre os números digitados:
        * O maior número;
        * O menor número;
        * A soma dos números;
        * A média deles;
        * A quantidade de números pares;
        * A quantidade de números ímpares.
        */

        Scanner leitor = new Scanner(System.in);
        float entradaNumero = 0;
        float maiorNumero = 0;
        float menorNumero = 0;
        float soma = 0;
        double media = 0;
        float quantidadeNumerosPares = 0;
        float quantidadeNumerosImpares = 0;
        int contador = 0;
        boolean flag = false;

        while (flag == false) {
            System.out.printf("Informe um número ou digite 0 para sair: ");
            entradaNumero = leitor.nextFloat();
            if (entradaNumero == 0 && contador == 0) {
                System.out.printf("Encerrando o programa.");
                flag = true;
            } else if (entradaNumero == 0 && contador != 0) {
                System.out.printf("Você digitou 0. Informando os resultados e encerrando o programa a seguir:\n");
                flag = true;
            } else if (entradaNumero != 0) {
                /* MAIOR NÚMERO */
                maiorNumero = Math.max(maiorNumero, entradaNumero);
                /* MENOR NÚMERO */
                menorNumero = Math.min(menorNumero, entradaNumero);
                /* SOMA */
                soma += entradaNumero;
                /* VERIFICA PARES E ÍMPARES */
                if (entradaNumero % 2 == 0) {
                    quantidadeNumerosPares++;
                } else if (entradaNumero % 2 != 0) {
                    quantidadeNumerosImpares++;
                }
                /* SOMA A QUANTIDADE DE ENTRADAS PARA REALIZAR A MÉDIA */
                contador++;
            }
        }

        leitor.close();

        media = soma / (float)contador;
        if (entradaNumero == 0 && contador == 0) {
        } else {
            System.out.printf("Maior número digitado: %.0f\nMenor número digitado: %.0f\nA soma entre os números digitados: %.0f\nA média entre os números digitados: %0.f\nA quantidade de números pares digitados: %0.f\nA quantidade de números ímpares digitados: %.0f", maiorNumero, menorNumero, soma, media, quantidadeNumerosPares, quantidadeNumerosImpares);
        }
        
    }  
}
