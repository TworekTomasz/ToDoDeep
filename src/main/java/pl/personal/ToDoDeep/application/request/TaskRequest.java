package pl.personal.ToDoDeep.application.request;

import pl.personal.ToDoDeep.domain.entity.Task;

public class TaskRequest {
    private String name;
    private String description;

    public Task toTask() {
        return Task.builder()
                .name(name)
                .description(description)
                .build();
    }
}
