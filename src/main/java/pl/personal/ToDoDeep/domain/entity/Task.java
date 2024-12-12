package pl.personal.ToDoDeep.domain.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import pl.personal.ToDoDeep.domain.enums.Priority;
import pl.personal.ToDoDeep.domain.enums.Status;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Getter
@Builder
@RequiredArgsConstructor
public class Task {

    private UUID id;
    private String name;
    private String description;
    private Status status;
    private LocalDate dueDate;
    private Priority priority;
    private Set<String> tags;
    private LocalDateTime creationDate;
    private LocalDateTime lastUpdateDate;
    private LocalDateTime completionDate;

}
