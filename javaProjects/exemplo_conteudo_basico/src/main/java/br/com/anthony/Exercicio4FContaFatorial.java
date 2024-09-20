package br.com.anthony;

import java.util.Scanner;

public class Exercicio4FContaFatorial {
    int numero = -1;
    Scanner sc = new Scanner(System.in);

    //calculo fatorial
    public long calculoFatorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }else{
            return n*calculoFatorial(n-1);
        }
    }

    //calcular o fatorial
    public void calculadora() throws Exception{
        System.out.println("Digite um numero para calcular o fatorial");
        numero = sc.nextInt();
        while (true) {
            if(numero<0){
                throw new Exception("o numero deve ser positivo");
            }
            
        try{

            System.out.println(calculoFatorial(numero));
        }catch(Exception e){
            System.out.println("numero invalido");
            numero = sc.nextInt();
        }
    }
}
}
