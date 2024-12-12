package pl.personal.ToDoDeep.domain.services;

import pl.personal.ToDoDeep.domain.entity.Task;

public class SimpleTaskService implements TaskService {

    @Override
    public void createTask(Task task) {
        System.out.println("Task created: " + task);
    }
}
