package com.example;

import com.example.Controller.BibliotecaController;
import com.example.Model.Livro;
import com.example.Model.MaterialEletronico;
import com.example.Model.Revista;
import com.example.Model.Usuario;
import com.example.View.BibliotecaView;

public class Main {
    public static void main(String[] args) {
        BibliotecaView view = new BibliotecaView();
        BibliotecaController controller = new BibliotecaController(view);

        // Adicionando alguns itens
        controller.adicionarItem(new Livro("java", "marcio"));
        controller.adicionarItem(new Revista("Science Monthly", "Jane Smith"));
        controller.adicionarItem(new MaterialEletronico("E-book Design Patterns", "Eric Gamma"));

        // Registrando usuário
        controller.registrarUsuario(new Usuario("carlos silva", "123456789"));

        // Executa o sistema
        controller.executarSistema();
    }
}