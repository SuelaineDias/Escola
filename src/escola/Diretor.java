package escola;

public class Diretor extends Funcionario {

    public Diretor(String nome) {
        super(nome);
    }

    @Override
    public void imprimirCartaoAniversario() {
        System.out.println("Caro diretor,feliz aniversario!");
    }

}
