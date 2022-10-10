package com.example.ionicflutter.Controller;


import com.example.ionicflutter.Models.Tasks;
import com.example.ionicflutter.Service.TasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1")
@CrossOrigin(origins = "*")
public class TaskController {

    public final TasksService tasksService;

    @Autowired
    public TaskController(TasksService tasksService) {
        this.tasksService = tasksService;
    }
    @PostMapping(path = "/Tasks")
    public Tasks CreateTask(@RequestBody Tasks NewTask){
        tasksService.PostTask(NewTask);
        return NewTask;
    }
    @GetMapping(path="/Tasks")
    public List<Tasks> getTasks(){
        return tasksService.getTasks();

    }
    @GetMapping(path="/Tasks/{id}")
    public Tasks getTask(@PathVariable(value = "id") Long Id){
        return tasksService.getTask(Id);
    }
    @DeleteMapping(path="/Tasks/{id}")
    public void DeleteTask(@PathVariable(value = "id") Long Id){
        tasksService.DeleteTask(Id);
        System.out.println("work");
    }
    @PutMapping(path = "/Tasks/{id}")
    public Tasks UpdateTask(@PathVariable(value = "id")Long Id, @RequestBody Tasks UpdatedTask) throws Exception {
        tasksService.UpdateTask(Id,UpdatedTask);
        return UpdatedTask;
    }
}
