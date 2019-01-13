package escola;

public class Pais extends Pessoa {

    private String filiacao1;
    private String filiacao2;

    public Pais(String nome) {
        super(nome);
    }

    @Override
    public void imprimirCartaoAniversario() {
        System.out.println("Caros pais, feliz aniversario!");
    }
}
