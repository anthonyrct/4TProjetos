package com.example.Controller;

import com.example.Connection.TaskDAO;
import com.example.Model.Task;
import java.util.List;
public class TaskController {

    private TaskDAO taskDAO;

    public TaskController() {
        this.taskDAO = new TaskDAO();
    }

    // Adicionar uma nova tarefa
    public void addTask(Task task) {
        taskDAO.addTask(task);
    }

    // Obter todas as tarefas
    public List<Task> getAllTasks() {
        return taskDAO.getAllTasks();
    }

    // Atualizar o status da tarefa
    public void updateTaskStatus(int taskId, String newStatus) {
        taskDAO.updateTaskStatus(taskId, newStatus);
    }

    // Excluir uma tarefa
    public void deleteTask(int taskId) {
        taskDAO.deleteTask(taskId);
    }
}
