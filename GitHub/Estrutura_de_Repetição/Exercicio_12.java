package GitHub.Estrutura_de_Repetição;

public class Exercicio_12 {
    public static void main(String[] args) {
        /*
        * Exercício 12) Supondo que a população de um país A seja da ordem
        * de 80.000 habitantes com uma taxa anual de crescimento de 3% e que
        * a população de B seja 200.000 habitantes com uma taxa de crescimento
        * de 1,5%. Faça um programa que calcule e escreva o número de anos
        * necessários para que a população do país A ultrapasse ou iguale a
        * população do país B, mantidas as taxas de crescimento.
        */

        int quantidadePopulacaoA = 80000;
        float crescimentoPopulacaoA = 0;
        int quantidadePopulacaoB = 200000;
        float crescimentoPopulacaoB = 0;
        int contaAnos = 0;

        while (quantidadePopulacaoA != quantidadePopulacaoB || quantidadePopulacaoA < quantidadePopulacaoB) {
            crescimentoPopulacaoA = (float)quantidadePopulacaoA * 0.03f;
            quantidadePopulacaoA += crescimentoPopulacaoA;
            crescimentoPopulacaoB = (float)quantidadePopulacaoB * 0.015f;
            quantidadePopulacaoB += crescimentoPopulacaoB;
            contaAnos++;
        }

        System.out.printf("A quantidade de anos necessária para que a quantidade de população do país A seja maior ou igual ao país B é de %d anos.", contaAnos);
    }
}
