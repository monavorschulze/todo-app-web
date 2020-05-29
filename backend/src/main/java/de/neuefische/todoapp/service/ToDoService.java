package de.neuefische.todoapp.service;

import de.neuefische.todoapp.db.TaskDb;
import de.neuefische.todoapp.model.Task;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ToDoService {

    private final TaskDb taskDb;

    @Autowired
    public ToDoService(TaskDb taskDb){
        this.taskDb = taskDb;
    }
/*
    public void addTask(Task task){
     taskDb.add(task);
    }*/

    public List<Task> getAllTasks() {
        return taskDb.getTasks();
    }

}
