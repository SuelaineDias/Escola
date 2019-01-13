package escola;

public class Secretaria extends Funcionario {

    public Secretaria(String nome) {
        super(nome);
    }

    @Override
    public void imprimirCartaoAniversario() {
        System.out.println("Cara secretaria, feliz aniversario!");
    }

}
