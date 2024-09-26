package com.example;

public class Main {
    public static void main(String[] args) {
       listExemplo list = new listExemplo();
       list.addNome("Maria");
       list.addNome("Joao");
       list.addNome("Pedro");
       list.listarNomes();
       list.modificarNome("Pedro", "mauricio");
       list.listarNomes();
       list.removerNome("mauricio");
       list.listarNomes();
    }
}