package com.example.Model;

public class Usuario {

    private int id;
    private String name;
    private String email;
    private String password;

    // Construtor
    public Usuario(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // Getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
