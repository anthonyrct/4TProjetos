package com.example.Model;

public class Revista extends ItemBiblioteca{
    
    public Revista(String titulo, String autor){
        super(titulo, autor);
    }

    @Override
    public int calcularPrazoEmprestimo(){
        return 12;
    }


    @Override
    public double calcularMulta(int diasAtraso){
        return diasAtraso *1.20;
    }
    // @Override
    // public void reservar(){
    //     System.out.println("a revista \"" + getTitulo()+ "\"foi reservada.");
    // }
}
