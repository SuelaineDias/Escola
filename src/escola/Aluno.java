package escola;

import java.util.List;

public final class Aluno extends Pessoa {

    private String matricula;
    private double Medias;
    private String Escolaridades;
    private Pais pais = new Pais("nome");

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

    @Override
    public void imprimirCartaoAniversario() {
        System.out.println("Caro aluno Feliz aniversario!");
    }

    private void calculaMedia(double nota1, double nota2) {

    }

    private void calculaMedia(List<Double> notas) {

    }

}
