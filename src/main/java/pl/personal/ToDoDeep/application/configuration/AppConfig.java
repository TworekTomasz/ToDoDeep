package pl.personal.ToDoDeep.application.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.personal.ToDoDeep.domain.services.SimpleTaskService;
import pl.personal.ToDoDeep.domain.services.TaskService;

@Configuration
public class AppConfig {

    @Bean
    public TaskService taskService() {
        return new SimpleTaskService();
    }
}
