package com.example;

public class Funcionario {
    //atributos
    private String nome;
    private String idade;
    private int salario;

    @Override
    public String toString(){
        return "Nome: "+nome+", idade: "+idade+", salario: "+salario;
    }
}
