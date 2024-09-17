package Exercicio_3.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraView {
     private Scanner scanner;

    public CalculadoraView() {
        scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("\n1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Raiz Quadrada");
        System.out.println("6. Sair");
        System.out.print("Escolha uma opção: ");
        return obterInteiro();
    }

    public double obterNumero(String mensagem) {
        System.out.print(mensagem);
        return obterDouble();
    }

    public void mostrarResultado(double resultado) {
        System.out.printf("Resultado: %.2f%n", resultado);
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public int obterInteiro() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.next(); // Limpa a entrada inválida
            throw new InputMismatchException("Erro: Entrada inválida! Por favor, insira um número inteiro.");
        }
    }

    public double obterDouble() {
        try {
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            scanner.next(); // Limpa a entrada inválida
            throw new InputMismatchException("Erro: Entrada inválida! Por favor, insira um número.");
        }
    }
}
