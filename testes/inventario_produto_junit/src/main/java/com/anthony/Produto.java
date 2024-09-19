package com.anthony;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Produto {
    // atributo
    private int id;
    private String nome;
    private int quantidade;
    private String categoria;
    private double preco;
}