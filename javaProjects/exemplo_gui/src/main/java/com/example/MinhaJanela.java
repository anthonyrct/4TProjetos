package com.example;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinhaJanela extends JFrame {
    public MinhaJanela() {
        super("janela principal");

        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        this.add(panel);

        JButton button = new JButton("Clique Aqui");
        panel.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Botão foi Clicado!");
            }
        });
        this.setVisible(true);
    }

}
