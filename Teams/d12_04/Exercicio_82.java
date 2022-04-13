package Teams.d12_04;

import java.util.Scanner;

public class Exercicio_82 {
    public static void main(String[] args) {
        /* 82) Faça um programa para corrigir provas de múltipla
        escolha com somatória. Cada prova tem dez questões e cada
        questão vale 1 ponto. O primeiro conjunto de dados a ser
        lido é o gabarito da prova. Os outros dados serão os números
        dos alunos e sua respectivas respostas. Existem 15 alunos
        matriculados. Calcule e mostre:
        - Para cada aluno seu número e sua nota;
        - A percentagem de aprovação, sabendo-se que a nota mínima é 6,0 */

        String[] listaGabarito = new String[10];
        //int[] quantidadeAlunos = new int[15];
        String[] variavelAlunoGabarito = new String[10];
        Scanner leitor = new Scanner(System.in);
        int contadorQuestao = 1;
        int contadorAluno = 1;
        int somaNota = 0;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Informe o gabarito da questão %d (A-E): ", contadorQuestao);
            listaGabarito[i] = leitor.nextLine();
            contadorQuestao++;
            if (contadorQuestao == 11) {
                contadorQuestao = 0;
            }
        }

        System.out.printf("Informe a quantidade de alunos: %n");
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("Informe o gabarito da questão %d, do aluno %d: ", contadorQuestao, contadorAluno);
                variavelAlunoGabarito[j] = leitor.nextLine();
                // COMPARAR LISTAS
                if (variavelAlunoGabarito[j] == listaGabarito[j]) {
                    somaNota++;
                }
                contadorQuestao++;
            }
            System.out.printf("A nota do aluno %d é %d%n", contadorAluno, somaNota);
            contadorAluno++;            
        }

        leitor.close();
    }
}
