package com.example.Model;

import java.util.Date;

public class Task {
    private int id;                  // ID da tarefa
    private int userId;              // ID do usuário
    private String taskDescription;  // Descrição da tarefa
    private String departmentName;   // Nome do setor
    private String priority;         // Prioridade (baixa, média, alta)
    private Date dateCreated;        // Data de cadastro
    private String status;           // Status (a fazer, fazendo, pronto)

    // Construtor
    public Task(int userId, String taskDescription, String departmentName, String priority) {
        this.userId = userId;
        this.taskDescription = taskDescription;
        this.departmentName = departmentName;
        this.priority = priority;
        this.dateCreated = new Date(); // A data de cadastro é a data atual
        this.status = "a fazer";       // Status inicial é "a fazer"
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
