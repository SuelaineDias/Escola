package escola;

public abstract class Pessoa {

    private String nome;
    private int idade;

    public abstract void imprimirCartaoAniversario();

    public final void incrementarIdade(int i) {

    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
