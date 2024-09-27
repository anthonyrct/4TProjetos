package com.example;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class JanelaCalculadora extends JFrame{
    public JanelaCalculadora() {
        super("Calculadora Avançada");
        this.setSize(300, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTabbedPane simples = new JTabbedPane();
        JTabbedPane cientifica = new JTabbedPane();
        simples.addTab(getTitle(), cientifica);
        cientifica.addTab(getTitle(), null, cientifica);
        this.add(cientifica);
        this.add(simples);

        this.setVisible(true);
    }
}
