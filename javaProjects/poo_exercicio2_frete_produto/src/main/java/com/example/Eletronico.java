package com.example;

public class Eletronico extends Produto implements Transportavel{
    // atributo
    private double volume;
    private double peso;

    public Eletronico(String nome, double preco, double volume) {
        super(nome, preco);
        this.volume = volume;
    }

   
    // metodo para calcular o peso
    @Override
    public double calcularPeso() {
        double peso = volume * 150;
        return peso;
    }

    // metodo para calcular o frete

    @Override
    public double calcularFrete(){
        double valorFrete = calcularPeso()* 1;
        return valorFrete; 
    }
}
