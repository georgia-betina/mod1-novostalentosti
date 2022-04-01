package Teams.d01_04;

public class Exercicio_59 {
    public static void main(String[] args) {
        /* 59) Elaborar um programa que apresente os valores
        de conversão de graus Celsius em Fahrenheit, de 10 em
        10 graus, iniciando a contagem em 10 graus Celsius e
        finalizando em 100 graus Celsius. O programa deverá
        apresentar os valores das duas temperaturas. */

        float celsius = 10;

        for (celsius = 10; celsius <=100; celsius += 10) {
            double calculaFahrenheit = (celsius * (float)1.8) + 32;
            System.out.printf("Celsius é %.0f °C, Fahrenheit é %.0f °F.%n", celsius, calculaFahrenheit);
        }
    }
}
