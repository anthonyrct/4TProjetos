package com.example.Model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String cpf;
    private List<ItemBiblioteca> itensEmprestados;

    public Usuario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.itensEmprestados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    // Empresta um item ao usuário
    public void emprestarItem(ItemBiblioteca item) {
        itensEmprestados.add(item);
        System.out.println("Item \"" + item.getTitulo() + "\" foi emprestado ao usuário " + nome);
    }

    // Devolve um item emprestado
    public void devolverItem(ItemBiblioteca item) {
        itensEmprestados.remove(item);
        System.out.println("Item \"" + item.getTitulo() + "\" foi devolvido.");
    }

    public List<ItemBiblioteca> getItensEmprestados() {
        return itensEmprestados;
    }
}
