package exercícios.GitHub.Estrutura_de_Decisão;

import java.util.Scanner;

public class Exercício_15 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.printf("Informe seu nome: ");
        final String nome = leitor.nextLine();

        System.out.printf("Informe a sua idade: ");
        final int idade = leitor.nextInt();

        if (idade < 17 | idade > 70) {
            System.out.printf("%s, você não pode adquirir apólices de seguro.", nome);
        } else if (idade >= 17 | idade <= 70) {
            System.out.printf("Selecione o seu grupo de risco:%n%n1 - Baixo%n2 - Médio%n3 - Alto%n%nR: ");
            final int grupoRisco = leitor.nextInt();

        String baixo, medio, alto;

        //if (grupoRisco == 1) {
        //    baixo = "baixo";
        //} else if (grupoRisco == 2) {
        //    medio = "médio";
        //} else if (grupoRisco == 3) {
        //    alto = "alto";
        //}
            
            switch ((idade >= 17 & idade <=20)?0:(idade >=21 & idade <=24)?1:(idade >= 25 & idade <= 34)?2:(idade >= 35 & idade <= 64)?3:(idade >= 65 & idade <= 70)?4:5) {
                case 0:
                    switch (grupoRisco) {
                        case 1:
                            baixo = "baixo";
                            System.out.printf("%s, de %d anos e grupo de risco %s, sua categoria é 1.", nome, idade, baixo);
                            break;
                        case 2:
                            medio = "médio";
                            System.out.printf("%s, de %d anos e grupo de risco %s, sua categoria é 2.", nome, idade, medio);
                            break;
                        case 3:
                            alto = "alto";
                            System.out.printf("%s, de %d anos e grupo de risco %s, sua categoria é 3.", nome, idade, alto);
                        default:
                            break;
                    }
                    break;
                case 1:
                switch (grupoRisco) {
                    case 1:
                        baixo = "baixo";
                        System.out.printf("%s, de %d anos e grupo de risco %s, sua categoria é 2.", nome, idade, baixo);
                        break;
                    case 2:
                        medio = "médio";
                        System.out.printf("%s, de %d anos e grupo de risco %s, sua categoria é 3.", nome, idade, medio);
                        break;
                    case 3:
                        alto = "alto";
                        System.out.printf("%s, de %d anos e grupo de risco %s, sua categoria é 4.", nome, idade, alto);
                    default:
                        break;
                }
                    break;
                case 2:
                switch (grupoRisco) {
                    case 1:
                        baixo = "baixo";
                        System.out.printf("%s, de %d anos e grupo de risco %s, sua categoria é 3.", nome, idade, baixo);
                        break;
                    case 2:
                        medio = "médio";
                        System.out.printf("%s, de %d anos e grupo de risco %s, sua categoria é 4.", nome, idade, medio);
                        break;
                    case 3:
                        alto = "alto";
                        System.out.printf("%s, de %d anos e grupo de risco %s, sua categoria é 5.", nome, idade, alto);
                    default:
                        break;
                }
                    break;
                case 3:
                switch (grupoRisco) {
                    case 1:
                        baixo = "baixo";
                        System.out.printf("%s, de %d anos e grupo de risco %s, sua categoria é 4.", nome, idade, baixo);
                        break;
                    case 2:
                        medio = "médio";
                        System.out.printf("%s, de %d anos e grupo de risco %s, sua categoria é 5.", nome, idade, medio);
                        break;
                    case 3:
                        alto = "alto";
                        System.out.printf("%s, de %d anos e grupo de risco %s, sua categoria é 6.", nome, idade, alto);
                    default:
                        break;
                }
                break;
                case 4:
                switch (grupoRisco) {
                    case 1:
                        baixo = "baixo";
                        System.out.printf("%s, de %d anos e grupo de risco %s, sua categoria é 7.", nome, idade, baixo);
                        break;
                    case 2:
                        medio = "médio";
                        System.out.printf("%s, de %d anos e grupo de risco %s, sua categoria é 8.", nome, idade, medio);
                        break;
                    case 3:
                        alto = "alto";
                        System.out.printf("%s, de %d anos e grupo de risco %s, sua categoria é 9.", nome, idade, alto);
                    default:
                        break;
                }
                    break;
                case 5:
                System.out.println("Caractere inválido. Encerrando operação.");
                    break;
            }
        }

        leitor.close();
    }
}
