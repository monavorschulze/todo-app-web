package de.neuefische.todoapp.controller;

import de.neuefische.todoapp.model.Status;
import de.neuefische.todoapp.model.Task;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

class ToDoControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    /*
    @Test
    public void getTasksShouldReturnEmptyTasList(){
        //GIVEN

        //WHEN
        ResponseEntity<Task[]> response = restTemplate.getForEntity("http://localhost"+ port +"/tasks", Task[].class);
        HttpStatus statusCode = response.getStatusCode();
        Task[] tasks = response.getBody();

        //THEN
        assertEquals(HttpStatus.OK,statusCode);
        assertEquals(0,tasks.length);

    }

    @Test
    public void getTasksShouldReturnAllTasks(){
        //GIVEN

        ResponseEntity<Task> postResponse = restTemplate.postForEntity("http://localhost" + port + "/tasks", new Task("3", Status.OPEN,"Eat Steak"));
        assertEquals(HttpStatus.OK, postResponse.getStatusCode());
        assertEquals(new Task("3",Status.OPEN,"Eat Steak"), postResponse.getBody());

        //WHEN
        ResponseEntity<Task[]> response = restTemplate.getForEntity("http://localhost"+ port +"/tasks", Task[].class);
        HttpStatus statusCode = response.getStatusCode();
        Task[] tasks = response.getBody();

        //THEN
        assertEquals(HttpStatus.OK,statusCode);
        assertEquals(1,tasks.length);
        assertEquals(new Task("3", Status.OPEN, "Eat Steak"), tasks[0]);
    }*/

}