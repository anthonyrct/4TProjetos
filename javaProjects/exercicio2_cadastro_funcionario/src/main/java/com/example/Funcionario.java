package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Funcionario {
    // atributos
    private String nome;
    private int idade;
    private double salario;

    //metodo
    @Override
    public String toString(){
        return "nome: "+nome+", idade: "+idade+", salario: "+salario;
    }
}
