package fr.lille.ippon.challenge.kanban.application;

import fr.lille.ippon.challenge.kanban.domain.Task;
import fr.lille.ippon.challenge.kanban.domain.Tasks;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskApplicationService {

    private final Tasks repository;

    public TaskApplicationService(Tasks repository) {
        this.repository = repository;
    }

    public List<Task> getAll() {
        return repository.getAll();
    }
}
