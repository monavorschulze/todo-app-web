package Controller;


import model.Task;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ToDoController {

    @GetMapping("todo")
    public List<Task>getAllToDo(){
        return toDoService.getallToDo();
    }

}
