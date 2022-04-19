package intro_POO;

import intro_POO.Pessoa;

public class App {
    public static void main(String[] args) {

    // Criando uma variável do tipo Pessoa
    // Criando uma instância de objeto a partir da classe Pessoa
        
    // passagem de parâmetros
    // instanciação
    Pessoa zezinho = new Pessoa("Zezinho");
    //zezinho.nome = "Zezinho da Silva Sauro";
    zezinho.CPF = "555.555.555-55";
    zezinho.altura = 1.75f;
    zezinho.idade = 22;

    Pessoa luizinho = new Pessoa("Luiz");
    //luizinho.nome = "Luizinho da Silva Sauro Jr";
    luizinho.altura = 1.68f;
    luizinho.idade = 17;

    System.out.println(zezinho.nome);
    System.out.println(luizinho.nome);

    System.out.println(zezinho.altura);
    System.out.println(luizinho.altura);

    zezinho.altura = 0f;
    luizinho.altura = 0f;

    System.out.println(zezinho.altura);
    System.out.println(luizinho.altura);

    String guardaResultado = zezinho.podeDirigir();
    System.out.println(guardaResultado);
    guardaResultado = luizinho.podeDirigir();
    System.out.println(guardaResultado);

    zezinho.mostraCPF(); // void não precisa criar variável
    luizinho.mostraCPF();
    }
}
