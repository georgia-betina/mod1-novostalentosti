package GitHub.Estrutura_de_Repetição;

public class Exercicio_01 {
    public static void main(String[] args) {
        int numero = 0;
        int soma = 0;
        while (numero <= 100) {
            soma = soma + numero;
            numero++;
        }
        System.out.printf("A soma de 1 até 100 é igual a %d.", soma);
    }
}
