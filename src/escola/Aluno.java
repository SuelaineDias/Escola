package escola;

import java.util.List;
import javax.swing.JOptionPane;

public final class Aluno extends Pessoa {

    private String matricula;
    private double Medias;
    private double qtdNotas;
    private String Escolaridades;
    private Pais pai;
    private Pais mae;

    public Aluno(String nome) {
        super(nome);
    }

    public double getMedias() {
        return Medias;
    }

    public void setMedias(double Medias) {
        this.Medias = Medias;
    }

    public String getEscolaridades() {
        return Escolaridades;
    }

    public void setEscolaridades(String Escolaridades) {
        this.Escolaridades = Escolaridades;
    }

    public Pais getPai() {
        return pai;
    }

    public void setPai(Pais pai) {
        this.pai = pai;
    }

    public Pais getMae() {
        return mae;
    }

    public void setMae(Pais mae) {
        this.mae = mae;
    }

    public double getQtdNotas() {
        return qtdNotas;
    }

    public void setQtdNotas(double qtdNotas) {
        this.qtdNotas = qtdNotas;
    }

    @Override
    public void imprimirCartaoAniversario() {
        JOptionPane.showMessageDialog(null, "Parabens aluno " + this.getNome());
    }

    public double calculaMedia(double nota1, double nota2) {
        return (nota1 + nota2) / qtdNotas;
    }

    public double calculaMedia(List<Double> notas) {
        double valorAcumulado = 0;
        for (double n : notas) {
            valorAcumulado = valorAcumulado + n;
        }

        return valorAcumulado / qtdNotas;
    }
}
