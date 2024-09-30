package com.example.Model;

public abstract class ItemBiblioteca {
    //atributos
    private String titulo;
    private String autor;

    public ItemBiblioteca(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public abstract int calcularPrazoEmprestimo();

    public abstract double calcularMulta(int diasAtraso);

}
