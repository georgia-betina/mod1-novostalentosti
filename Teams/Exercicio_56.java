package teams;

public class Exercicio_56 {
    public static void main(String[] args) {
        /* 56) Elabore um programa que apresente no final o somatório dos valores pares existentes na faixa de 1 até 500. */
        int numero = 1;
        int soma = 0;
        while (numero <= 500) {
            if (numero % 2 == 0) {
                soma = soma + numero;
            }
            numero++;
        }

        System.out.printf("A soma dos valores pares existentes entre 1 a 500 é %d.", soma);
    }
}
