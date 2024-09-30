package com.example.Model;

public class Livro extends ItemBiblioteca{

    public Livro(String titulo, String autor) {
        super(titulo, autor);
    }

    @Override
    public int calcularPrazoEmprestimo(){
        return 14;
    }

    @Override
    public double calcularMulta(int diasAtraso){
        return diasAtraso *1.50;
    }

    // @Override
    // public void reservar(){
    //     System.out.println("O livro \"" + getTitulo()+ "\"foi reservado.");
    // }
}
