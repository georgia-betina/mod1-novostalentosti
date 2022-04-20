package intro_POO;

public class App {
    public static void main(String[] args) {

    // Criando uma variável do tipo Pessoa
    // Criando uma instância de objeto a partir da classe Pessoa
        
    // passagem de parâmetros
    // instanciação
    Pessoa zezinho = new Pessoa("Zezinho");
    zezinho.setNome("Zezinho da Silva Sauro");
    zezinho.setCPF("555.555.555-55");
    zezinho.setAltura(1.75f);
    zezinho.setIdade(22);

    Pessoa luizinho = new Pessoa("Luiz");
    luizinho.setNome("Luizinho da Silva Sauro Jr");
    luizinho.setAltura(1.68f);
    luizinho.setIdade(17);

    System.out.println(zezinho.getNome());
    System.out.println(luizinho.getNome());

    System.out.println(zezinho.getAltura());
    System.out.println(luizinho.getAltura());

    zezinho.setAltura(0f);
    luizinho.setAltura(0f);

    System.out.println(zezinho.getAltura());
    System.out.println(luizinho.getAltura());

    String guardaResultado = zezinho.podeDirigir();
    System.out.println(guardaResultado);
    guardaResultado = luizinho.podeDirigir();
    System.out.println(guardaResultado);

    zezinho.mostraCPF(); // void não precisa criar variável
    luizinho.mostraCPF();

    Celular startak = new Celular("(47) 99999-9999");
    startak.setModelo("PT 550");
    startak.setMarca("Motorola");
    
    startak.setDono(zezinho);
    }
}
