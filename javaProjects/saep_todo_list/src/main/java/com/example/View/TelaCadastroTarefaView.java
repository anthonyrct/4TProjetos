package com.example.View;

import com.example.Controller.TaskController;
import com.example.Model.Task;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastroTarefaView extends JFrame {

    private JTextField descricaoField, departamentoField;
    private JComboBox<String> prioridadeComboBox, statusComboBox;
    private JButton cadastrarButton, cancelarButton;
    private TaskController taskController;
    // private int userId;

    public TelaCadastroTarefaView(int userId) {
        // this.userId = userId;
        setTitle("Cadastro de Tarefa");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        taskController = new TaskController();

        // Layout
        setLayout(new GridLayout(6, 2, 10, 10));

        // Componentes da tela
        JLabel descricaoLabel = new JLabel("Descrição:");
        descricaoField = new JTextField();

        JLabel departamentoLabel = new JLabel("Departamento:");
        departamentoField = new JTextField();

        JLabel prioridadeLabel = new JLabel("Prioridade:");
        prioridadeComboBox = new JComboBox<>(new String[] { "baixa", "media", "alta" });

        JLabel statusLabel = new JLabel("Status:");
        statusComboBox = new JComboBox<>(new String[] { "a fazer", "fazendo", "pronto" });

        cadastrarButton = new JButton("Cadastrar");
        cancelarButton = new JButton("Cancelar");

        // Adicionando os componentes
        add(descricaoLabel);
        add(descricaoField);
        add(departamentoLabel);
        add(departamentoField);
        add(prioridadeLabel);
        add(prioridadeComboBox);
        add(statusLabel);
        add(statusComboBox);
        add(cadastrarButton);
        add(cancelarButton);

        // Ação do botão "Cadastrar"
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String descricao = descricaoField.getText();
                String departamento = departamentoField.getText();
                String prioridade = (String) prioridadeComboBox.getSelectedItem();
                String status = (String) statusComboBox.getSelectedItem();

                if (descricao.isEmpty() || departamento.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");
                    return;
                }

                // Criar nova tarefa
                Task task = new Task(userId, descricao, departamento, prioridade);

                // Adicionar a tarefa usando o Controller
                taskController.addTask(task);

                JOptionPane.showMessageDialog(null, "Tarefa cadastrada com sucesso!");

                // Limpar campos após o cadastro
                descricaoField.setText("");
                departamentoField.setText("");
                prioridadeComboBox.setSelectedIndex(0);
                statusComboBox.setSelectedIndex(0);

                dispose();
            }
        });

        // Ação do botão "Cancelar"
        cancelarButton.addActionListener(e -> dispose());
    }
}
