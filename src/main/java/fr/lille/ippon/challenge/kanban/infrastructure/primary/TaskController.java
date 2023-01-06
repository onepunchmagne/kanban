package fr.lille.ippon.challenge.kanban.infrastructure.primary;

import fr.lille.ippon.challenge.kanban.application.TaskApplicationService;
import fr.lille.ippon.challenge.kanban.domain.Task;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskApplicationService service;

    public TaskController(TaskApplicationService service) {
        this.service = service;
    }

    @GetMapping
    public List<Task> getTasks() {
        return service.getAll();
    }

}
