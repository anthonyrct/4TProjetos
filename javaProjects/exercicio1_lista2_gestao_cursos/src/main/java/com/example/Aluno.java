package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Aluno extends Pessoa implements Avaliavel{
    private String matricula;
    private double nota;
    private String nome;
    private String cpf;


    public Aluno(String nome, String cpf, String matricula, double nota) {
        super(nome, cpf);
        this.matricula = matricula;
        this.nota = nota;
    }

    @Override
    public void exibirInformacoes(){
        System.out.println();
        System.out.println("Nome: "+nome);
        System.out.println("Cpf: "+cpf);
        System.out.println("Matricula: "+matricula);
        System.out.println("nota: "+nota);
    }

    @Override
    public void avaliarDesempenho() {
       if (nota >= 7) {
        System.out.println("Aluno Aprovado!");
       }else if(nota >= 5 && nota <7){
        System.out.println("Aluno de Recuperacao!");
       }else{
        System.out.println("Aluno reprovado!");
       }
    }

}
