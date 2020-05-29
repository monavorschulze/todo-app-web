package de.neuefische.todoapp.db;

import de.neuefische.todoapp.model.Status;
import de.neuefische.todoapp.model.Task;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor

@Repository
public class TaskDb {

    
    private ArrayList<Task> tasks = new ArrayList<>();

    public TaskDb() {

        tasks.add(new Task("3", Status.OPEN, "Eat Steak"));
        tasks.add(new Task("3",Status.IN_PROGRESS,"I like fries"));
        tasks.add(new Task("3", Status.DONE, "Pizzaparty"));

    }
    
    public ArrayList<Task> getTasks(){
        return tasks;
    }

}
