package com.example.ionicflutter.Service;


import com.example.ionicflutter.Models.Tasks;
import com.example.ionicflutter.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TasksService {

    private final TaskRepository taskRepository;

    @Autowired
    public TasksService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Tasks> getTasks(){

        return taskRepository.findAll();
    }
    public Tasks getTask(Long id){
        return taskRepository.findOneById(id);
    }
    public void DeleteTask(Long id){
        taskRepository.deleteById(id);
    }
    public Tasks PostTask(Tasks NewTask){
        return taskRepository.save(NewTask);
    }
    public Tasks UpdateTask(Long Id, Tasks UpdateTask) throws Exception {

        Tasks Task=taskRepository.findById(Id).orElseThrow(()->
                new Exception("Task Not Found for This ID :: "+Id) );
            Task.setItemName(UpdateTask.getItemName());
            Task.setItemCategory(UpdateTask.getItemCategory());
            Task.setItemDueDate(UpdateTask.getItemDueDate());
            Task.setItemPeriority(UpdateTask.getItemPeriority());
        final Tasks TaskUpdated = taskRepository.save(Task);
         return taskRepository.save(TaskUpdated);

    }
}
