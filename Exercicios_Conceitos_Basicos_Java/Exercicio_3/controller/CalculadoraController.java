package Exercicio_3.controller;

import java.util.InputMismatchException;

import Exercicio_3.model.Operacao;
import Exercicio_3.view.CalculadoraView;

public class CalculadoraController {

    private CalculadoraView view;

    public CalculadoraController(CalculadoraView view) {
        this.view = view;
    }

    public void iniciar() {
        int opcao;

        do {
            opcao = view.mostrarMenu();
            try {
                if (opcao == 6) {
                    view.mostrarMensagem("Saindo do sistema.");
                    break;
                }

                double num1 = view.obterNumero("Digite o primeiro número: ");
                Operacao operacao = null;
                double resultado;

                switch (opcao) {
                    case 1:
                        operacao = new Soma();
                        double num2 = view.obterNumero("Digite o segundo número: ");
                        resultado = operacao.calcular(num1, num2);
                        view.mostrarResultado(resultado);
                        break;
                    case 2:
                        operacao = new Subtracao();
                        num2 = view.obterNumero("Digite o segundo número: ");
                        resultado = operacao.calcular(num1, num2);
                        view.mostrarResultado(resultado);
                        break;
                    case 3:
                        operacao = new Multiplicacao();
                        num2 = view.obterNumero("Digite o segundo número: ");
                        resultado = operacao.calcular(num1, num2);
                        view.mostrarResultado(resultado);
                        break;
                    case 4:
                        operacao = new Divisao();
                        num2 = view.obterNumero("Digite o segundo número: ");
                        resultado = operacao.calcular(num1, num2);
                        view.mostrarResultado(resultado);
                        break;
                    case 5:
                        operacao = new RaizQuadrada();
                        resultado = operacao.calcular(num1);
                        view.mostrarResultado(resultado);
                        break;
                    default:
                        view.mostrarMensagem("Opção inválida!");
                }

            } catch (InputMismatchException e) {
                view.mostrarMensagem(e.getMessage());
            } catch (ArithmeticException e) {
                view.mostrarMensagem(e.getMessage());
            } catch (Exception e) {
                view.mostrarMensagem("Erro: " + e.getMessage());
            }
        } while (true);
    }
}
