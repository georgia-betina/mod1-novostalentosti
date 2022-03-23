package Teams.d17_03;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
            System.out.println("Informe a potência da lâmpada utilizada:");
            Scanner leitor = new Scanner(System.in);
            final float potencia = leitor.nextFloat();
    
            System.out.println("Informe a largura do cômodo em metros:");
            Scanner leitor1 = new Scanner(System.in);
            final float largura = leitor1.nextFloat();
    
            System.out.println("Informe o comprimento do cômodo em metros:");
            Scanner leitor2 = new Scanner(System.in);
            final float comprimento = leitor2.nextFloat();
    
            leitor.close();
            leitor1.close();
            leitor2.close();
    
            final double metrosquadrados = largura * comprimento;
    
            final int lampExistentes = (int)potencia / 18;
    
            double lampNecessarias = metrosquadrados / 18;
            lampNecessarias = (int)Math.ceil(lampNecessarias);
    
            final double potenciaNecessaria = metrosquadrados * 18;
    
            String resultado = lampExistentes>=lampNecessarias?"suficiente":"insuficiente";
    
            System.out.println(String.format("Cômodo em m²: %.0f.%nA quantidade de potência necessária para iluminar o cômodo será de %.0fW.%nA quantidade de lâmpadas existentes é %d e a quantidade necessária é %.0f. Ou seja, a quantidade existente é %s.", metrosquadrados, potenciaNecessaria, lampExistentes, lampNecessarias, resultado));
    }
}
