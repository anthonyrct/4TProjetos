package com.example;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Vendas vendas = new Vendas();
        String operacao;
        do {
            operacao = JOptionPane.showInputDialog(
                    "------- Gerenciamento de vendas --------\n"
                            + "1 - Cadastrar Venda\n"
                            + "2 - Listar Venda pelo cpf\n"
                            + "3 - Listar Vendas por cpf e Valor minimo\n"
                            + "4 - Sair\n");
            switch (operacao) {
                case "1":
                    String cpfVenda = JOptionPane.showInputDialog("informe o cpf do Cliente");
                    String nomeProduto = JOptionPane.showInputDialog(
                            "Informe o nome do produto");
                    double precoProduto = Double.parseDouble(JOptionPane.showInputDialog(
                            "informe o valor do produto"));
                    Produto produto = new Produto(nomeProduto, precoProduto);
                    vendas.CadastroVenda(cpfVenda, produto);
                    JOptionPane.showMessageDialog(null, "produto cadastrado com sucesso");
                    break;

                case "2":
                    String cpfCliente = JOptionPane.showInputDialog("informe o cpf do Cliente");
                    System.out.println(vendas.listarProdutos(cpfCliente));
                    break;

                    case "3":
                    String cpfCliente2 = JOptionPane.showInputDialog("informe o cpf do Cliente"
                    );
                    double valorMinimo = double.parseDouble(JOptionPane.showInputDialog(cpfCliente2)(
                    "informe o valor minimo da lista"));
                    try {
                        System.out.println(vendas.listarProdutosFiltro(cpfCliente2, valorMinimo));
                    } catch (Exception e) {
                        // TODO: handle exception
                    }



                default:
                    break;
            }
        } while (operacao != "4");
    }
}