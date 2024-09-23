package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Pessoa {
    //atributos

    private String nome;
    private String cpf;

    //metodos
    public void exibirInformacoes(){
    System.out.println("nome do usuario: "+ nome+", cpf do usuario: "+cpf);
    }
}
