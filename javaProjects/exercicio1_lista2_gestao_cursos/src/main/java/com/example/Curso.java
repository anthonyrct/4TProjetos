package com.example;

import java.util.List;
import java.util.ArrayList;


public class Curso {
    private String nomeCurso;
    private Professor professor;
    private List<Aluno> alunos;

    //construtor
    public Curso(String nomeCurso){
        this.nomeCurso = nomeCurso;
        alunos = new ArrayList<>();
    }



    //metodo para adicionar professor no curso
    public void addProfessor(Professor professor){
        this.professor = professor;
    }

    //metodo para adicionar alunos
    public void addAluno(Aluno aluno){
        alunos.add(aluno);
    }

    //metodo para lançar notas

    public void lancaNotas(String nomeAluno, double notaAluno){
        
    }





}
