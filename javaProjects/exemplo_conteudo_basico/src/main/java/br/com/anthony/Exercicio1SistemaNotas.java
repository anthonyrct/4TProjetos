package br.com.anthony;

import java.util.Scanner;

public class Exercicio1SistemaNotas {
    double[] notas = new double[4];
    double mediaNotas = 0;
    boolean bonus = true;

    Scanner sc = new Scanner(System.in);

    public void calculoNotas(){
        //pega todas as notas dos alunos
        for (int i = 0; i < notas.length; i++) {
            System.out.println("digite a nota "+i+":");
            notas[i] = sc.nextDouble();
            //soma as notas na variavel media
            mediaNotas += notas[i];
            //invalida o bonus caso a nota seja menor que 9
            if(notas[i]<9){
                bonus = false;
            }
        }
        mediaNotas/=notas.length;

        //aplicando o bonus
        if(bonus==true){
            mediaNotas = (mediaNotas*1.1>10?mediaNotas=10:mediaNotas*1.1);
    }
    //prints para caso o usuario esteja, aprovado, de recuperação e reproavado
    if (mediaNotas>=7) {
        System.out.println("aprovado");
    } else if(mediaNotas>=5 && mediaNotas<7){
        System.out.println("recuperação");
    }
    else{
        System.out.println("reprovado");
    }
}
}
