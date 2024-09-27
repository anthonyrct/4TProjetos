package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class AlunoIOReader {
    String Arquivo = "C:\\Users\\DevTarde\\Documents\\Anthony Teixeira\\4TProjetos\\javaProjects\\dados_exercicio_1_leitura_arquivo\\arquivo.txt";
    List<Aluno> alunos;
    double mediaTurma = 0;

    // construtor
    public AlunoIOReader() {
        alunos = new ArrayList<>();
        readerFileIO();
    }

    public void readerFileIO() {
        try (BufferedReader br = new BufferedReader(new FileReader(Arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] conteudo = linha.split(",");
                Aluno aluno = new Aluno(
                        conteudo[0],
                        Double.parseDouble(conteudo[1]),
                        Double.parseDouble(conteudo[2]),
                        Double.parseDouble(conteudo[3]));
                alunos.add(aluno);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // metodo para calcular a media da turma
    public double mediaAlunos() {
        for (Aluno aluno : alunos) {
            mediaTurma += aluno.mediaNotas();
        }
        mediaTurma /= alunos.size();
        return mediaTurma;
    }

    // metodo para pegar o aluno com maior nota
    public String alunoComMaiorNota() {
        double maiorNota = 0;
        String nomeAluno = "";
        for (Aluno aluno : alunos) {
            if (maiorNota < aluno.maiorNota()) {
                maiorNota = aluno.maiorNota();
                nomeAluno = aluno.getNome();
            }
        }
        return "aluno com maior nota é: " + nomeAluno + "com: " + maiorNota + "de nota";
    }

    // metodo para pegar o aluno com menor nota

    public String alunoComMenorNota() {
        double menorNota = 10;
        String nomeAluno = "";
        for (Aluno aluno : alunos) {
            if (menorNota > aluno.menorNota()) {
                menorNota = aluno.menorNota();
                nomeAluno = aluno.getNome();
            }
        }
        return "aluno com menor nota é: " + nomeAluno + "com: " + menorNota + "de nota";
    }
}
