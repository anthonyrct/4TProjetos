package Exercicio_2_Gerenciamento_de_Cadastro_de_Funcionários;

import java.util.ArrayList;
import java.util.Scanner;

class Funcionario {
    String nome;
    int idade;
    double salario;

    // Construtor
    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }
}

public class GerenciarFuncionarios {
    private static ArrayList<Funcionario> funcionarios = new ArrayList<>(); // Lista de funcionários

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n1. Adicionar Funcionário");
            System.out.println("2. Remover Funcionário");
            System.out.println("3. Listar Funcionários");
            System.out.println("4. Calcular Média Salarial");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarFuncionario(scanner);
                    break;
                case 2:
                    removerFuncionario(scanner);
                    break;
                case 3:
                    listarFuncionarios();
                    break;
                case 4:
                    calcularMediaSalarial();
                    break;
                case 5:
                    System.out.println("Saindo do sistema.");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }

    // Método para adicionar um funcionário
    public static void adicionarFuncionario(Scanner scanner) {
        System.out.print("Digite o nome do funcionário: ");
        scanner.nextLine(); // Consumir a quebra de linha
        String nome = scanner.nextLine();
        System.out.print("Digite a idade do funcionário: ");
        int idade = scanner.nextInt();
        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        Funcionario novoFuncionario = new Funcionario(nome, idade, salario);
        funcionarios.add(novoFuncionario);
        System.out.println("Funcionário adicionado com sucesso!");
    }

    // Método para remover um funcionário pelo nome
    public static void removerFuncionario(Scanner scanner) {
        System.out.print("Digite o nome do funcionário a ser removido: ");
        scanner.nextLine(); // Consumir a quebra de linha
        String nome = scanner.nextLine();

        try {
            boolean encontrado = false;
            for (int i = 0; i < funcionarios.size(); i++) {
                if (funcionarios.get(i).nome.equalsIgnoreCase(nome)) {
                    funcionarios.remove(i);
                    System.out.println("Funcionário " + nome + " removido com sucesso!");
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                throw new Exception("Funcionário não encontrado.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Método para listar todos os funcionários cadastrados
    public static void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            System.out.println("\nLista de Funcionários:");
            for (Funcionario funcionario : funcionarios) {
                System.out.println("Nome: " + funcionario.nome + ", Idade: " + funcionario.idade + ", Salário: R$ "
                        + funcionario.salario);
            }
        }
    }

    // Método para calcular a média salarial dos funcionários
    public static void calcularMediaSalarial() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado para calcular a média salarial.");
        } else {
            double somaSalarios = 0;
            for (Funcionario funcionario : funcionarios) {
                somaSalarios += funcionario.salario;
            }
            double media = somaSalarios / funcionarios.size();
            System.out.printf("Média salarial dos funcionários: R$ %.2f%n", media);
        }
    }
}
