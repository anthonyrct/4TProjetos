package com.example;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        FuncionarioController gerencia = new FuncionarioController();
        int operacao = 0;
        do {
            try {
                operacao = Integer.parseInt(JOptionPane.showInputDialog("\n"
                        + "----gerenciamento de funcionario-------- \n"
                        + "1 - Cadastrar Funcionario \n"
                        + "2 - Listar Funcionarios \n"
                        + "3 - Remover Funcionario \n"
                        + "4 - Calcular Média Salarial \n"
                        + "5 - Sair \n"));
            } catch (Exception e) {
                System.err.println(e);
                operacao = 0;
            }

            switch (operacao) {
                case 1:
                    String nome = JOptionPane.showInputDialog("digite o nome");
                    int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
                    double salario = Double.parseDouble(JOptionPane.showInputDialog("digite o salario"));
                    gerencia.addFuncionario(new Funcionario(nome, idade, salario));
                    break;
                case 2:
                    gerencia.listarFuncionarios();
                case 3:
                    String nomeF = JOptionPane.showInputDialog("informe o nome do usuairo que deseja remover");
                    gerencia.removerFuncionario(nomeF);
                    break;
                case 4:
                    gerencia.mediaSal();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Digite uma operacao valida");
                    break;
            }
        } while (operacao != 5);
    }
}