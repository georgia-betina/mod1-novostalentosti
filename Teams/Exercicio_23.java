package Teams;

public class ex23 {
    public static void main(String[] args) {
        /*
        * Exercício 23) Considere para as respostas os seguintes valores: 
        * X=1, A=3, B=5, C=8 e D=7  
        *
        * Expressão               | RES (Verdadeiro?/Falso?) 
        * RES = !(x>3)            | RES Verdadeiro
        * RES = (X < 1) & !(B>D)  | RES Falso
        * RES = !(D<0) & (C>5)    | RES Verdadeiro
        * RES = !(X>3) | (C<7)    | RES Verdadeiro
        * RES = (A>B) | (C>B)     | RES Verdadeiro
        * RES = (X>=2)            | RES Falso
        * RES = (X<1) & (B>=D)    | RES Falso
        * RES = (D<0) | (C>5)     | RES Verdadeiro
        * RES = !(D>3) | !(B<7)   | RES Falso
        * RES = (A>B) | !(C>B)    | RES Falso
        */

        // PROCESSAMENTO
        int x = 1;
        int a = 3;
        int b = 5;
        int c = 8;
        int d = 7;

        // SAÍDAS
        System.out.println(!(x>3)?"Verdadeiro":"Falso");
        System.out.println((x<1)&(b>d)?"Verdadeiro":"Falso");
        System.out.println(!(d<0)&(c>5)?"Verdadeiro":"Falso");
        System.out.println(!(x>3)||(c<7)?"Verdadeiro":"Falso");
        System.out.println((a>b)||(c>b)?"Verdadeiro":"Falso");
        System.out.println((x>=2)?"Verdadeiro":"Falso");
        System.out.println((x<1)&(b>=d)?"Verdadeiro":"Falso");
        System.out.println((d<0)||(c>5)?"Verdadeiro":"Falso");
        System.out.println(!(d>3)||!(b<7)?"Verdadeiro":"Falso");
        System.out.println((a>b)||!(c>b)?"Verdadeiro":"Falso");
    }
}
