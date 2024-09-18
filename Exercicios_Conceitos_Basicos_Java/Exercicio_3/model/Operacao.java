package Exercicio_3.model;

public abstract class Operacao {
    public abstract double calcular(double num1, double num2) throws Exception;
}

 public class Soma extends Operacao {
    public double calcular(double num1, double num2) {
        return num1 + num2;
    }
}

class Subtracao extends Operacao {
    public double calcular(double num1, double num2) {
        return num1 - num2;
    }
}

class Multiplicacao extends Operacao {
    public double calcular(double num1, double num2) {
        return num1 * num2;
    }
}

class Divisao extends Operacao {
    public double calcular(double num1, double num2) throws Exception {
        if (num2 == 0) {
            throw new ArithmeticException("Erro: Divisão por zero!");
        }
        return num1 / num2;
    }
}

class RaizQuadrada extends Operacao {
    public double calcular(double num1, double num2) throws Exception {
        if (num1 < 0) {
            throw new ArithmeticException("Erro: Raiz quadrada de número negativo!");
        }
        return Math.sqrt(num1);
    }

    public double calcular(double num1) throws Exception {
        if (num1 < 0) {
            throw new ArithmeticException("Erro: Raiz quadrada de número negativo!");
        }
        return Math.sqrt(num1);
    }
}
