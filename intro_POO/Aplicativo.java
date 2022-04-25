package intro_POO;

public class Aplicativo {
    private String nome;
    
    public Aplicativo(String nome) {
        setNomeUsuario(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNomeUsuario(String nome) {
        this.nome = nome;
    }

    public String toString(){
        return getNome();
    }
}
