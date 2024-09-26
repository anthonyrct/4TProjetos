package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysasListExemplo {
    private String[] nomes = {"Maria", "Joao","Pedro"};
    private List<String> nomeList;

    public ArraysasListExemplo(){
        nomeList = new ArrayList<>(Arrays.asList(nomes));
    }

    //metodo para adicionar
    public void addArray(String nome){
        try{
            nomes[3] = nome;
        }catch(Exception e){
            System.err.println(e);
        }
    }

    //metodo para adicionar no arrayDinamico

    public void addNome(String nome){
        nomeList.add(nome);
        System.out.println("nome adicionado com sucesso");
    }

    //metodo da lista

    public void listarNomes(){
        System.out.println(nomeList);
    }
}
