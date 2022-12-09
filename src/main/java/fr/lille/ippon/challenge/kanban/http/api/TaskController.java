package fr.lille.ippon.challenge.kanban.http.api;

import fr.lille.ippon.challenge.kanban.application.TaskService;
import fr.lille.ippon.challenge.kanban.domain.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @GetMapping("/api/tasks")
    public Collection<Task> getTasks() {
        return service.getTasks();
    }

}
