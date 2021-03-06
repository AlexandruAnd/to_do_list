package org.fasttrackit.service;

import org.fasttrackit.domain.Task;
import org.fasttrackit.persitance.TaskRepository;
import org.fasttrackit.transfer.CreateTaskRequest;
import org.fasttrackit.transfer.UpdateTaskRequest;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class TaskService {

    private TaskRepository taskRepository = new TaskRepository();
    // apply any other business logic in the service layer
    public void createTask (CreateTaskRequest request) throws IOException, SQLException, ClassNotFoundException {
        System.out.println("Creating task :" + request);
        taskRepository.createTask(request);
    }


    public void updateTask(long id, UpdateTaskRequest request) throws IOException, SQLException, ClassNotFoundException {
        System.out.println("Updateing task :" + id + " " + request);
        taskRepository.updateTask(id,request);
    }

    public void deleteTask(long id) throws IOException, SQLException, ClassNotFoundException {
        System.out.println("Deleting task :" + id);
        taskRepository.deleteTask(id);

    }
    public List<Task> getTasks() throws IOException, SQLException, ClassNotFoundException {
        System.out.println("Retrieving all tasks.");
        return taskRepository.getTasks();

    }


}
