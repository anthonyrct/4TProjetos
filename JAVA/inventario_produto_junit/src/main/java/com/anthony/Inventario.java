package com.anthony;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    // atributo
    private List<Produto> list;

    // construtor
    public Inventario() {
        list = new ArrayList<>();
    }

    // metodos
    // adicionar
    public void adicionar(Produto produto) {
        list.add(produto);
    }

    // deletar/remover
    public void remover(Produto produto, int id) {
        list.removeIf(produtos -> produto.getId() == id);
    }
    //atualizar
   public void atualizar(int id, int quantidade, double preco){
    for (Produto produto : list) {
        if(produto.getId() == id){
            produto.setQuantidade(quantidade);
            produto.setPreco(preco);
            break;
        }
    }
   }
   //listar
   public List <Produto> Listar(){
    return new ArrayList<>(list);
   }
}
