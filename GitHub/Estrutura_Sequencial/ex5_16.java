package exercícios.GitHub.Estrutura_Sequencial;

import java.util.Scanner;

public class ex5_16 {
    public static void main(String[] args) {
        System.out.println("Por favor, insira seu nome:");
        Scanner leitor = new Scanner(System.in);
        String nome = leitor.nextLine();

        System.out.println("Agora, insira seu sobrenome:");
        Scanner leitor1 = new Scanner(System.in);
        String sobrenome = leitor1.nextLine();

        leitor.close();
        leitor1.close();

        System.out.println(String.format("Seu nome completo é %s %s.", nome, sobrenome));
    }
}
