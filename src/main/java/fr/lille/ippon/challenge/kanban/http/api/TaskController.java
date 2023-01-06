package fr.lille.ippon.challenge.kanban.http.api;

import fr.lille.ippon.challenge.kanban.domain.Task;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @GetMapping
    public List<Task> getTasks() {
        // TODO faire fonctionner. Refactorer ?
        return List.of(new Task("my first task"));
    }

}
