package escola;

import javax.swing.JOptionPane;

public abstract class Funcionario extends Pessoa {

    public Funcionario(String nome) {
        super(nome);
    }
    private int pid;
    private String email;
    private double salario;

    public void reajustarSalario(double perc) {
    this.salario += salario * perc;
    }

    @Override
    public void imprimirCartaoAniversario() {
        JOptionPane.showMessageDialog(null, "Parabens funcionario " + this.getNome());
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
