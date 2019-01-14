package escola;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Escola implements Autenticar {

    private int novoAluno = 0;
    private double qtdNotas;
    private List<Double> notas = new ArrayList();
    private List<Aluno> listaAlunos = new ArrayList<>();
    private Aluno aluno;
    private boolean loginErrado = true;
    private String usuarioLogado = " ";
    private String passwordLogado = " ";
    private List<Autenticavel> listaUsuariosPermitidos = new ArrayList<>();
    private Autenticavel autenticavel;

    public void login() {
        while (loginErrado) {
            String nomeDeUsuario = JOptionPane.showInputDialog("Digite nome do usuario");
            String password = JOptionPane.showInputDialog("Digite sua senha");
            autenticar(nomeDeUsuario, password);

        }

    }

    public void matricularAlunos() {
        double media = 0;
        while (novoAluno == 0) {
            String nome = JOptionPane.showInputDialog("Digite nome do aluno ");
            aluno = new Aluno(nome);
            aluno.setNome(nome);
            notas.clear();
            qtdNotas = 0;

            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno "));
            aluno.setIdade(idade);

            String escolaridade = JOptionPane.showInputDialog("Digite a escolaridade do aluno ");
            aluno.setEscolaridades(escolaridade);

            qtdNotas = Integer.parseInt(JOptionPane.showInputDialog("Quantas notas você quer adicionar?"));

            for (int i = 0; i < qtdNotas; i++) {
                String recebe = JOptionPane.showInputDialog("Digite sua nota numero " + (i + 1));
                double converteRecebeDouble = Double.parseDouble(recebe);
                notas.add(converteRecebeDouble);

            }
            int faltas = Integer.parseInt(JOptionPane.showInputDialog("Quantas faltas voce possui?"));
            Object[] options = {"Sim", "Nao"};
            int trabalhoNoturno = JOptionPane.showOptionDialog(null, "Voce trabalha a noite?", "Trabalho noturno",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);

            if (qtdNotas == 1) {
                media = calculaMedia(notas.get(0), 0);
                aluno.setMedias(media);
            }

            if (qtdNotas == 2) {
                media = calculaMedia(notas.get(0), notas.get(1));
                aluno.setMedias(media);
            }

            if (qtdNotas > 2) {
                media = calculaMedia(notas);
                aluno.setMedias(media);
            }

            String msg = "Voce tem " + faltas + " faltas e sua media é " + media + "\n Voce esta ";

            if (media >= 4 && media < 7) {
                if (faltas < 10) {
                    msg += "recuperacao, porque sua media é menor que 7 e voce tem menos de 10 faltas";
                } else {
                    msg += "reprovado, porque voce faltou mais de 10 vezes, apesar de sua media ser maior que 4 e menor que 7";
                }
            } else if (media >= 7 && media < 9) {
                if (faltas < 3) {
                    msg += "aprovado, pois sua media esta entre 7 e 9, e voce possui menos de 3 faltas";
                } else if (trabalhoNoturno == 0) {
                    msg += "aprovado, pois sua media esta entre 7 e 9, e voce trabalha a noite";
                }
            } else if (media < 4) {
                msg += "reprovado, pois sua media e menor que 4";
            } else {
                msg += "aprovado direto, pois sua nota e maior ou igual a 9";
            }
            listaAlunos.add(aluno);
            JOptionPane.showMessageDialog(null, msg, "Calcular Media do Aluno", JOptionPane.PLAIN_MESSAGE);

            Object[] options2 = {"Sim", "Nao"};
            novoAluno = JOptionPane.showOptionDialog(null, "Quer cadastrar um novo aluno?", "Novo aluno",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options2, options2[0]);
        }

    }
    
    public void digitarDadosdoAluno(){
        
    }

    public void exibirRelatorio() {
        for (Aluno a : listaAlunos) {
            String msg = "Nome: " + a.getNome();
            msg += "\nMedia: " + a.getMedias();
            msg += "\nIdade: " + a.getIdade();
            msg += "\nEscolaridade: " + a.getEscolaridades();
            JOptionPane.showMessageDialog(null, msg, "Aluno " + a.getNome(), JOptionPane.PLAIN_MESSAGE);
        }

    }

    private double calculaMedia(double nota1, double nota2) {
        return (nota1 + nota2) / qtdNotas;
    }

    private double calculaMedia(List<Double> notas) {
        double valorAcumulado = 0;
        for (double n : notas) {
            valorAcumulado = valorAcumulado + n;
        }

        return valorAcumulado / qtdNotas;
    }

    @Override
    public void autenticar(String login, String senha) {
        autenticavel = new Autenticavel();
        autenticavel.setLogin("professor");
        autenticavel.setSenha("123456");
        listaUsuariosPermitidos.add(autenticavel);

        autenticavel = new Autenticavel();
        autenticavel.setLogin("diretor");
        autenticavel.setSenha("123456");
        listaUsuariosPermitidos.add(autenticavel);

        autenticavel = new Autenticavel();
        autenticavel.setLogin("coodenador");
        autenticavel.setSenha("123456");
        listaUsuariosPermitidos.add(autenticavel);

        for (Autenticavel aut : listaUsuariosPermitidos) {
            if (aut.getLogin().equals(login) && aut.getSenha().equals(senha)) {
                usuarioLogado = login;
                passwordLogado = senha;
                loginErrado = false;
                break;
            }

        }
    }
}
