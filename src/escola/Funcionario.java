package escola;

public abstract class Funcionario extends Pessoa {

    public Funcionario(String nome) {
        super(nome);
    }
    private int pid;
    private String email;
    private double salario;

    public void reajustarSalario(double perc) {

    }

    @Override
    public void imprimirCartaoAniversario() {
        System.out.println("Caro funcionario, feliz aniversario!");
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
