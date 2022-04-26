package GitHub.Estrutura_de_Repetição;

public class Exercicio_10 {
    public static void main(String[] args) {
        /*
        * Exercício 10) Anacleto tem 1,50m e cresce 2 centímetros por ano,
        * enquanto Felisberto tem 1,10m e cresce 3 centímetros por ano.
        * Construa um programa que calcule e apresente quantos anos serão
        * necessários para que Felisberto seja maior que Anacleto.
        */

        float alturaAnacleto = 1.50f;
        float alturaFelisberto = 1.10f;
        int contaAnos = 0;

        while (alturaFelisberto < alturaAnacleto) {
            alturaAnacleto += 0.02f;
            alturaFelisberto += 0.03f;
            contaAnos++;
        }

        System.out.printf("Será necessário %d anos para Felisberto ultrapassar a altura de Anacleto.", contaAnos);
    }
}
