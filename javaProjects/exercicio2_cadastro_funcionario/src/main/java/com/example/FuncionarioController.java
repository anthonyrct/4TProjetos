package com.example;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioController {
    // atributos
    private List<Funcionario> funcionarios;

    public FuncionarioController() {
        funcionarios = new ArrayList<>();

    }

    // metodos

    // metodo para adicionar funcionarios

    public void addFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        System.out.println("Funcionario Adicionado com sucesso!");
    }

    // metodo para listar os funcionarios

    public void listarFuncionarios() {

        if (funcionarios.size() == 0) {
            System.out.println("lista Vazia");

        } else {
            for (Funcionario funcionario : funcionarios) {
                System.out.println(funcionario.toString());
            }

        }
    }

    // metodo para remover funcionarios pelo nome

    public void removerFuncionario(String nome) throws Exception {
        try {
            boolean encontrado = false;
            for (Funcionario funcionario : funcionarios) {
                if (funcionario.getNome().equalsIgnoreCase(nome)) {
                    funcionarios.remove(funcionario);
                    encontrado = true;
                }
            }
            if (!encontrado) {
                throw new Exception("Funcionario não encontrado");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
        boolean encontrado = false;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equalsIgnoreCase(nome)) {
                funcionarios.remove(funcionario);
                encontrado = true;
            }
        }
        if (!encontrado) {
            throw new Exception("Funcionario não encontrado");
        }
    }

    // metoo para calcular a media salarial

    public double mediaSal() {
        double mediaSal = 0;
        if (funcionarios.size() == 0) {
            return mediaSal;
        } else {
            for (Funcionario funcionario : funcionarios) {
                mediaSal += funcionario.getSalario();
            }
            return mediaSal / funcionarios.size();
        }
    }

}
