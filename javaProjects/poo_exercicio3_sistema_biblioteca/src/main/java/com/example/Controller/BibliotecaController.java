package com.example.Controller;

import java.util.ArrayList;
import java.util.List;

import com.example.Model.ItemBiblioteca;
import com.example.Model.Livro;
import com.example.Model.Usuario;
import com.example.View.BibliotecaView;

public class BibliotecaController {
    private List<ItemBiblioteca> itensDisponiveis;
    private List<Usuario> usuarios;
    private BibliotecaView view;

    public BibliotecaController(BibliotecaView view) {
        this.view = view;
        this.itensDisponiveis = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void executarSistema() {
        boolean sair = false;
        while (!sair) {
            int opcao = view.mostrarMenu();

            switch (opcao) {
                case 1:
                    listarItensDisponiveis();
                    break;
                case 2:
                    realizarEmprestimo();
                    break;
                case 3:
                    realizarDevolucao();
                    break;
                case 4:
                    sair = true;
                    view.mostrarMensagem("Saindo do sistema...");
                    break;
                default:
                    view.mostrarMensagem("Opção inválida, tente novamente.");
            }
        }
    }

    private void listarItensDisponiveis() {
        if (itensDisponiveis.isEmpty()) {
            view.mostrarMensagem("Não há itens disponíveis no momento.");
        } else {
            view.mostrarMensagem("Itens disponíveis:");
            for (ItemBiblioteca item : itensDisponiveis) {
                view.mostrarMensagem("- " + item.getTitulo() + " (" + item.getAutor() + ")");
            }
        }
    }

    private void realizarEmprestimo() {
        String nomeUsuario = view.solicitarNomeUsuario();
        Usuario usuario = buscarUsuario(nomeUsuario);

        if (usuario == null) {
            view.mostrarMensagem("Usuário não encontrado. Registre o usuário primeiro.");
            return;
        }

        String tituloItem = view.solicitarNomeItem();
        ItemBiblioteca item = buscarItem(tituloItem);

        if (item == null) {
            view.mostrarMensagem("Item não encontrado ou não disponível.");
        } else {
            emprestarItem(usuario, item);
        }
    }

    private void realizarDevolucao() {
        String nomeUsuario = view.solicitarNomeUsuario();
        Usuario usuario = buscarUsuario(nomeUsuario);

        if (usuario == null) {
            view.mostrarMensagem("Usuário não encontrado.");
            return;
        }

        String tituloItem = view.solicitarNomeItem();
        ItemBiblioteca item = buscarItem(tituloItem);

        if (item == null) {
            view.mostrarMensagem("Item não encontrado.");
        } else {
            int diasAtraso = view.solicitarDiasAtraso();
            devolverItem(usuario, item, diasAtraso);
        }
    }

     // Novo método para registrar usuário
     private void registrarNovoUsuario() {
        String nome = view.solicitarNomeUsuario();
        String cpf = view.solicitarCpfUsuario();

        Usuario novoUsuario = new Usuario(nome, cpf);
        usuarios.add(novoUsuario);
        view.mostrarMensagem("Usuário registrado com sucesso!");
    }

    private Usuario buscarUsuario(String nomeUsuario) {
        for (Usuario u : usuarios) {
            if (u.getNome().equalsIgnoreCase(nomeUsuario)) {
                return u;
            }
        }
        return null;
    }

    private ItemBiblioteca buscarItem(String tituloItem) {
        for (ItemBiblioteca item : itensDisponiveis) {
            if (item.getTitulo().equalsIgnoreCase(tituloItem)) {
                return item;
            }
        }
        return null;
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void adicionarItem(ItemBiblioteca item) {
        itensDisponiveis.add(item);
    }

    public void emprestarItem(Usuario usuario, ItemBiblioteca item) {
        usuario.emprestarItem(item);
        itensDisponiveis.remove(item);
        view.mostrarMensagem("Item \"" + item.getTitulo() + "\" foi emprestado para " + usuario.getNome());
    }

    public void devolverItem(Usuario usuario, ItemBiblioteca item, int diasAtraso) {
        usuario.devolverItem(item);
        itensDisponiveis.add(item);
        double multa = item.calcularMulta(diasAtraso);
        view.mostrarMensagem("Item devolvido. Multa por atraso: R$ " + multa);
    }

}
