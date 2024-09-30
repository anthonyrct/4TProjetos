package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Vendas {
    // atributos
    private Map<String, List<Produto>> vendasCpf;

    // construtor
    public Vendas() {
        vendasCpf = new HashMap<>();
    }


    //metodos


    //metodo para cadatrar a venda do produto
    public void CadastroVenda(String cpf, Produto p){
        for ( String cpfUsuario :vendasCpf.keySet()) {
            if (cpfUsuario.equals(cpf)) {
                List<Produto> produtosCpf = vendasCpf.get(cpf);
                produtosCpf.add(p);
                vendasCpf.put(cpf, produtosCpf);
                return;
            }
        }
    }
    List<Produto> produtosCPFVazio = new ArrayList<>();
    produtosCPFVazio.add(p);
    vendasCpf.put(cpf, produtosCPFVAZIO);


    //metodo para listar os produtos de um cpf
    public List<Produto> listarProdutos(String cpf){
        List<Produto> listaCpf = vendasCpf.getOrDefault(cpf, Collections.emptyList());
       return listaCpf;
    }

    //metodo para listar com filtro(ultilizando Stream)

    public List<Produto> listarProdutosFiltro(String cpf, double ValorMinimo) throws Exception{
        List<Produto> listaCpfFiltro = vendasCpf.getOrDefault(cpf, Collections.emptyList());
        if(listaCpfFiltro.isEmpty()){
            throw new Exception("o Cpf do usuario não foi encontrado.");
        }else{
            List<Produto> resultado = listaCpfFiltro.stream()
            .filter(p->p.getPreco()>=ValorMinimo);
            .collect(Collectors.toList());
            return resultado;
        }
    }

}
