package pl.personal.ToDoDeep.domain.repositories;

import pl.personal.ToDoDeep.domain.entity.Task;

public interface TaskRepository {
    void saveTask(Task task);
}
