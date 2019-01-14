package escola;

import javax.swing.JOptionPane;

public class Pais extends Pessoa {

    private String cpf;

    public Pais(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    @Override
    public void imprimirCartaoAniversario() {
        JOptionPane.showMessageDialog(null, "Parabens pai/mae " + this.getNome());
    }
}
