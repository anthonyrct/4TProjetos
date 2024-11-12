package com.example.View;


import com.example.Controller.TaskController;
import com.example.Model.Task;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
public class TelaGerenciamentoTarefasView extends JPanel {

    private JTable taskTable;
    private DefaultTableModel tableModel;
    private TaskController taskController;
    private JButton updateStatusButton, deleteButton;

    public TelaGerenciamentoTarefasView() {
        // Inicializa o controller
        this.taskController = new TaskController();

        setLayout(new BorderLayout());

        // Criação da tabela
        tableModel = new DefaultTableModel(new Object[]{"ID", "Descrição", "Departamento", "Prioridade", "Status", "Data Cadastro"}, 0);
        taskTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(taskTable);
        add(scrollPane, BorderLayout.CENTER);

        // Botões
        JPanel buttonPanel = new JPanel();
        updateStatusButton = new JButton("Atualizar Status");
        deleteButton = new JButton("Excluir Tarefa");

        buttonPanel.add(updateStatusButton);
        buttonPanel.add(deleteButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // Ação do botão "Atualizar Status"
        updateStatusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = taskTable.getSelectedRow();
                if (selectedRow != -1) {
                    int taskId = (int) taskTable.getValueAt(selectedRow, 0);
                    String newStatus = JOptionPane.showInputDialog("Digite o novo status (a fazer, fazendo, pronto):");
                    if (newStatus != null && !newStatus.trim().isEmpty()) {
                        taskController.updateTaskStatus(taskId, newStatus);
                        refreshTaskList();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Selecione uma tarefa para atualizar o status.");
                }
            }
        });

        // Ação do botão "Excluir Tarefa"
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = taskTable.getSelectedRow();
                if (selectedRow != -1) {
                    int taskId = (int) taskTable.getValueAt(selectedRow, 0);
                    int response = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir esta tarefa?", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION);
                    if (response == JOptionPane.YES_OPTION) {
                        taskController.deleteTask(taskId);
                        refreshTaskList();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Selecione uma tarefa para excluir.");
                }
            }
        });

        // Carregar a lista de tarefas
        refreshTaskList();
    }

    // Atualizar a lista de tarefas na tabela
    private void refreshTaskList() {
        List<Task> tasks = taskController.getAllTasks();
        tableModel.setRowCount(0);  // Limpa a tabela

        for (Task task : tasks) {
            tableModel.addRow(new Object[]{
                    task.getId(),
                    task.getTaskDescription(),
                    task.getDepartmentName(),
                    task.getPriority(),
                    task.getStatus(),
                    task.getDateCreated()
            });
        }
    }
}
