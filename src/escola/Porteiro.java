package escola;

public class Porteiro extends Funcionario {

    public enum Turno {
        NOTURNO, DIURNO     
    }
    
    private final Turno turno;
    
    public Porteiro(String nome, Turno turno) {
        super(nome);
        this.turno = turno;
    }

    @Override
    public void reajustarSalario(double perc) {
        
    if (this.turno.equals(Turno.NOTURNO)) {
        setSalario(getSalario() * (perc + 0.1));
    }
    else {
    super.reajustarSalario(perc);
    }    
        
    }
}

