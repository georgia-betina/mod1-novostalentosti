package intro_POO;

public class Pessoa {
    // Atributos
    // escopo de vida de instância
    public String nome;
    public int idade;
    public String CPF;
    public float altura;

    // comportamento
    // CONSTRUTOR - inicializar um objeto e definir valores obrigatórios
    public Pessoa(String nome){ // escopo de vida local
        System.out.println("CONTRUTOR:" + nome);
        this.nome = nome;
    }
}