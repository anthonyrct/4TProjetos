package com.example.Connection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.example.Model.Task;

public class TaskDAO {

    // Adicionar uma nova tarefa
    public void addTask(Task task) {
        String sql = "INSERT INTO tasks (user_id, task_description, department_name, priority, status) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, task.getUserId());
            stmt.setString(2, task.getTaskDescription());
            stmt.setString(3, task.getDepartmentName());
            stmt.setString(4, task.getPriority());
            stmt.setString(5, task.getStatus());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Obter todas as tarefas
    public List<Task> getAllTasks() {
        List<Task> tasks = new ArrayList<>();
        String sql = "SELECT * FROM tasks";

        try (Connection conn = ConnectionFactory.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Task task = new Task(
                        rs.getInt("user_id"),
                        rs.getString("task_description"),
                        rs.getString("department_name"),
                        rs.getString("priority"));
                task.setId(rs.getInt("id"));
                task.setStatus(rs.getString("status"));
                task.setDateCreated(rs.getTimestamp("date_created"));
                tasks.add(task);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tasks;
    }

    // Deletar uma tarefa
    public void deleteTask(int id) {
        String sql = "DELETE FROM tasks WHERE id = ?";

        try (Connection conn = ConnectionFactory.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Atualizar o status de uma tarefa
    public void updateTaskStatus(int id, String status) {
        String sql = "UPDATE tasks SET status = ? WHERE id = ?";

        try (Connection conn = ConnectionFactory.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, status);
            stmt.setInt(2, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
