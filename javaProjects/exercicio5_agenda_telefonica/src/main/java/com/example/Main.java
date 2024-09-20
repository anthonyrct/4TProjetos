package com.example;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        AgendaTelefonica agenda = new AgendaTelefonica(5);
       int operador = 0;
        do {
            System.out.println("\n ------Agenda Telefonica------");
            System.out.println("1- adcionar Contato");
            System.out.println("2- listar Contato");
            System.out.println("3- buscar Contato(nome)");
            System.out.println("4- remover Contato(nome)");
            System.out.println("5- Sair...");
            operador = Integer.parseInt(JOptionPane.showInputDialog("Digite a operacao:"));
        
        
         switch(operador){
            case 1:
            try{
                
                String nome = JOptionPane.showInputDialog("digite o nome");
                String telefone = JOptionPane.showInputDialog("digite o telefone");
                Contato contato = new Contato(nome, telefone);
                agenda.addContato(contato);
                
            }catch(Exception e){
                System.out.println(e);
            }
            break;
            case 2 :
            agenda.listarContato();
            break;
            default:
            System.out.println("Opção invalida. tente novamente.");
        }
     } while (operador != 5);
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }