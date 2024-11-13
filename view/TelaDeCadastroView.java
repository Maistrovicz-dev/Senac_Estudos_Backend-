package view;
import controller.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class TelaDeCadastroView extends JFrame {
    public static JLabel lblNome;
    public static JTextField txtNome;

    public static JLabel lblEmail;
    public static JTextField txtEmail;

    public static JLabel lblSenha;
    public static JPasswordField txtSenha;

    public static JButton btnCadastrar;
    public static JButton btnCancelar;

    public static JLabel lblNotificacoes;

    public TelaDeCadastroView() {
        super("Tela de Cadastro");
        setLayout(new GridLayout(5,1,5,5));

        JPanel linhaNome = new JPanel(new GridLayout(1,2));

        lblNome = new JLabel("Nome:", SwingConstants.RIGHT);
        txtNome = new JTextField(10);

        linhaNome.add(lblNome);
        linhaNome.add(txtNome);

        add(linhaNome);

        JPanel linhaEmail = new JPanel(new GridLayout(1,2));

        lblEmail = new JLabel("Email:", SwingConstants.RIGHT);
        txtEmail = new JTextField(10);

        linhaEmail.add(lblEmail);
        linhaEmail.add(txtEmail);

        add(linhaEmail);

        JPanel linhaSenha = new JPanel(new GridLayout(1,2));

        lblSenha = new JLabel("Senha:", SwingConstants.RIGHT);
        txtSenha = new JPasswordField(10);

        linhaSenha.add(lblSenha);
        linhaSenha.add(txtSenha);

        add(linhaSenha);

        JPanel linhaBotoes = new JPanel(new GridLayout(1,2));

        btnCadastrar = new JButton("Cadastrar");
        btnCancelar = new JButton("Cancelar");

        linhaBotoes.add(btnCadastrar);
        linhaBotoes.add(btnCancelar);

        add(linhaBotoes);

        JPanel linhaNotificacoes = new JPanel(new GridLayout(1,1));

        lblNotificacoes = new JLabel("Notificações", SwingConstants.CENTER);

        linhaNotificacoes.add(lblNotificacoes);

        add(linhaNotificacoes);

        btnCadastrar.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    if (txtNome.getText().trim().length() == 0) {
                        lblNotificacoes.setText("É necessário digitar alguma coisa no campo Nome. Por favor, digite um caracter válido no campo Nome para prosseguir.");
                        txtNome.requestFocus();
                        return;
                    }

                    if (txtEmail.getText().trim().length() == 0) {
                        lblNotificacoes.setText("É necessário digitar alguma coisa no campo Email. Por favor, digite um caracter válido no campo Email para prosseguir.");
                        txtEmail.requestFocus();
                        return;
                    }

                    if (String.valueOf(txtSenha.getPassword()).trim().length() == 0) {
                        lblNotificacoes.setText("É necessário digitar alguma coisa no campo Senha. Por favor, digite um caracter válido no campo Senha para prosseguir.");
                        txtSenha.requestFocus();
                        return;
                    }
                    
                    TelaDeCadastroController.cadastrarController();

                }
            }
        );
        

        btnCancelar.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    System.exit(0);
                }
            }
        );

        setSize(300,300);
        setVisible(true);
    }
    public static void notificarUsuario(String txt){
        lblNotificacoes.setText(setHtmlFormat(txt));
    }

    public static String setHtmlFormat (String str) {
        return "<html><body>" + str + "</body></html>";
    }

    public static TelaDeCadastroView appTelaDeCadastroView;

    public static void main(String[] args) {
        TelaDeCadastroView appTelaDeCadastroView = new TelaDeCadastroView();
        appTelaDeCadastroView.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}