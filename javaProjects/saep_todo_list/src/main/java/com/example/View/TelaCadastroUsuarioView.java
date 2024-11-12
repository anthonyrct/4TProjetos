package com.example.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.example.Model.Usuario;
import com.example.Connection.UsuarioDAO;

public class TelaCadastroUsuarioView extends JFrame {

    private JTextField nameField, emailField;
    private JPasswordField passwordField;
    private JButton registerButton, cancelButton;

    public TelaCadastroUsuarioView() {
        setTitle("Cadastro de Usuário");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a tela

        // Definindo o layout
        setLayout(new GridLayout(4, 2, 10, 10));

        // Componentes
        JLabel nameLabel = new JLabel("Nome:");
        nameField = new JTextField();

        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();

        JLabel passwordLabel = new JLabel("Senha:");
        passwordField = new JPasswordField();

        registerButton = new JButton("Cadastrar");
        cancelButton = new JButton("Cancelar");

        // Adicionando os componentes à tela
        add(nameLabel);
        add(nameField);
        add(emailLabel);
        add(emailField);
        add(passwordLabel);
        add(passwordField);
        add(registerButton);
        add(cancelButton);

        // Ação para o botão "Cadastrar"
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Pega os dados dos campos
                String name = nameField.getText();
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());

                // Validação simples
                if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");
                    return;
                }

                // Cria o objeto Usuario
                Usuario usuario = new Usuario(name, email, password);

                // Cria o DAO e chama o método para adicionar o usuário
                UsuarioDAO usuarioDAO = new UsuarioDAO();
                usuarioDAO.addUsuario(usuario);

                // Exibe mensagem de sucesso
                JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");

                // Limpar os campos
                nameField.setText("");
                emailField.setText("");
                passwordField.setText("");

                // Fechar a tela de cadastro
                dispose();

                // Exibir a tela de gerenciamento de tarefas (criar um JFrame)
                JFrame taskManagementFrame = new JFrame("Gerenciamento de Tarefas");
                taskManagementFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                taskManagementFrame.setSize(600, 400);
                taskManagementFrame.setLocationRelativeTo(null); // Centraliza a tela
                taskManagementFrame.add(new TelaGerenciamentoTarefasView());
                taskManagementFrame.setVisible(true);
            }
        });

        // Ação para o botão "Cancelar"
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Fecha a tela
            }
        });
    }

    // public static void main(String[] args) {
    // SwingUtilities.invokeLater(new Runnable() {
    // @Override
    // public void run() {
    // new TelaCadastroUsuarioView().setVisible(true);
    // }
    // });
    // }
}
