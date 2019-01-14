package escola;

public class Professor extends Funcionario {

    public Professor(String nome, String disciplina) {
        super(nome);
        this.disciplina = disciplina;
    }

    private String disciplina;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

}
