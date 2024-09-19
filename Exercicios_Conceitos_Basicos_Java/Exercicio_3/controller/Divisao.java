package Exercicio_3.controller;

import Exercicio_3.model.Operacao;

public class Divisao extends Operacao {
    public double calcular(double num1, double num2) throws Exception {
        if (num2 == 0) {
            throw new ArithmeticException("Erro: Divisão por zero!");
        }
        return num1 / num2;
    }
}
