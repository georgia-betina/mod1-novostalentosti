package GitHub.Estrutura_Sequencial;

public class ex13_16 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;

        c = a;
        a = b;
        b = c;

        System.out.println(String.format("Os novos valores são A = %d e B = %d.", a, b));
    }
}
