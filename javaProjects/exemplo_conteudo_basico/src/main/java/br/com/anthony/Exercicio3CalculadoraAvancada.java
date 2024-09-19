package br.com.anthony;

import java.util.Scanner;

public class Exercicio3CalculadoraAvancada {
    double a;
    double b;
    double resultado;
    int escolha;// escolha da operacao

    Scanner sc = new Scanner(System.in);

    // criar metodo das operacoes
    // soma
    public double somar(double a, double b) {
        resultado = a + b;
        return a + b;
    }

    // subtracao
    public double subtrair(double a, double b) {
        resultado = a - b;
        return a - b;
    }

    // multiplicacao
    public double multiplicar(double a, double b) {
        resultado = a * b;
        return a * b;
    }

    // divisao
    public double dividir(double a, double b) {
        try {
            resultado = a / b;
        } catch (ArithmeticException e) {
            System.err.println(e);
        }
        return resultado;
    }

    // raiz
    public double raizQuadrada(double a) throws Exception {
        if (a < 0) {
            throw new Exception("Não existe raiz de Numero negativo");
        }
        try {
            resultado = Math.sqrt(a);
        } catch (Exception e) {
            System.err.println(e);
        }
        return resultado;
    }

    public void menu() {
        System.out.println("Calculadora");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Raiz Quadrada");
        System.out.println("6 - Sair");
    }
    //entrada de dados
    public void entradaDados(){
        if(escolha>=1 && escolha<5){
        System.out.println("digite o valor a:");
        a = sc.nextDouble();
        System.out.println("digite o valor b:");
        b = sc.nextDouble();
        }else if(escolha == 5){
            System.out.println("Digite o valor a:");
            a = sc.nextDouble();
        }else if(escolha == 6){
            System.out.println("Saindo...");
        }
        else{
            System.out.println("digite um valor valido");
        }
    }


    //metodo da calculadora
    public void calculadora() {
        do{
            menu();
            try{
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                entradaDados();
                somar(a, b);
                    break;

                    case 2:
                    entradaDados();
                    subtrair(a, b);
                        break;

                        case 3:
                    entradaDados();
                    multiplicar(a, b);
                        break;

                        case 4:
                    entradaDados();
                    dividir(a, b);
                        break;

                        case 5:
                    entradaDados();
                    raizQuadrada(a);
                        break;

                        case 6:
                        entradaDados();

                            break;

                        default:
                        break;
            }
            }catch(Exception e){
                System.err.println(e);
            }
        } 
        
        while(escolha !=6);
    }
}
    
