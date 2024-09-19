package com.anthony;

public class Calculadora {
    //soma
    public int soma(int a, int b) {
        return a+b;    
    }
    //subtração
    public int subtracao(int a, int b){
        return a-b;
    }
    //multiplicacao
    public int multiplicacao(int a, int b){
        return a*b;
    }
    //divisao
    public double divisao(int a, int b){
        if(b!=0)
            return (double)a/b;
        else
            throw new IllegalArgumentException("Divisão por zero.");
    }
    //potencia
    public double potencia(double a, double b){
        return Math.pow(a, b);
    }
    //raiz quadrada
    // public double raizQuadrada(double a){
        
    // }
    //raiz
    public double raiz(double a, int b){
        if(b<=0){
            throw new IllegalArgumentException("Ordem da raiz precisa ser positiva.");
        }
        double raiz =1/b;
        if(a<0 && b%2==0){
            throw new ArithmeticException("nao");
        }
        double resultado = Math.pow(a, raiz);
        return resultado;
    }

}

