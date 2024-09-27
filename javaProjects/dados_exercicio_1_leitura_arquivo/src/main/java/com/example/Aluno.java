package com.example;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    // atributos
    private String nome;
    List<Double> notas = new ArrayList<>();
    double media = 0;

    public Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);
    }

    // metodo
    public double mediaNotas() {
        for (double nota : notas) {
            media += nota;
        }
         media /= notas.size();
         return media;
    }

    //metodo para pegar a maior nota do aluno
    public double maiorNota(){
        double maiorNota = 0;
        for (Double nota : notas) {
            if (nota>maiorNota) {
                maiorNota = nota;
            }
        }
        return maiorNota;
    }

    //metodo para pegar a menor nota do aluno
    public double menorNota(){
        double menorNota = 10;
        for (Double nota : notas) {
            if (menorNota>nota) {
                menorNota = nota;
            }
        }
        return menorNota;
    }
    public String getNome() {
        return nome;
    }
}
