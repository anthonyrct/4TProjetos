package com.example.Model;

public class MaterialEletronico extends ItemBiblioteca{
    
    public MaterialEletronico(String titulo, String autor) {
        super(titulo, autor);
    }


    @Override
    public int calcularPrazoEmprestimo(){
        return 7;
    }


    @Override
    public double calcularMulta(int diasAtraso){
        return diasAtraso *1.20;
    }
    // @Override
    // public void reservar(){
    //     System.out.println("o material \"" + getTitulo()+ "\"foi reservado.");
    // }
}
