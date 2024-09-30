package com.example.View;

import java.util.Scanner;

public class BibliotecaView {
    private Scanner scanner;

    public BibliotecaView() {
        scanner = new Scanner(System.in);
    }

    // Método para exibir o menu principal
    public int mostrarMenu() {
        System.out.println("\n--- Menu Biblioteca ---");
        System.out.println("1. Listar itens disponíveis");
        System.out.println("2. Emprestar item");
        System.out.println("3. Devolver item");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    // Método para solicitar o nome do item a ser emprestado/devolvido
    public String solicitarNomeItem() {
        System.out.print("Digite o título do item: ");
        scanner.nextLine(); // Consumir o newline
        return scanner.nextLine();
    }

    // Método para solicitar o nome do usuário
    public String solicitarNomeUsuario() {
        System.out.print("Digite o nome do usuário: ");
        scanner.nextLine(); // Consumir o newline
        return scanner.nextLine();
    }

    // Método para solicitar o número de dias de atraso
    public int solicitarDiasAtraso() {
        System.out.print("Informe o número de dias de atraso (0 se não houver atraso): ");
        return scanner.nextInt();
    }

    // Exibir mensagem
    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public String solicitarCpfUsuario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'solicitarCpfUsuario'");
    }
}
