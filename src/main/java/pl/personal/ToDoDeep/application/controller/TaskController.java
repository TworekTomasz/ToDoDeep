package pl.personal.ToDoDeep.application.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.personal.ToDoDeep.application.request.TaskRequest;
import pl.personal.ToDoDeep.application.response.TaskResponse;
import pl.personal.ToDoDeep.domain.services.TaskService;

@RestController
@RequestMapping("/task")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @PostMapping
    public ResponseEntity<TaskResponse> createTask(@RequestBody TaskRequest request) {
    taskService.createTask(request.toTask());
        return ResponseEntity.ok().build();
    }
}
