package teams;

import java.util.Scanner;

public class Exercicio_19 {
    public static void main(String[] args) {
        /*
        * Exercício 19) Sabe-se que, para iluminar de maneira correta os
        * cômodos de uma casa, para cada metro quadrado, deve-se usar
        * 18Watts de potência. Faça um programa que receba as duas
        * dimensões de um cômodo (em metros), calcule e  mostre a sua
        * área (em metros quadrados) e a potência de iluminação que
        * deverá ser utilizada.
        */

        // ENTRADAS
        System.out.println("Informe a potência da lâmpada utilizada:");
        Scanner leitor = new Scanner(System.in);
        final float potencia = leitor.nextFloat();
    
        System.out.println("Informe a largura do cômodo em metros:");
        final float largura = leitor.nextFloat();
    
        System.out.println("Informe o comprimento do cômodo em metros:");
        final float comprimento = leitor.nextFloat();
    
        leitor.close();
    
        // PROCESSAMENTO
        final double metrosquadrados = largura * comprimento;
    
        final int lampExistentes = (int)potencia / 18;
    
        double lampNecessarias = metrosquadrados / 18;
        lampNecessarias = (int)Math.ceil(lampNecessarias);
    
        final double potenciaNecessaria = metrosquadrados * 18;
    
        String resultado = lampExistentes>=lampNecessarias?"suficiente":"insuficiente";
    
        // SAÍDA
        System.out.println(String.format("Cômodo em m²: %.0f.%nA quantidade de potência necessária para iluminar o cômodo será de %.0fW.%nA quantidade de lâmpadas existentes é %d e a quantidade necessária é %.0f. Ou seja, a quantidade existente é %s.", metrosquadrados, potenciaNecessaria, lampExistentes, lampNecessarias, resultado));
    }
}
