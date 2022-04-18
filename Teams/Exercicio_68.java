package Teams.d04_04;

import java.util.Scanner;

public class Exercicio_68 {
    public static void main(String[] args) {
        /*
         * 68) Faça um algoritmo que calcule a média
         * de todas as turmas de uma escola. Considere
         * como entradas o número de turmas e o número
         * de alunos de cada turma. A média de cada turma
         * deve ser apresentada, além da média geral, que
         * será o resultado da média das turmas.
         */

        Scanner leitor = new Scanner(System.in);

        int numeroTurmas = 0;
        int alunos = 0;
        int contador = 1;
        float mediaAluno = 0;
        double somaMediaAluno = 0;
        double calculaMediaTurma = 0;
        double somaMediaGeral = 0;
        double calculaMediaGeral = 0;

        do {
            System.out.printf("Informe o número de turmas: ");
            numeroTurmas = leitor.nextInt();

            if (numeroTurmas != 0) {
                for (int i = contador; i <= numeroTurmas; i++) {
                    System.out.printf("Informe a quantidade de alunos da turma %d: ", i);
                    alunos = leitor.nextInt();

                    if (alunos != 0) {
                        for (int ii = contador; ii <= alunos; ii++) {
                            System.out.printf("Insira a média do aluno %d: ", ii);
                            mediaAluno = leitor.nextFloat();

                            somaMediaAluno += mediaAluno;
                        }
                        calculaMediaTurma = somaMediaAluno / alunos;
                        System.out.printf("A média da turma %d é %.1f.%n", i, calculaMediaTurma);

                        somaMediaGeral += calculaMediaTurma;

                        mediaAluno = 0;
                        somaMediaAluno = 0;
                        calculaMediaTurma = 0;
                    }
                }
                calculaMediaGeral = somaMediaGeral / numeroTurmas;
                System.out.printf("A média geral de todas as turmas é %.1f.%n", calculaMediaGeral);
            }
        } while (numeroTurmas != 0);

        leitor.close();

    }
}
