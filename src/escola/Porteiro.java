package escola;

public class Porteiro extends Funcionario {

    public enum turno {
        NOTURNO, DIURNO
    }

    public Porteiro(String nome) {
        super(nome);
    }

    @Override
    public void reajustarSalario(double perc) {

    }

    @Override
    public void imprimirCartaoAniversario() {
        System.out.println("Caro porteiro, feliz aniversario!");
    }

}
