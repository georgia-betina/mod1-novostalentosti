package teams;

public class Exercicio_55 {
    public static void main(String[] args) {
        /* 55) Faça um programa que apresente no final o somatório dos números de 1 até 100. */
        int numero = 0;
        int soma = 0;
        while (numero <= 100) {
            soma = soma + numero;
            numero++;
        }
        System.out.printf("A soma de 1 até 100 é igual a %d.", soma);
    }
}
