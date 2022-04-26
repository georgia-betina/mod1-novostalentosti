package GitHub.Estrutura_de_Repetição;

public class Exercicio_09 {
    public static void main(String[] args) {
        /*
        * Exercício 09) Faça um programa para calcular e escrever a seguinte soma:
        37 × 38 ÷ 1 + 36 × 37 ÷ 2 + 35 × 36 ÷ 3 + ... + 1 × 2 ÷ 37
        */

        int valor1 = 37;
        int valor2 = 38;
        int contador = 1;
        float calcula = 0f;
        float resultado = 0;

        while (contador != 38) {
            calcula = ((float)valor1 * (float)valor2) / (float)contador;
            resultado += calcula;
            valor1--;
            valor2--;
            contador++;
        }

        System.out.println(resultado);
    }
}
