package GitHub.Estrutura_Sequencial;

import java.util.Scanner;

public class ex3_16 {
    public static void main(String[] args) {
        System.out.println("Por favor, informe o raio da circunferência a seguir:");
        Scanner leitor = new Scanner(System.in);
        float raio = leitor.nextFloat();
        leitor.close();
        
        //double areadacircunf = raio * 2;// * 3.14159);
        float area = (raio * raio) * (float)3.14159;

        System.out.println(String.format("A área da circunferência é %.2f.", area));
    }
}
