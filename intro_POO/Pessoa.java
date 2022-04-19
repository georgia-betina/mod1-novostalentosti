package intro_POO;

public class Pessoa {
    // Atributos
    // escopo de vida de instância
    private String nome; // private impede a alteração fácil | encapsular
    public int idade;
    public String CPF;
    public float altura;

    // GETTER e SETTER
    public String getNome(){ // método GET do nome
        return this.nome;
    }

    // Comportamentos
    // CONSTRUTOR - inicializar um objeto e definir valores obrigatórios
    public Pessoa(String nome){ // escopo de vida local
        System.out.println("CONTRUTOR:" + nome);
        this.nome = nome;
    }

    // método (em outras linguagens mais antigas é chamado de função)
    // assinatura de um método
    // modificadorDeAcesso tipoDeRetorno nomeDoMetodo(parametros) { corpo }
    public String podeDirigir(){
        if(this.idade >= 18){ // não precisava utilizar o this porque não há outra variável no mesmo bloco com o mesmo nome
            return "Pode dirigir";
        } else {
            return "Não pode dirigir";
        }
    }

    public void mostraCPF(){
        System.out.println(this.CPF);
    }
}