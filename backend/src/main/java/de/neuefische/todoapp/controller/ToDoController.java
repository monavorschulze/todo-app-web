package de.neuefische.todoapp.controller;


import de.neuefische.todoapp.model.AddTodoData;
import de.neuefische.todoapp.model.Task;
import de.neuefische.todoapp.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class ToDoController {

    private final ToDoService toDoService;

    @Autowired
    public ToDoController(ToDoService toDoService){
        this.toDoService = toDoService;
    }

    @GetMapping("todo")
    public List<Task> getAllTodo(){
        return toDoService.getAllTasks();
    }

    /*
    @PutMapping
    public Task addTask(@RequestBody AddTodoData descriptionObject) {
        return toDoService.addDescription(descriptionObject.getDescription());
    }*/

}
