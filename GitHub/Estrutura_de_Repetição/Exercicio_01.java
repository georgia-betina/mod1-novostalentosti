package GitHub.Estrutura_de_Repetição;

public class Exercicio_01 {
    public static void main(String[] args) {
        /*
        * Exercício 01) Faça um programa que calcule a soma dos números inteiros de 1 a 100.
        */
        
        int numero = 0;
        int soma = 0;
        while (numero <= 100) {
            soma = soma + numero;
            numero++;
        }
        System.out.printf("A soma de 1 até 100 é igual a %d.", soma);
    }
}
