package teams;

import java.util.Scanner;

public class Exercicio_38 {
    public static void main(String[] args) {
        System.out.printf("Informe o preço do produto: R$ ");
        Scanner leitor = new Scanner(System.in);
        //final float precoProduto = leitor.nextFloat();

        System.out.printf("Informe o código de origem: ");
        final int codigoOrigem = leitor.nextInt();

        switch (codigoOrigem) {
            case 1:
                System.out.println("Procedência sul.");
                break;
            case 2:
                System.out.println("Procedência norte.");
                break;
            case 3:
                System.out.println("Procedência leste.");
                break;
            case 4:
                System.out.println("Procedência oeste.");
                break;
            case 5:
            case 6:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                System.out.println("Procedência nordeste.");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Procedência sudeste.");
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                System.out.println("Procedência centro-oeste.");
                break;
            default:
                System.out.println("Código inválido. Encerrando operação...");
        }
        leitor.close();
    }
}
