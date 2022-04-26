package GitHub.Estrutura_de_Repetição;

public class Exercicio_13 {
    public static void main(String[] args) {
        /*
        * Exercício 13) Uma rainha requisitou os serviços de um monge e disse-lhe que
        * pagaria qualquer preço. O monge, necessitando de alimentos, indagou à rainha
        * sobre o pagamento, se poderia ser feito com grãos de trigo dispostos em um
        * tabuleiro de xadrez (que possui 64 casas), de tal forma que o primeiro quadro
        * deveria conter apenas um grão e os quadros subsequentes, o dobro do quadro
        * anterior. Crie um programa para calcular o total de grãos que o monge recebeu.
        */

        float quantidadeGraos = 1;
        float contaGraos = 1;

        for (int i = 1; i < 64; i++) {
            quantidadeGraos *= 2;
            contaGraos += quantidadeGraos;
        }

        System.out.printf("A quantidade de grãos obtidas será de %.0f.", contaGraos);
    }
}
