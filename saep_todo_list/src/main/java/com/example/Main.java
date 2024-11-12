package com.example;

import com.example.View.TelaCadastroUsuarioView;

public class Main {
    public static void main(String[] args) {
        // Chamando a tela de cadastro de usuário para abrir ao iniciar o aplicativo
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Inicia a tela de cadastro de usuário
                new TelaCadastroUsuarioView().setVisible(true);
            }
        });
    }
}