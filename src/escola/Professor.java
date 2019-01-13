package escola;

public class Professor extends Funcionario {

    public Professor(String nome) {
        super(nome);
    }

    private String disciplina;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public void imprimirCartaoAniversario() {
        System.out.println("Caro professor, feliz aniversario!");
    }

}
