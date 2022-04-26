package GitHub.Estrutura_de_Repetição;

public class Exercicio_08 {
    public static void main(String[] args) {
    /*
    * Exercício 08) Faça um programa que calcule o resultado dos 50 primeiros números
    * da sequinte sequência:
    * 1000 ÷ 1 - 997 ÷ 2 + 994 ÷ 3 - 991 ÷ 4 + ...
    */

    int inicio = 1000;
    int contador = 1;
    float resultado;

    for (int i = 0; i < 50; i++) {
        resultado = (float)inicio / (float)contador;
        System.out.printf("%.2f\n", resultado);
        inicio -= 3;
        contador++;
    }
    }
}
