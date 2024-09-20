package com.example;

public class Aluno extends Pessoa{
    private String matricula;
    private String nome;
    private String cpf;
    
    public void exibirInformacoes(){
        @Override
        System.out.print("as informacoes do aluno sao: "+matricula+","+nome+","+cpf);
    }
}
