package com.example;

import java.util.ArrayList;
import java.util.List;

public class listExemplo {

    private List<String> nomes;

    public listExemplo() {
        nomes = new ArrayList<>();
    }

    // metodo para adicionar nomes

    public void addNome(String nome) {
        nomes.add(nome);
        System.out.println(nomes.lastIndexOf(nome));
    }

    // metodo para listar a lista
    public void listarNomes() {
        System.out.println(nomes);
    }

    // metodo para remover itens da lista
    public void removerNome(String nome) {
        try {
            nomes.remove(nome);
        } catch (Exception e) {
            System.err.println();
        }
    }

    // metodo para atualizar/modificar itens da lista

    public void modificarNome(String nomeAntigo, String nomeNovo) {
        try {
            int index = nomes.indexOf(nomeAntigo);
            nomes.set(index, nomeNovo);
            System.out.println("Nome Alterado com Sucesso");
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
