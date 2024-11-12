package com.example.Controller;

import javax.swing.JOptionPane;
import com.example.Connection.UsuarioDAO;
import com.example.Model.Usuario;

public class UsuarioController {
    private UsuarioDAO usuarioDAO;

    public UsuarioController() {
        this.usuarioDAO = new UsuarioDAO();
    }

    // Método para cadastrar um usuário
    public void cadastrarUsuario(String name, String email, String password) {
        // Validações simples
        if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");
            return;
        }

        // Criação do objeto Usuario
        Usuario usuario = new Usuario(name, email, password);

        // Adiciona o usuário no banco de dados
        usuarioDAO.addUsuario(usuario);

        // Mensagem de sucesso
        JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
    }
}
